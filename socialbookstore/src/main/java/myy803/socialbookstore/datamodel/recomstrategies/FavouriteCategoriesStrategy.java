package myy803.socialbookstore.datamodel.recomstrategies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import myy803.socialbookstore.datamodel.UserProfile;
import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.mappers.UserProfileMapper;

@Component
public class FavouriteCategoriesStrategy extends AbstractRecommendationsStrategy {
		
	protected List<BookDTO> retrieveRecommendedBooks(UserProfile userProfile) {
		List<BookDTO> bookDtos = userProfile.getBooksOfFavouriteCategories();
		return bookDtos;
	}
}
