package services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import com.fasterxml.jackson.databind.JsonNode;
import model.UsersList;

/**
 * @author maha_
 */

public class UserFetching {
	UsersList users;

	public UserFetching() {
		this.users = new UsersList();

	}
	
	/**
	 * @param users to list the profile of the person
	 */

	public UserFetching(UsersList users) {
		this.users = users;

	}

	/**
	 * @param data passed in json node format
	 * @return list of profile details array
	 * @throws InterruptedException Thrown when a thread is waiting, sleeping, or otherwise occupied
	 * @throws ExecutionException Exception thrown when attempting to retrieve the result of a taskthat aborted by throwing an exception.
	 */
	public List<UsersList> getUsersList(JsonNode data) throws InterruptedException, ExecutionException {

		List<UsersList> users = new ArrayList<UsersList>();

		String login = data.get("login").asText();
		String name = data.get("name").asText();
		String id = data.get("id").asText();
		String repository = data.get("repos_url").asText();
		String followers = data.get("followers_url").asText();
		String following = data.get("following_url").asText();
		String subscription = data.get("subscriptions_url").asText();
		String organization = data.get("organizations_url").asText();
		String public_repos = data.get("public_repos").asText();
		String avatar_url = data.get("avatar_url").asText();
		users.add(new UsersList(login,name,id,repository,followers, following, subscription, organization, public_repos, avatar_url));
		return users;

	}
}
