package services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;
import model.ListRepositories;
import model.UserRepos;

/**
 * 
 * @author maha_
 *
 */

public class RepositoryFetching {
    ListRepositories repository;
	
	static List<String> login = new ArrayList<String>();
        static List<String> name = new ArrayList<String>();
    	static List<String> url = new ArrayList<String>();
    	static List<String> issues_url = new ArrayList<String>();
    	static List<String> commits_url = new ArrayList<String>();
    
    public RepositoryFetching() {
    	this.repository = new ListRepositories();
    	
    }
    /**
     * @param repository constructor
     */
    public RepositoryFetching(ListRepositories repository) {
    	this.repository = repository;
    	
    }
   /**
    * @author piedamsel46_
    * @param data iterating the json data
    * @return the data fetched 
    * @throws InterruptedException Thrown when a thread is waiting, sleeping, or otherwise occupied
    * @throws ExecutionException Exception thrown when attempting to retrieve the result of a task that aborted by throwing an exception
    */
    String topicword="";
    public List<ListRepositories> getList(JsonNode data) throws InterruptedException, ExecutionException {
    	
		return StreamSupport.stream(data.get("items").spliterator(), false)
				.map(items -> new ListRepositories(items.get("owner").get("login").asText(), items.get("name").asText(),
						items.get("url").asText().replaceAll("http.*?\\s", " "), items.get("issues_url").asText(),
						items.get("visibility").asText(), items.get("commits_url").asText(),
						items.get("pulls_url").asText(), items.get("description").asText(), items.get("topics")))
				.collect(Collectors.toList());
    }
}
