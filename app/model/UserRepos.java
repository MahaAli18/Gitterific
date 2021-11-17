package model;

/**
 * 
 * @author maha_
 *
 */
public class UserRepos {
	  public String repos_url;
	  public String name;

      
      public UserRepos() {

          this.repos_url="";
          this.name="";
  
      }
      
      /**
       * @param repos_url repository list
       * @param name repositories unique name
       */
      public UserRepos(String repos_url, String name) {
          this.repos_url= repos_url;
          this.name = name;

      }
      
}
