package model;

/**
 * 
 * @author maha_
 *
 */
public class UserRepos {
	/**
	 * user unique id
	 * name of the user
	 * login id of user
	 * issues in profile
	 * commits url
	 * pulls request
	 * description of the repository
	 */
	public String id;
	public String name;
	public String login;
	public String issues_url;
	public String commits_url;
	public String pulls_url;
	public String description;

	public UserRepos() {

		this.id = "";
		this.name = "";

	}
	
	/**
	 * @param id user unique id
	 * @param name of the user
	 * @param login id of user
	 * @param issues_url in profile
	 * @param commits_url in profile
	 * @param pulls_url pulls request
	 * @param description of repos
	 */

	public UserRepos(String id, String name, String login, String issues_url, String commits_url,
			String pulls_url, String description) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.issues_url = issues_url;
		this.commits_url = commits_url;
		this.pulls_url = pulls_url;
		this.description=description;
	}

}
