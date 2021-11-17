package controllers;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import model.ListRepositories;
import model.ListRepoDetails;
import play.mvc.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.ws.*;
import play.mvc.Result;
import services.RepositoryFetching;
import services.IssueFetching;
import services.PullsFetching;
import services.CommitsFetching;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import views.html.*;

public class Application extends Controller implements WSBodyReadables {

	/**
	 * @author maha_ Rendering the repositories list
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

	public Result fetch(String query) throws InterruptedException, ExecutionException {
		List<ListRepositories> repos = new ArrayList<ListRepositories>();
		RepositoryFetching repoSearch = new RepositoryFetching();
		WSRequest request = ws.url("https://api.github.com/search/repositories")
				.addHeader("Content-Type", "application/json").addQueryParameter("q", query)
				.addQueryParameter("sort", "updated").addQueryParameter("order", "desc")
				.addQueryParameter("per_page", "10").addQueryParameter("page", "1");

		CompletionStage<JsonNode> jsonPromise = request.get().thenApply(x -> x.getBody(json()));
		repos = repoSearch.getList(jsonPromise.toCompletableFuture().get());
		this.query = query;
		return ok(index.render(repos));
	}

	/**
	 * @author junaid navigating to repository details
	 */
	private String issuesUrl, commitsUrl, pullsUrl, login, name, description, query;

	public Result navToRepositoryDetails(String issuesUrl, String commitsUrl, String pullsUrl, String login,
			String name, String description) throws InterruptedException, ExecutionException {
		this.issuesUrl = issuesUrl; this.commitsUrl = commitsUrl; this.pullsUrl = pullsUrl;
		this.login = login; this.name = name; this.description = description; this.query = query;
		return fetchIssues();
	}

	public Result fetchIssues() throws InterruptedException, ExecutionException {
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

	public Result fetchPulls() throws InterruptedException, ExecutionException {
		List<ListRepoDetails> pulls = new ArrayList<ListRepoDetails>();
		PullsFetching pullsService = new PullsFetching();
		System.out.println("URL IS = " + pullsUrl.replace("{/number}", ""));
		WSRequest request = ws.url(pullsUrl.replace("{/number}", "")).addHeader("Content-Type", "application/json")
				.addQueryParameter("sort", "updated").addQueryParameter("order", "desc")
				.addQueryParameter("per_page", "20").addQueryParameter("page", "1");

		CompletionStage<JsonNode> jsonPromise = request.get().thenApply(x -> x.getBody(json()));
		pulls = pullsService.getPulls(jsonPromise.toCompletableFuture().get());

		return ok(repository.render(pulls, login, name, description, "Pull Requests"));
	}

	public Result fetchCommits() throws InterruptedException, ExecutionException {
		List<ListRepoDetails> commits = new ArrayList<ListRepoDetails>();
		CommitsFetching commitService = new CommitsFetching();
		System.out.println("URL IS = " + commitsUrl.replace("{/sha}", ""));
		WSRequest request = ws.url(commitsUrl.replace("{/sha}", "")).addHeader("Content-Type", "application/json")
				.addQueryParameter("sort", "updated").addQueryParameter("order", "desc")
				.addQueryParameter("per_page", "20").addQueryParameter("page", "1");

		CompletionStage<JsonNode> jsonPromise = request.get().thenApply(x -> x.getBody(json()));
		commits = commitService.getCommits(jsonPromise.toCompletableFuture().get());

		return ok(repository.render(commits, login, name, description, "Commits"));
	}

	public Result back() throws InterruptedException, ExecutionException {
		this.issuesUrl = this.commitsUrl = this.pullsUrl = this.login = this.name = this.description = "";
		return fetch(query);
	}

}
