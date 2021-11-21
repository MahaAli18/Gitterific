package model;

/**
 * @author kavleen
 *
 */
public class StatsDetails {
    public String title;
    public String url;

    public StatsDetails() {
  	  this.title = "";
  	  this.url = "";
  	  	  
    } 
    public StatsDetails(String title,String url) {
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

    
