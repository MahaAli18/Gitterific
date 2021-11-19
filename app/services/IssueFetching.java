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

public class IssueFetching {
	ListRepoDetails issues;

	public IssueFetching() {
		this.issues = new ListRepoDetails();

	}

	/**
	 * @param issues
	 */
	public IssueFetching(ListRepoDetails issues) {
		this.issues = issues;

	}

	public List<ListRepoDetails> getIssues(JsonNode data) throws InterruptedException, ExecutionException {

		return StreamSupport.stream(data.spliterator(), false)
				.map(item -> new ListRepoDetails(item.get("title").asText(), item.get("url").asText()))
				.collect(Collectors.toList());
	}
}
