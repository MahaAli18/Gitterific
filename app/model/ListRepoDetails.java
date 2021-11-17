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

      public String getTitle() {
    	  return title;
      }
      
      public void setTitle(String title) {
    	  this.title = title;
      }
      
      public String getUrl() {
    	  return url;
      }
      
      public void setUrl(String url) {
    	  this.url = url;
      }
}
