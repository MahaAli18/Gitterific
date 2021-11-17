package model;

/**
 * 
 * @author maha_
 *
 */
public class UserRepos {
	public String repos_url;
	public String name;
	public String login;
	public String issues_url;
	public String commits_url;
	public String pulls_url;
	public String description;

	public UserRepos() {

		this.repos_url = "";
		this.name = "";

	}

	public UserRepos(String repos_url, String name, String login, String issues_url, String commits_url,
			String pulls_url, String description) {
		this.repos_url = repos_url;
		this.name = name;
		this.login = login;
		this.issues_url = issues_url;
		this.commits_url = commits_url;
		this.pulls_url = pulls_url;
		
	}

}
