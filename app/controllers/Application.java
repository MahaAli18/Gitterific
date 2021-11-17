package controllers;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import model.ListRepositories;
import model.ListTopicsRepos;
import model.UserRepos;
import model.UsersList;
import play.mvc.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.ws.*;
import play.mvc.Result;
import services.RepositoryFetching;
import services.TopicsRepositoryFetching;
import services.UserFetching;
import services.UserReposFetch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import views.html.*;

/**
 * Controller for query functionality
 * @author maha_
 *
 */

public class Application extends Controller implements WSBodyReadables {

	/**
	 * Rendering the repositories list
	 */
	
	@Inject 
	WSClient ws;
	 public Result index() throws InterruptedException, ExecutionException {
		 List<ListRepositories> repos = new ArrayList<ListRepositories>();
		 return ok(index.render(repos));
		 }

	  public Result topics() throws InterruptedException, ExecutionException { 
		  List<ListTopicsRepos> topics = new ArrayList<ListTopicsRepos>();
		  return ok(views.html.topics.render(topics));
		  }

	 	 
	List<ListRepositories> get_repos = new ArrayList<ListRepositories>();
	
	/**
	 * @return repos 
	 * @throws InterruptedException error handling
	 * @throws ExecutionException thrown when attempting to retrieve the result of a taskthat aborted by throwing an exception
	 */

	public Result index() throws InterruptedException, ExecutionException {
		List<ListRepositories> repos = new ArrayList<ListRepositories>();
		get_repos = new ArrayList<ListRepositories>();
		return ok(index.render(repos));
	}

	/**
	 * @param query passing query to fetch the repository
	 * @return the list of repositories
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */	 
	 
	public Result fetch(String query) throws InterruptedException, ExecutionException{

		RepositoryFetching repoSearch = new RepositoryFetching();
		WSRequest request = ws.url("https://api.github.com/search/repositories")
				
				
				   .addHeader("Content-Type", "application/json")
	               .addQueryParameter("q", query)
	               .addQueryParameter("sort", "updated")
	               .addQueryParameter("order", "desc")
	               .addQueryParameter("per_page", "10")
	               .addQueryParameter("page", "1");
		
		
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
	 * @author WaleedAhmed05
	 * @param query - topic keyword
	 * @return list of Json data
	 * @throws InterruptedException - If any interruption occurs
	 * @throws ExecutionException - If any exceptions in execution
	 */
	public Result topics(String query) throws InterruptedException, ExecutionException{
		List<ListTopicsRepos> topics = new ArrayList<ListTopicsRepos>();
		TopicsRepositoryFetching topicsRepoSearch = new TopicsRepositoryFetching();
		WSRequest request = ws.url("https://api.github.com/search/repositories")
								
				   .addHeader("Content-Type", "application/json")
	               .addQueryParameter("q", "topic:"+query)
	               .addQueryParameter("sort", "updated")
	               .addQueryParameter("order", "desc")
	               .addQueryParameter("per_page", "10")
	               .addQueryParameter("page", "1");
		
		
		CompletionStage<JsonNode> jsonPromise = request.get().thenApply(x->x.getBody(json()));
		
		topics = topicsRepoSearch.getList(jsonPromise.toCompletableFuture().get());
		
		return ok(views.html.topics.render(topics));
	}
	
	
}//application