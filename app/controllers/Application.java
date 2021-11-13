package controllers;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import model.ListRepositories;
import model.ListTopicsRepos;
import play.mvc.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.ws.*;
import play.mvc.Result;
import services.RepositoryFetching;
import services.TopicsRepositoryFetching;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import views.html.*;

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

	 
	 
	 
	 
	 
	/**
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