package myy803.socialbookstore.datamodel.recomstrategies;

import java.util.List;
import org.springframework.stereotype.Component;
import myy803.socialbookstore.datamodel.UserProfile;
import myy803.socialbookstore.formsdata.BookDTO;



@Component
public class FavouriteAuthorsStrategy extends AbstractRecommendationsStrategy {
	
	
	protected List<BookDTO> retrieveRecommendedBooks(UserProfile userProfile) {
		List<BookDTO> bookDtos = userProfile.getBooksFromFavouriteAuthors();
		return bookDtos;
	}
}
