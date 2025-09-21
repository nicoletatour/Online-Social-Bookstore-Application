package myy803.socialbookstore.datamodel.recomstrategies;

import java.util.List;

import myy803.socialbookstore.formsdata.BookDTO;

public interface RecommendationsStrategy {
	List<BookDTO> recommend(String username);
}
