package controllers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.UserRepos;
import model.UsersList;
import services.UserFetching;

/**
 * 
 * @author maha_
 *
 */
public class userTest {
	
	UsersList userObj = new UsersList();
	UserFetching userFetch = new UserFetching();
	
	@Test
    public void userTest() {
    	 UsersList user = new UsersList("SecOps-Institute", "SecOps - Institute of Information Security", "37894354", "https://api.github.com/users/SecOps-Institute/repos", "0", "0", "https://api.github.com/users/SecOps-Institute/subscriptions", "https://api.github.com/users/SecOps-Institute/orgs", "17", "https://avatars.githubusercontent.com/u/37894354?v=4"); 	   
    	 user = new UsersList("maha", "Gitterefic", "36884354", "https://api.github.com/users/test-Institute/repos", "2", "8", "https://api.github.com/users/SecOps-Institute/subscriptions", "https://api.github.com/users/SecOps-Institute/orgs", "17", "https://avatars.githubusercontent.com/u/37894354?v=4");
    	 List<UsersList> usersList= new ArrayList<>();
    	 usersList.add(user);
    	
    	 assertNotNull(usersList);
    }
	
	@Test
    public void userReposTest() {
    	 UserRepos user_repos = new UserRepos("381885449", "adminlte-dist", "lakuapik", "https://api.github.com/repos/lakuapik/adminlte-dist/issues{/number}", "https://api.github.com/repos/lakuapik/cctv-jakarta/commits{/sha}","https://api.github.com/repos/lakuapik/ctf-natas/pulls{/number}", "CTF Natas from Overthewire");
    	 user_repos = new UserRepos("3818877449", "data", "mike", "https://api.github.com/repos/mile/data/issues{/number}", "https://api.github.com/repos/lakuapik/cctv-jakarta/commits{/sha}","https://api.github.com/repos/lakuapik/ctf-natas/pulls{/number}", "CTF Natas from Overthewire");
    	 List<UserRepos> userReposist= new ArrayList<>();
    	 userReposist.add(user_repos);
    	
    	 assertNotNull(userReposist);
    }
	
	@Test
	public void testJsonUserList() throws JsonMappingException, JsonProcessingException {
		 UsersList user = new UsersList("SecOps-Institute", "SecOps - Institute of Information Security", "37894354", "https://api.github.com/users/SecOps-Institute/repos", "0", "0", "https://api.github.com/users/SecOps-Institute/subscriptions", "https://api.github.com/users/SecOps-Institute/orgs", "17", "https://avatars.githubusercontent.com/u/37894354?v=4"); 	
		 List<UsersList> usersList= new ArrayList<>();
    	 usersList.add(user);
    	 String jsonString = "{\"login\":\"SecOps-Institute\",\"name\":\"SecOps - Institute of Information Security\" ,\"id\":\"SecOps - 37894354\" }";

         ObjectMapper mapper = new ObjectMapper();
         
         JsonNode node = mapper.readTree(jsonString);
         assertNotNull(node);
	}
	
	@Test
	public void testLogin() {
		String expected = "SecOps-Institute";
		userObj.setLogin("SecOps-Institute");
		assertEquals(expected, userObj.getlogin());
		
	}
	
	@Test
	public void testId() {
		String expected = "102";
		userObj.setId("102");
		assertEquals(expected, userObj.getId());
		
	}
	
	@Test
	public void testSubscription() {
		String expected = "https://api.github.com/users/SecOps-Institute/subscriptions";
		userObj.setsubscription("https://api.github.com/users/SecOps-Institute/subscriptions");
		assertEquals(expected, userObj.getsubscription());
		
	}
	
	

}
