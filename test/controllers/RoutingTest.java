package controllers;
import model.ListRepoDetails;
import model.ListRepositories;
import model.ListTopicsRepos;
import model.UserRepos;
import model.UsersList;
import org.junit.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import services.IssueFetching;
import services.RepositoryFetching;
import services.TopicsRepositoryFetching;
import services.UserFetching;
import services.UserReposFetch;

import java.util.ArrayList;
import static play.test.Helpers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;




public class RoutingTest extends WithApplication {
	
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

		String issuesUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fissues%7B%2Fnumber%7D&";
		String commitsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fcommits%7B%2Fsha%7D&";
		String pullsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fpulls%7B%2Fnumber%7D&";
		String login = "andranikm97&";
		String name = "ggl-books-search&";
		String description = "A+simple+React+app+working+with+Google+Book+Search+API";

		Http.RequestBuilder request = new Http.RequestBuilder().method(GET)
				.uri("/navToRepositoryDetails?" + "issuesUrl=" + issuesUrl + "commitsUrl=" + commitsUrl + "pullsUrl="
						+ pullsUrl + "login=" + login + "name=" + name + "description=" + description);

		Result result = route(app, request);
		assertEquals(OK, result.status());
	}
    
    @Test
    public void testRepositoryFetching() {
    	ListRepositories lr = new ListRepositories();
    	RepositoryFetching r1 = new RepositoryFetching(lr);
    	RepositoryFetching r2 = new RepositoryFetching(lr);
    	assertNotEquals(r1, r2);
    }
    
    @Test
    public void testUserReposServices() {
    	UsersList ur = new UsersList();
    	UserFetching r1 = new UserFetching(ur);
    	UserFetching r2 = new UserFetching(ur);
    	assertNotEquals(r1, r2);
    }
    
    @Test
    public void testTopicsRepositoryFetching() {
    	ListTopicsRepos ur = new ListTopicsRepos();
    	TopicsRepositoryFetching r1 = new TopicsRepositoryFetching(ur);
    	TopicsRepositoryFetching r2 = new TopicsRepositoryFetching(ur);
    	assertNotEquals(r1, r2);
    }
    
    @Test
    public void testUserReposFetch() {
    	UserRepos ur = new UserRepos();
    	UserReposFetch r1 = new UserReposFetch(ur);
    	UserReposFetch r2 = new UserReposFetch(ur);
    	assertNotEquals(r1, r2);
    }
    
    @Test
    public void testIssueFetching() {
    	ListRepoDetails ur = new ListRepoDetails();
    	IssueFetching r1 = new IssueFetching(ur);
    	IssueFetching r2 = new IssueFetching(ur);
    	assertNotEquals(r1, r2);
    }
 
    
    @Test
	public void testfetchisuues() {

		String issuesUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fissues%7B%2Fnumber%7D&";
		String commitsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fcommits%7B%2Fsha%7D&";
		String pullsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fpulls%7B%2Fnumber%7D&";
		String login = "andranikm97&";
		String name = "ggl-books-search&";
		String description = "A+simple+React+app+working+with+Google+Book+Search+API";

		      Http.RequestBuilder request = new Http.RequestBuilder().method(GET)

				.uri("/navToRepositoryDetails?" + "issuesUrl=" + issuesUrl + "commitsUrl=" + commitsUrl + "pullsUrl="
						+ pullsUrl + "login=" + login + "name=" + name + "description=" + description);

		          route(app, request);


		Http.RequestBuilder request1 = new Http.RequestBuilder().method(GET).uri("/fetchIssues");

		   Result result2 = route(app, request1);
		   assertEquals(OK, result2.status());
	}
    
    @Test
	public void testfetchpulls() {

		String issuesUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fissues%7B%2Fnumber%7D&";
		String commitsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fcommits%7B%2Fsha%7D&";
		String pullsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fpulls%7B%2Fnumber%7D&";
		String login = "andranikm97&";
		String name = "ggl-books-search&";
		String description = "A+simple+React+app+working+with+Google+Book+Search+API";

		Http.RequestBuilder request = new Http.RequestBuilder().method(GET)

				.uri("/navToRepositoryDetails?" + "issuesUrl=" + issuesUrl + "commitsUrl=" + commitsUrl + "pullsUrl="
						+ pullsUrl + "login=" + login + "name=" + name + "description=" + description);

		route(app, request);


		Http.RequestBuilder request1 = new Http.RequestBuilder().method(GET).uri("/fetchPulls");

		Result result2 = route(app, request1);
		assertEquals(OK, result2.status());
	}
    
    @Test
	public void testfetchcommits() {

		String issuesUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fissues%7B%2Fnumber%7D&";
		String commitsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fcommits%7B%2Fsha%7D&";
		String pullsUrl = "https%3A%2F%2Fapi.github.com%2Frepos%2Fandranikm97%2Fggl-books-search%2Fpulls%7B%2Fnumber%7D&";
		String login = "andranikm97&";
		String name = "ggl-books-search&";
		String description = "A+simple+React+app+working+with+Google+Book+Search+API";

		Http.RequestBuilder request = new Http.RequestBuilder().method(GET)

				.uri("/navToRepositoryDetails?" + "issuesUrl=" + issuesUrl + "commitsUrl=" + commitsUrl + "pullsUrl="
						+ pullsUrl + "login=" + login + "name=" + name + "description=" + description);

		route(app, request);


    	ListRepoDetails rp =new ListRepoDetails("UltimateGamer","https://github.com/google/material-design-icons");
   		assertEquals(rp.title,"UltimateGamer");
   		assertEquals(rp.url,"https://github.com/google/material-design-icons");
		Http.RequestBuilder request1 = new Http.RequestBuilder().method(GET).uri("/fetchCommits");

		Result result2 = route(app, request1);
		assertEquals(OK, result2.status());
	}
}