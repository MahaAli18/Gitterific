package model;

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
      public String topicword;
      
      public ListRepositories() {
    	  this.login = "";
    	  this.name = "";
    	  this.user_url = "";
    	  this.issues_url = "";
    	  this.visibility="";
    	  this.commits_url = "";
    	  this.topicword="";
    	  	  
      }
   /**
    * 
    * @param login user id
    * @param name on profile
    * @param user_url profile link
    * @param issues_url issues of repos
    * @param visibility visiblity of repos
    * @param commits_url commits on profile
    * @param topicword fetches topics
    */
      public ListRepositories(String login,String name,String user_url, String issues_url,String visibility, String commits_url, String topicword) {
    	  this.login = login;	
    	  this.name = name;
    	  this.user_url = user_url;
    	  this.issues_url = issues_url; 
    	  this.visibility=visibility;
    	  this.commits_url = commits_url;  
    	  this.topicword=topicword;
      }
      public String getvisibility() {
    	  return visibility;
      }
      
      public String getUser() {
    	  return name;
      }
      
      public void setUser() {
    	  this.name = name;
      }
      
      public String getlogin() {
    	  return login;
      }
      
      public void setlogin() {
    	  this.login = login;
      }
      
      public String getissues_url() {
    	  return issues_url;
      }
      
      public void setissues_url() {
    	  this.issues_url = issues_url;
      }
      
      public String getcommits_url() {
    	  return commits_url;
      }
      
      public void setcommits_url() {
    	  this.commits_url = commits_url;
      }
}
