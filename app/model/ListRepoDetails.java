package model;

/**
 * @author junaid
 *
 */

public class ListRepoDetails {
      public String title;
      public String url;

      public ListRepoDetails() {
    	  this.title = "";
    	  this.url = "";
    	  	  
      }

      public ListRepoDetails(String title,String url) {
    	  this.title = title;
    	  this.url = url;
      }

}
