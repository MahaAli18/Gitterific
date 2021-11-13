package model;

/**
 * @author Waleed
 * Data to fetch from repository
 *
 */

public class ListTopicsRepos {
      public String login;
      public String name;
      public String user_url;
      public String html_url;
//      public String issues_url;
//      public String commits_url;
      
      public ListTopicsRepos() {
    	  this.login = "";
    	  this.name = "";
    	  this.user_url = "";
    	  this.html_url="";
//    	  this.issues_url = "";
//    	  this.commits_url = "";
    	  	  
      }
      /**
       * 
       * @param login
       * @param name
       * @param user_url
       * @param html_url
       */
      public ListTopicsRepos(String login,String name,String user_url, String html_url) {
    	  this.login = login;	
    	  this.name = name;
    	  this.user_url = user_url;
    	  this.html_url=html_url;
//    	  this.issues_url = issues_url; 
//    	  this.commits_url = commits_url;  
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
      
      public String gethtml_url() {
    	  return html_url;
      }
      
      public void sethtml_url() {
    	  this.html_url=html_url;
      }

      
/*      
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
*/
}
