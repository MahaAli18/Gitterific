package services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;

import model.ListRepoDetails;
import model.UserRepos;

/**
 * @author maha_
 *
 */

public class UserReposFetch {
	UserRepos users;

	public UserReposFetch() {
		this.users = new UserRepos();

	}

	/**
	 * @param users repositories constructor
	 */

	public UserReposFetch(UserRepos users) {
		this.users = users;

	}

	/**
	 * @param data passed in json node format
	 * @return list of profile details array
	 * @throws InterruptedException Thrown when a thread is waiting, sleeping, or
	 *                              otherwise occupied
	 * @throws ExecutionException   Exception thrown when attempting to retrieve the
	 *                              result of a taskthat aborted by throwing an
	 *                              exception.
	 */

	public List<UserRepos> getUsersReposList(JsonNode data) throws InterruptedException, ExecutionException {

		
		
	
		
		
		return StreamSupport.stream(data.spliterator(), false)
				.map(item -> new UserRepos(item.get("id").asText(), item.get("name").asText(),
						item.get("owner").get("login").asText(), item.get("issues_url").asText(),
						item.get("commits_url").asText(), item.get("pulls_url").asText(),
						item.get("description").asText()))
				.collect(Collectors.toList());
		
		
		

	}
}
