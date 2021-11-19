package model;

import java.util.ArrayList;

/**
 * @author Waleed
 * @version 1.0
 * @since 8-Nov-2021
 */


/**
 * ListTopicsRepos- Fetching topics name, url, owner_url and topics list.
 *
 */
public class ListTopicsRepos {
	/** login for saving owner name */
      public String login;
      /** name for saving Repo name */
      public String name;
      /** user_url for owner profile link */
      public String user_url; 
      /** for Repo URL */
      public String html_url; 
      /** for storing single topic */
      public String topicword; 
      /** for storing multiple topics */
      public ArrayList<String> topicsCounter; 
//      public String issues_url;
//      public String commits_url;
 
      /**
       * ListTopicsRepos() for passing login, name, user_url, html_url
       */
      
      
      public ListTopicsRepos() {
    	  this.login = "";
    	  this.name = "";
    	  this.user_url = "";
    	  this.html_url="";
    	  this.topicword="";
    //	  this.topicsCounter=;
    	  
//    	  this.issues_url = "";
//    	  this.commits_url = "";
    	  	  
      }
      /**
       * constructor for ListTopicsRepos
       * @param login - For fetching Owner
       * @param name - For Repository Name
       * @param user_url - For Owner URL
       * @param html_url - For Repository URL
       * @param topicword = For Single topic
       * @param topicsCounter = For Multiple topics
       */
      public ListTopicsRepos(String login,String name,String user_url, String html_url, String topicword, ArrayList<String> topicsCounter) {
    	  this.login = login;	
    	  this.name = name;
    	  this.user_url = user_url;
    	  this.html_url=html_url;
    	  this.topicword=topicword;
    	  this.topicsCounter=topicsCounter;
      }
      
      
      /**
       * GetUser name
       * @return username
       */
      public String getUser() {
    	  return name;
      }
      
      /**
       * SetUser name
       */
      public void setUser() {
    	  this.name = name;
      }
      
      
      /**
       * Getlogin name
       * @return Owner name
       */
      public String getlogin() {
    	  return login;
      }
      
      /**
       * Setlogin login
       */
      
      public void setlogin() {
    	  this.login = login;
      }
      
      /**
       * Gethtml_url Repo Url
       * @return Repo Url
       */
      
      public String gethtml_url() {
    	  return html_url;
      }
      
      
      /**
       * Sethtml_url html_url
       */
      public void sethtml_url() {
    	  this.html_url=html_url;
      }
      /**
       * Gettopicword single topic word
       * @return topic word
       */
      
      public String gettopicword() {
    	  return topicword;
      }
      
      
      /**
       * Settopicword word
       */
      public void settopicword() {
    	  this.topicword=topicword;
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
