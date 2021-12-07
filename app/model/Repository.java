package model;

import java.util.List;

public class Repository {
	
	public String keyword;
	public List<ListRepositories> repositories;
	
	public Repository(String keyword, List<ListRepositories> repositories) {
		this.keyword = keyword;
		this.repositories = repositories;
	}


}
