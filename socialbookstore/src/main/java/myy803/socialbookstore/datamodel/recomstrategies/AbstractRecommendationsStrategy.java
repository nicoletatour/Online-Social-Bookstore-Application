package myy803.socialbookstore.datamodel.recomstrategies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import myy803.socialbookstore.datamodel.UserProfile;
import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.mappers.UserProfileMapper;

public abstract class AbstractRecommendationsStrategy implements RecommendationsStrategy {

	@Autowired
	private UserProfileMapper userProfileMapper;
	
    @Override
	public List<BookDTO> recommend(String username) {
		UserProfile userProfile = userProfileMapper.findByUsername(username);
		List<BookDTO> bookDtos = retrieveRecommendedBooks(userProfile);
	
		return bookDtos;
	}

    protected abstract List<BookDTO> retrieveRecommendedBooks(UserProfile userProfile);
}
