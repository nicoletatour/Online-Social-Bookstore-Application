package myy803.socialbookstore.formsdata;

import java.util.ArrayList;

public class SearchDTO {
	
	private String title;
	private String authors;
	private ArrayList<String> searchStrategies;
	private String selectedStrategy;
	private String category;
	
	public SearchDTO() {
		super();
		searchStrategies = new ArrayList<String>();
    	searchStrategies.add("Exact"); 
    	searchStrategies.add("Approximate"); 
	}

	
	public ArrayList<String> getSearchStrategies() {
		return searchStrategies;
	}


	public void setSearchStrategies(ArrayList<String> searchStrategies) {
		this.searchStrategies = searchStrategies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getSelectedStrategy() {
		return selectedStrategy;
	}

	public void setSelectedStrategy(String selectedStrategy) {
		this.selectedStrategy = selectedStrategy;
	}
	
    public String getCategory() { 
        return category; 
    }

    public void setCategory(String category) { 
        this.category = category; 
    }
}
