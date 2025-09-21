package myy803.socialbookstore.datamodel.recomstrategies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import myy803.socialbookstore.datamodel.UserProfile;
import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.mappers.UserProfileMapper;

@Component
public class FavouriteCategoriesAndAuthorsStrategy extends AbstractRecommendationsStrategy {

	
	protected List<BookDTO> retrieveRecommendedBooks(UserProfile userProfile) {
		ArrayList<BookDTO> bookDtos = new ArrayList<BookDTO>();		bookDtos.addAll(userProfile.getBooksFromFavouriteAuthors());
		bookDtos.addAll(userProfile.getBooksOfFavouriteCategories());
		return bookDtos;
	}
}
