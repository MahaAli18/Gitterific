package model;
/**
 *
 * @author maha_
 *  UsersList declares variables
 *  login user login id
 *  name user name in profile
 *  id  user profile unique id
 *  repository url of the current repository
 *  followers users followers
 *  following user profile following other profiles
 *  subscription all the subscription list
 *  organization the current organization
 *  public_repos all the repositories that are not private
 *  avatar_url profile of the user
 */
public class UsersList {
	public String login;
	public String name;
	public String id;
	public String repository;
	public String followers;
	public String following;
	public String subscription;
	public String organization;
	public String public_repos;
	public String avatar_url;


	public UsersList() {
		this.login = "";
		this.name="";
		this.id= "";
		this.repository="";
		this.followers="";
		this.following = "";
		this.subscription = "";
		this.organization= "";
		this.public_repos="";
		this.avatar_url="";

	}

	/**
	 * @param login user login id
	 * @param name user name in profile
	 * @param id  user profile unique id
	 * @param repository url of the current repository
	 * @param followers users followers
	 * @param following user profile following other profiles
	 * @param subscription all the subscription list
	 * @param organization the current organization
	 * @param public_repos all the repositories that are not private
	 * @param avatar_url profile of the user
	 */

	public UsersList(String login, String name, String id, String repository, String followers, String following, String subscription, String organization, String public_repos, String avatar_url) {
		this.login = login;
		this.name= name;
		this.id= id;
		this.repository= repository;
		this.followers= followers;
		this.following = following;
		this.subscription = subscription;
		this.organization= organization;
		this.public_repos=public_repos;
		this.avatar_url=avatar_url;

	}

}
