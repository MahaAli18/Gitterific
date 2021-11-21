package model;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author maha_
 * Data to fetch from repository
 *
 */

public class ListRepositories {
      public String login;
      public String name;
      public String user_url;
      public String issues_url;
      public String visibility;
      public String commits_url;
      public String pulls_url;
  	  public String description;
      public String topicword;
      
      public ListRepositories() {
    	  this.login = "";
    	  this.name = "";
    	  this.user_url = "";
    	  this.issues_url = "";
    	  this.visibility="";
    	  this.commits_url = "";
    	  this.pulls_url = "";
  		  this.description = "";	  
      }
   /**
    * 
    * @param login user id
    * @param name on profile
    * @param user_url profile link
    * @param issues_url issues of repos
    * @param visibility visiblity of repos
    * @param commits_url commits on profile
    * @param pulls_url
	* @param description
    * @param topicword fetches topics
    */
      public ListRepositories(String login,String name,String user_url, String issues_url,String visibility, String commits_url, String pulls_url, String description, JsonNode topicword) {
    	  this.login = login;	
    	  this.name = name;
    	  this.user_url = user_url;
    	  this.issues_url = issues_url; 
    	  this.visibility=visibility;
    	  this.commits_url = commits_url;  
    	  this.pulls_url = pulls_url;
  		  this.description = description;
    	  try {
			this.topicword=topicword.get(0).asText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		    
		}
      }
      
    
}
