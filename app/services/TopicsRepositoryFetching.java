package services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import com.fasterxml.jackson.databind.JsonNode;
import model.ListTopicsRepos;

/**
 * @author waleed
 * @version 1.0
 */

public class TopicsRepositoryFetching {
    ListTopicsRepos repository;
    //new
//    TopicsCollector topicCollector;
    
/**
 * TopicRepositoryFetching
 */
    public TopicsRepositoryFetching() {
    	this.repository = new ListTopicsRepos();
    	//new
    //	this.topicCollector= new TopicsCollector();
    	
    }
    
    
    /**
     * @param repository -Passing model's ListTopicsRepos
     */
    public TopicsRepositoryFetching(ListTopicsRepos repository) {
    	this.repository = repository;
   
    	
    }
   /**
    * @author Waleed
    * @param data- iterating the json data for fetching topics
    * @return results
    * @throws InterruptedException - If any interruption occurs
    * @throws ExecutionException - If any exceptions in execution
    */
    
    public List<ListTopicsRepos> getList(JsonNode data) throws InterruptedException, ExecutionException {
    	
    	List<ListTopicsRepos> repos = new ArrayList<ListTopicsRepos>();
    //	List<TopicsCollector> topiclist = new ArrayList<TopcsCollector>();
    	
    	ArrayList<String> topicsCounter = new ArrayList<String>();
    	
    	
    	
    	data.get("items").forEach(items -> {
    		String login = items.get("owner").get("login").asText();
    		String name = items.get("name").asText();
    		String user_url = items.get("url").asText().replaceAll("http.*?\\s", " ");
    		String html_url = items.get("html_url").asText().replaceAll("http.*?\\s", " ");
    	
    		
    		
    		//items.get("topics").
    		
    		//testing part...
    		data.forEach(topics -> {
    			String topicword = topics.asText();
    			topicsCounter.add((topicword));
    			//topicsCounter.add(topics.get(0).asText());
    		});
    		
    		
    		
    		
    		
    		/* working but wrong results
    		 
    		items.get("topics").forEach(topics -> {
    			String topicword = topics.asText();
    			topicsCounter.add((topicword));
    			//topicsCounter.add(topics.get(0).asText());
    		});
    		
    		
    		
    		 */
    		
    		//topicsCounter.add(items.get("topics").get(0).asText());
    		
    		
    		String topicword = items.get("topics").get(0).asText();
    
    		
    		String issues_url = items.get("issues_url").asText();
    		String commits_url = items.get("commits_url").asText();
    		String pulls_url = items.get("pulls_url").asText();
    		String description = items.get("description").asText();
    		repos.add(new ListTopicsRepos(login,name,user_url,html_url,topicword,topicsCounter,issues_url,commits_url,pulls_url,description));
    	});
		return repos;
    	
    }
}
