package model;

/**
 * @author maha_ Data to fetch from repository
 *
 */

public class ListRepositories {
	public String login;
	public String name;
	public String user_url;
	public String issues_url;
	public String visibility;
	public String commits_url;
	public String pulls_url;
	public String description;

	public ListRepositories() {
		this.login = "";
		this.name = "";
		this.user_url = "";
		this.issues_url = "";
		this.visibility = "";
		this.commits_url = "";
		this.pulls_url = "";
		this.description = "";

	}

	/**
	 * 
	 * @param login
	 * @param name
	 * @param user_url
	 * @param issues_url
	 * @param commits_url
	 * @param pulls_url
	 * @param description
	 */
	public ListRepositories(String login, String name, String user_url, String issues_url, String visibility,
			String commits_url, String pulls_url, String description) {
		this.login = login;
		this.name = name;
		this.user_url = user_url;
		this.issues_url = issues_url;
		this.visibility = visibility;
		this.commits_url = commits_url;
		this.pulls_url = pulls_url;
		this.description = description;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_url() {
		return user_url;
	}

	public void setUser_url(String user_url) {
		this.user_url = user_url;
	}

	public String getIssues_url() {
		return issues_url;
	}

	public void setIssues_url(String issues_url) {
		this.issues_url = issues_url;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getCommits_url() {
		return commits_url;
	}

	public void setCommits_url(String commits_url) {
		this.commits_url = commits_url;
	}

	public String getPulls_url() {
		return pulls_url;
	}

	public void setPulls_url(String pulls_url) {
		this.pulls_url = pulls_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
