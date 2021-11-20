package controllers;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import model.ListRepositories;
import play.mvc.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.ws.*;
import play.mvc.Result;
import services.RepositoryFetching;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import views.html.*;

public class Application extends Controller implements WSBodyReadables {
	
	/**
	 * @author maha_
	 * Rendering the repositories list
	 */
	
	@Inject 
	WSClient ws;
	 public Result index() throws InterruptedException, ExecutionException {
		 List<ListRepositories> repos = new ArrayList<ListRepositories>();
		 return ok(index.render(repos));
	    }
	 
	/**
	 * @author maha_
	 * @param query passing query to fetch the repository
	 * @return the list of repositories
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */

	public Result fetch(String query) throws InterruptedException, ExecutionException{
		List<ListRepositories> repos = new ArrayList<ListRepositories>();
		RepositoryFetching repoSearch = new RepositoryFetching();
		WSRequest request = ws.url("https://api.github.com/search/repositories")
		        .addHeader("Content-Type", "application/json")
			.addQueryParameter("q", query)
	               .addQueryParameter("sort", "updated")
	               .addQueryParameter("order", "desc")
	               .addQueryParameter("per_page", "10")
	               .addQueryParameter("page", "1");
		
			
		CompletionStage<JsonNode> jsonPromise = request.get().thenApply(x->x.getBody(json()));
		repos = repoSearch.getList(jsonPromise.toCompletableFuture().get());
		
		return ok(index.render(repos));
	}
	/**
	 * Fetch the issues from github rest api asynchronously by calling
	 * {@link #queryApi(Query query) querApi} on a different thread using
	 * <code>CompletableFuture.supplyAsync</code> method and then redirects the
	 * fetched results 
	 * <code>CompletableFuture.thenApply </code>
	 * 
	 * @return CompletableFuture of type Result
	 * @author kavleen kour
	 *
	 */
	public Result fetchIssues1() throws InterruptedException, ExecutionException {
			List<ListRepoDetails> issues = new ArrayList<ListRepoDetails>();
			IssueFetching issueService = new IssueFetching();
			System.out.println("URL IS = " + issuesUrl.replace("{/number}", ""));
			WSRequest request = ws.url(issuesUrl.replace("{/number}", "")).addHeader("Content-Type", "application/json")
					.addQueryParameter("sort", "updated").addQueryParameter("order", "desc")
					.addQueryParameter("per_page", "20").addQueryParameter("page", "1");

			CompletionStage<JsonNode> jsonPromise = request.get().thenApply(x -> x.getBody(json()));
			issues = issueService.getIssues(jsonPromise.toCompletableFuture().get());
			return ok(repository.render(issues, login, name, description, "Issues"));
		}

	
}
