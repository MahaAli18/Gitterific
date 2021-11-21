package controllers;
import akka.actor.ActorSystem;

import akka.stream.Materializer;
import model.ListRepoDetails;
import model.ListRepositories;
import model.ListTopicsRepos;
import model.UserRepos;
import model.UsersList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.Application;
import play.api.inject.guice.GuiceApplicationBuilder;
import play.api.test.CSRFTokenHelper;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import services.PullsFetching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;
import static play.inject.Bindings.bind;
import static play.test.Helpers.*;

import org.junit.Test;
import play.Application;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;
public class RoutingTest extends WithApplication {
	
	
    
   
   
   
    
    @Test
	public void testListRepoDetails() {
		
		ListRepoDetails rp=new ListRepoDetails();
		rp.setTitle("Gitterific");
		assertEquals(rp.getTitle(),"Gitterific");
		
	}
    
    @Test
   	public void testListRepoDetails_url() {
   		
   		ListRepoDetails rp=new ListRepoDetails();
   		rp.setUrl("https://github.com/google/material-design-icons");
   		assertEquals(rp.getUrl(),"https://github.com/google/material-design-icons");
   		
   	}

    
    
    
    @Test
    public void testListRepositories() throws Exception {
    	
    	ArrayList<String> lst=new ArrayList<>();
    	lst.add("Random");
    	
    	
    	String jsonString = "{ \"id\" : \n" +
                "      {\n" +
                "         \"firstName\": \"something\",\n" +
                "         \"lastName\" : \"something\"\n" +
                "      }\n" +
                "}";
    	
    	ObjectMapper mapper= new ObjectMapper();
    	JsonNode node = mapper.readTree(jsonString);
    	
    	ListRepositories ListRep=new ListRepositories("UltimateGamer",
    			"UltimateGamer",
    			"https://api.github.com/users/89z",
    			"https://api.github.com/repos/89z/mech/issues",
    			"public",
    			"https://api.github.com/repos/89z/mech/commits",
    			"https://api.github.com/repos/89z/mech/pulls",
    			"simple AI Project",node);
    	
    	assertEquals(ListRep.login,"UltimateGamer");
    	assertEquals(ListRep.name,"UltimateGamer");
    	assertEquals(ListRep.user_url,"https://api.github.com/users/89z");    	
    	assertEquals(ListRep.issues_url,"https://api.github.com/repos/89z/mech/issues");
    	assertEquals(ListRep.visibility,"public");       	
    	assertEquals(ListRep.commits_url,"https://api.github.com/repos/89z/mech/commits");
    	assertEquals(ListRep.pulls_url,"https://api.github.com/repos/89z/mech/pulls");
    	assertEquals(ListRep.description,"simple AI Project");
    	assertEquals(ListRep.topicword,null);    	

    }
        
    
    @Test
    public void testListTopicsRepos_getUser() {
    	
    	ArrayList<String> lst=new ArrayList<>();
    	lst.add("Random");
    	ListTopicsRepos lr=new ListTopicsRepos("UltimateGamer","UltimateGamer","https://api.github.com/users/89z"
    			, "https://github.com/users/89z", "api", "https://api.github.com/repos/89z/mech/issues"
    			,"https://api.github.com/repos/89z/mech/commits","https://api.github.com/repos/89z/mech/pulls","simple AI Project");
    	
    	assertEquals(lr.login,"UltimateGamer");
    	assertEquals(lr.name,"UltimateGamer");
    	assertEquals(lr.user_url,"https://api.github.com/users/89z");
    	assertEquals(lr.html_url,"https://github.com/users/89z");
    	assertEquals(lr.topicword,"api");
    	assertEquals(lr.issues_url,"https://api.github.com/repos/89z/mech/issues");
    	assertEquals(lr.commits_url,"https://api.github.com/repos/89z/mech/commits");
    	assertEquals(lr.pulls_url,"https://api.github.com/repos/89z/mech/pulls");
    	assertEquals(lr.description,"simple AI Project");
    	
    	  	

    }

    
    @Test
    public void Test_UsersList1() {
    	
    	ArrayList<String> lst=new ArrayList<>();
    	lst.add("Random");
    	UsersList user=new UsersList("Fighter","Fighter",
    			"reponame","git","28","11",
    			"bot","bot","api","www.github.com/image");
    	
    	
    	
    	assertEquals(user.login,"Fighter");
    	assertEquals(user.name,"Fighter");
    	assertEquals(user.id,"reponame");
    	assertEquals(user.repository,"git");
    	assertEquals(user.followers,"28");
    	assertEquals(user.following,"11");
    	assertEquals(user.subscription,"bot");
    	assertEquals(user.organization,"bot");
    	assertEquals(user.public_repos,"api");
    	assertEquals(user.avatar_url,"www.github.com/image");
    	

    }
    @Test
    public void Test_UserRepos1() {
    	
    	ArrayList<String> lst=new ArrayList<>();
    
    	UserRepos user1=new UserRepos("abc","123","reponame","git","28","11","AI Project");
    	
    	
    	
    	assertEquals(user1.id,"abc");
    	assertEquals(user1.name,"123");
    	assertEquals(user1.login,"reponame");
    	assertEquals(user1.issues_url,"git");
    	assertEquals(user1.commits_url,"28");
    	assertEquals(user1.pulls_url,"11");
    	assertEquals(user1.description,"AI Project");
    	
    	

    }
    
    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    
    
    
    
    
   
}