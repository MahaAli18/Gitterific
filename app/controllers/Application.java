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
	 * @author maha_
	 * Rendering the repositories list
	 */

	@Inject 
	WSClient ws;
	List<ListRepositories> get_repos = new ArrayList<ListRepositories>();
	List<ListTopicsRepos> topics = new ArrayList<ListTopicsRepos>();
	
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
	 * @author maha_
	 * @param query passing query to fetch the repository
	 * @return the list of repositories
	 * @throws InterruptedException thrown when a thread is waiting, sleeping, or otherwise occupied,and the thread is interrupted
	 * @throws ExecutionException thrown when attempting to retrieve the result of a task that aborted by throwing an exception
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


		CompletionStage<JsonNode> jsonPromise = request.get().thenApply(x->x.getBody(json()));
		if(get_repos.isEmpty()) {
			get_repos = repoSearch.getList(jsonPromise.toCompletableFuture().get());
		}
		else {
			get_repos.addAll(repoSearch.getList(jsonPromise.toCompletableFuture().get()));
		}


		return ok(index.render(get_repos));
	}

	/**
	 * @return users
	 * @throws InterruptedException error handling
	 * @throws ExecutionException thrown when attempting to retrieve the result of a taskthat aborted by throwing an exception
	 */
	public Result users() throws InterruptedException, ExecutionException {
		List<UsersList> userRepos = new ArrayList<UsersList>();
		return ok(views.html.users.render(userRepos));
	}

	/**
	 * @author maha_
	 * @param user fetching user Profile
	 * @return user profile
	 * @throws InterruptedException thrown when a thread is waiting, sleeping, or otherwise occupied,and the thread is interrupted
	 * @throws ExecutionException thrown when attempting to retrieve the result of a taskthat aborted by throwing an exception
	 */

	public Result fetchUsers(String user) throws InterruptedException, ExecutionException{
		List<UsersList> userProfile  = new ArrayList<UsersList>();
		UserFetching userSearch = new UserFetching();
		WSRequest request = ws.url("https://api.github.com/users/"+user)
				.addHeader("Content-Type", "application/json");
		CompletionStage<JsonNode> jsonData = request.get().thenApply(x->x.getBody(json()));
		userProfile  = userSearch.getUsersList(jsonData.toCompletableFuture().get());
		return ok(views.html.users.render(userProfile));
	}
	
	/**
	 * @return user repos 
	 * @throws InterruptedException error handling
	 * @throws ExecutionException thrown when attempting to retrieve the result of a taskthat aborted by throwing an exception
	 */

	public Result users_repos() throws InterruptedException, ExecutionException {
		List<UserRepos> user_repos = new ArrayList<UserRepos>();
		return ok(views.html.user_repos.render(user_repos));
	}

	/**
	 * @author maha_
	 * @param user fetching repositories from user profile
	 * @return user profile repositories
	 * @throws InterruptedException thrown when a thread is waiting, sleeping, or otherwise occupied,and the thread is interrupted
	 * @throws ExecutionException thrown when attempting to retrieve the result of a taskthat aborted by throwing an exception
	 */

	public Result fetchUsersRepos(String user) throws InterruptedException, ExecutionException{
		List<UserRepos> user_repos_fetch  = new ArrayList<UserRepos>();
		UserReposFetch userSearch = new UserReposFetch();
		WSRequest request = ws.url("https://api.github.com/users/"+user+"/repos")
				.addHeader("Content-Type", "application/json");
		CompletionStage<JsonNode> jsonData = request.get().thenApply(x->x.getBody(json()));
		user_repos_fetch  = userSearch.getUsersReposList(jsonData.toCompletableFuture().get());
		return ok(views.html.user_repos.render(user_repos_fetch));
	}
	
	
	/**
	 * @return topics repositories 
	 * @throws InterruptedException error handling
	 * @throws ExecutionException thrown when attempting to retrieve the result of a taskthat aborted by throwing an exception
	 */
	
	
	public Result topics() throws InterruptedException, ExecutionException { 
		  List<ListTopicsRepos> topics = new ArrayList<ListTopicsRepos>();
		  return ok(views.html.topics.render(topics));
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
	
	
	
	
	
}