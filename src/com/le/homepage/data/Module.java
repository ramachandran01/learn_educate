package com.le.homepage.data;

/**
 * Data object for Module
 */
public class Module {

	private String name;

	private String id;

	private String description;

	private String url;

	private boolean completionStatus;

	private String searchBarInternalTrainingContent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(boolean completionStatus) {
		this.completionStatus = completionStatus;
	}

	public String getSearchBarInternalTrainingContent() {
		return searchBarInternalTrainingContent;
	}

	public void setSearchBarInternalTrainingContent(
			String searchBarInternalTrainingContent) {
		this.searchBarInternalTrainingContent = searchBarInternalTrainingContent;
	}

}
