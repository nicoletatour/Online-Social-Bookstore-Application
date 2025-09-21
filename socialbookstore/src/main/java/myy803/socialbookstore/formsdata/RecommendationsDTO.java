package myy803.socialbookstore.formsdata;

import java.util.ArrayList;

public class RecommendationsDTO {
	private ArrayList<String> recommendationStrategies;
	private String selectedStrategy;
	
	public RecommendationsDTO() {
		super();
		recommendationStrategies = new ArrayList<String>();
		recommendationStrategies.add("Favourite Categories"); 
		recommendationStrategies.add("Favourite Authors");
		recommendationStrategies.add("Both");
		recommendationStrategies.add("Intersection");
	}

	public ArrayList<String> getRecommendationStrategies() {
		return recommendationStrategies;
	}

	public void setRecommendationStrategies(ArrayList<String> recommendationStrategies) {
		this.recommendationStrategies = recommendationStrategies;
	}

	public String getSelectedStrategy() {
		return selectedStrategy;
	}

	public void setSelectedStrategy(String selectedStrategy) {
		this.selectedStrategy = selectedStrategy;
	}

	
}
