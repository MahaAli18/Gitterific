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
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//import play.Application;
import controllers.Application;
import play.api.inject.guice.GuiceApplicationBuilder;
import play.api.test.CSRFTokenHelper;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.libs.ws.WSResponse;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import services.PullsFetching;
import services.UserFetching;

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
//import play.Application;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;




public class RoutingTest extends WithApplication {
	  
  
	/*
	//new part
	@Test
    public void  testFetchUser() {
        CompletableFuture<Result> result = (CompletableFuture<Result>) Application.fetchUsers("TheAlgorithms");
        try {
            Result r = result.get();
            assertEquals(OK, r.status());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	*/
	
	
	/*
	//new service test
	
	@Test
    public void extractUserTesting() {
		
		ArrayList<String> lst=new ArrayList<>();
    	lst.add("Random");
    	UsersList user=new UsersList("Fighter","Fighter",
    			"reponame","git","28","11",
    			"bot","bot","api","www.github.com/image");
    	
		UserFetching u1 = new UserFetching(user);
        
        final WSResponse wsResponseMock = Mockito.mock(WSResponse.class);
        Mockito.doReturn(200).when(wsResponseMock).getStatus();
        final String jsonStr = "{\"login\":\"MohammedContractor\",\"id\":54094664,\"node_id\":\"MDQ6VXNlcjU0MDk0NjY0\",\"avatar_url\":\"https://avatars.githubusercontent.com/u/54094664?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/MohammedContractor\",\"html_url\":\"https://github.com/MohammedContractor\",\"followers_url\":\"https://api.github.com/users/MohammedContractor/followers\",\"following_url\":\"https://api.github.com/users/MohammedContractor/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/MohammedContractor/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/MohammedContractor/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/MohammedContractor/subscriptions\",\"organizations_url\":\"https://api.github.com/users/MohammedContractor/orgs\",\"repos_url\":\"https://api.github.com/users/MohammedContractor/repos\",\"events_url\":\"https://api.github.com/users/MohammedContractor/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/MohammedContractor/received_events\",\"type\":\"User\",\"site_admin\":false,\"name\":null,\"company\":null,\"blog\":\"\",\"location\":null,\"email\":null,\"hireable\":null,\"bio\":null,\"twitter_username\":null,\"public_repos\":1,\"public_gists\":0,\"followers\":0,\"following\":1,\"created_at\":\"2019-08-14T05:59:45Z\",\"updated_at\":\"2021-10-31T16:30:26Z\"}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.readTree(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Mockito.doReturn(jsonNode)
            .when(wsResponseMock)
            .asJson();
        assertEquals(u1, UserFetching.getUsersList(wsResponseMock));
        //assertEquals(u1, UserFetching.getUsersList(jsonNode));
    }
	
	//
	
	*/
	
	
    @Test
	public void testListRepoDetails() {
		
    	ListRepoDetails rp =new ListRepoDetails("UltimateGamer","https://github.com/google/material-design-icons");
   		assertEquals(rp.title,"UltimateGamer");
   		assertEquals(rp.url,"https://github.com/google/material-design-icons");
		
	}
    
    @Test
   	public void testListRepoDetails_url() {
   		
   		ListRepoDetails rp =new ListRepoDetails("UltimateGamer","https://github.com/google/material-design-icons");
   		assertEquals(rp.title,"UltimateGamer");
   		assertEquals(rp.url,"https://github.com/google/material-design-icons");
   		
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
    
    	UserRepos user1=new UserRepos("abc","123","reponame","git","28","11","AI Project");
    	    	
    	assertEquals(user1.id,"abc");
    	assertEquals(user1.name,"123");
    	assertEquals(user1.login,"reponame");
    	assertEquals(user1.issues_url,"git");
    	assertEquals(user1.commits_url,"28");
    	assertEquals(user1.pulls_url,"11");
    	assertEquals(user1.description,"AI Project");
    	
    	

    }
//Routing Tests    
    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    
    
    @Test
    public void testTopicsView() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/topics?query=google");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    
    @Test
    public void testfetchResults() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/fetch?query=google");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    
    @Test
    public void testUsers() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/users/WaleedAhmed05");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    
    @Test
    public void testUserRepos() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/users/waleedAhmed05/repos");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    
    
    @Test
    public void testnavToRepositoryDetails() {
    	
    	String issuesUrl ="https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fissues%7B%2Fnumber%7D&";
        String commitsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fcommits%7B%2Fsha%7D&";
    	String pullsUrl= "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fpulls%7B%2Fnumber%7D&";
    	String login="andranikm97&";
    	String name="ggl-books-search&";
    	String description="A+simple+React+app+working+with+Google+Book+Search+API";
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/navToRepositoryDetails?"+"issuesUrl="+issuesUrl+"commitsUrl="+commitsUrl+
                		"pullsUrl="+pullsUrl+"login="+login+"name="+name+"description="+description);

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
 
   /* 
    @Test
    public void testfetchCommits() {
    	String issuesUrl ="https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fissues%7B%2Fnumber%7D&";
        String commitsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fcommits%7B%2Fsha%7D&";
    	String pullsUrl= "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fpulls%7B%2Fnumber%7D&";
    	String login="andranikm97&";
    	String name="ggl-books-search&";
    	String description="A+simple+React+app+working+with+Google+Book+Search+API";
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/navToRepositoryDetails?"+"issuesUrl="+issuesUrl+"commitsUrl="+commitsUrl+
                		"pullsUrl="+pullsUrl+"login="+login+"name="+name+"description="+description);
        //        .uri("/fetchPulls");
        
      //  request = new Http.RequestBuilder()
      //          .method(GET)
       //         .uri("/fetchCommits");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
   */
}