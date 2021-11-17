package services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;
import model.ListRepoDetails;

/**
 * 
 * @author junaid
 *
 */

public class CommitsFetching {
	ListRepoDetails commits;

	public CommitsFetching() {
		this.commits = new ListRepoDetails();

	}

	/**
	 * @param commits
	 */
	public CommitsFetching(ListRepoDetails commits) {
		this.commits = commits;

	}

	public List<ListRepoDetails> getCommits(JsonNode data) throws InterruptedException, ExecutionException {
		
		return StreamSupport.stream(data.spliterator(), false)
				.map(item -> new ListRepoDetails(item.get("commit").get("message").asText(), ""))
				.collect(Collectors.toList());

	}
}
