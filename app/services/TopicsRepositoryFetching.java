package services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import com.fasterxml.jackson.databind.JsonNode;
import model.ListTopicsRepos;
import model.TopicsCollector;




/**
 * @author waleed
 *
 */

public class TopicsRepositoryFetching {
    ListTopicsRepos repository;
    //new
    TopicsCollector topicCollector;
    
    public TopicsRepositoryFetching() {
    	this.repository = new ListTopicsRepos();
    	//new
    //	this.topicCollector= new TopicsCollector();
    	
    }
    
    
    /**
     * @param repository
     */
    public TopicsRepositoryFetching(ListTopicsRepos repository) {
    	this.repository = repository;
   
    	
    }
   /**
    * @author Waleed
    * @param data iterating the json data
    * @return the data fetched
    * @throws InterruptedException
    * @throws ExecutionException
    */
    
    public List<ListTopicsRepos> getList(JsonNode data) throws InterruptedException, ExecutionException {
    	
    	List<ListTopicsRepos> repos = new ArrayList<ListTopicsRepos>();
    //	List<TopicsCollector> topiclist = new ArrayList<TopcsCollector>();
    	
    	
    	
    	data.get("items").forEach(items -> {
    		String login = items.get("owner").get("login").asText();
    		String name = items.get("name").asText();
    		String user_url = items.get("url").asText().replaceAll("http.*?\\s", " ");
    		String html_url = items.get("html_url").asText().replaceAll("http.*?\\s", " ");
    		
    		//testing part...
    		
    		
    		String topicword = items.get("topics").get(0).asText();
    	//	String issues_url = items.get("issues_url").toString();
    	//	String commits_url = items.get("commits_url").toString();
    		repos.add(new ListTopicsRepos(login,name,user_url,html_url,topicword));
    	});
		return repos;
    	
    }
}
