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
   //   public ArrayList<String> topicsCounter; 
      
   //new part
      
      public String issues_url;
      public String commits_url;
      public String pulls_url;
      public String description;
 
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
    	  
    	  this.issues_url = "";
    	  this.commits_url = "";
    	  this.pulls_url="";
    	  this.description="";
    	  	  
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
      public ListTopicsRepos(String login,String name,String user_url, String html_url, String topicword, String issues_url, String commits_url, String pulls_url, String description ) {
    	  this.login = login;	
    	  this.name = name;
    	  this.user_url = user_url;
    	  this.html_url=html_url;
    	  this.topicword=topicword;
  //  	  this.topicsCounter=topicsCounter;
    	  
    	  this.issues_url = issues_url;
    	  this.commits_url = commits_url;
    	  this.pulls_url=pulls_url;
    	  this.description=description;
      }
      
}
