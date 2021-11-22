package controllers;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.ListRepositories;
import model.ListTopicsRepos;
import services.TopicsRepositoryFetching;

public class ModelsTest {
	
	
	
	
	TopicsRepositoryFetching topicsFetching = new TopicsRepositoryFetching();
	
	@Test
    public void topicTest() {
    	 ListTopicsRepos listTopics = new ListTopicsRepos("SecOps-Institute", "SecOps - Institute of Information Security",
    			 "37894354", "https://api.github.com/users/SecOps-Institute/repos",
    			 "0", "https://api.github.com/users/SecOps-Institute/subscriptions",
    			 "https://api.github.com/users/SecOps-Institute/orgs", "17",
    			 "https://avatars.githubusercontent.com/u/37894354?v=4"); 	   
    	 listTopics = new ListTopicsRepos("OOP", "Gitterefic", "36884354", "https://api.github.com/users/test-Institute/repos", "2", "https://api.github.com/users/SecOps-Institute/subscriptions", "https://api.github.com/users/SecOps-Institute/orgs", "17", "https://avatars.githubusercontent.com/u/37894354?v=4");
    	 List<ListTopicsRepos> listReposs= new ArrayList<>();
    	 listReposs.add(listTopics);
    	
    	 assertNotNull(listReposs);
    }
	
	
	//new
	@Test
    public void ListRepositoriesTest() throws Exception{
		
		
		String jsonString = "{ \"id\" : \n" +
                "      {\n" +
                "         \"firstName\": \"something\",\n" +
                "         \"lastName\" : \"something\"\n" +
                "      }\n" +
                "}";
    	
    	ObjectMapper mapper= new ObjectMapper();
    	JsonNode node = mapper.readTree(jsonString);
    	
    	 ListRepositories listRepos = new ListRepositories("SecOps-Institute", "SecOps - Institute of Information Security",
    			 "37894354", "https://api.github.com/users/SecOps-Institute/repos",
    			 "0", "https://api.github.com/users/SecOps-Institute/subscriptions",
    			 "https://api.github.com/users/SecOps-Institute/orgs", "17",
    			 node); 	   
    	 listRepos = new ListRepositories("OOP", "Gitterefic", "36884354", "https://api.github.com/users/test-Institute/repos", "2", "https://api.github.com/users/SecOps-Institute/subscriptions", "https://api.github.com/users/SecOps-Institute/orgs", "17", node);
    	 List<ListRepositories> listReposs= new ArrayList<>();
    	 listReposs.add(listRepos);
    	
    	 assertNotNull(listReposs);
    }
	//
	
	
	

}
