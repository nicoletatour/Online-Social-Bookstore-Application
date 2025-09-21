package myy803.socialbookstore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myy803.socialbookstore.datamodel.BookCategory;
import myy803.socialbookstore.datamodel.UserProfile;
import myy803.socialbookstore.formsdata.UserProfileDTO;
import myy803.socialbookstore.mappers.BookAuthorMapper;
import myy803.socialbookstore.mappers.BookCategoryMapper;
import myy803.socialbookstore.mappers.UserProfileMapper;
import myy803.socialbookstore.services.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileMapper userProfileMapper;

    @Autowired
    private BookCategoryMapper bookCategoryMapper;

    @Autowired
    private BookAuthorMapper bookAuthorMapper;

    @Override
    public List<BookCategory> getAllCategories() {
        return bookCategoryMapper.findAll();
    }

    @Override
    public UserProfileDTO retrieveProfileBusinessLogic(String username) {
        Optional<UserProfile> optUserProfile = userProfileMapper.findById(username);
        if (optUserProfile.isPresent()) {
            return optUserProfile.get().buildProfileDto();
        } else {
            UserProfileDTO userProfileDto = new UserProfileDTO();
            userProfileDto.setUsername(username);
            return userProfileDto;
        }
    }

    @Override
    public void saveProfileBusinessLogic(UserProfileDTO userProfileDto) {
        Optional<UserProfile> optUserProfile = userProfileMapper.findById(userProfileDto.getUsername());
        UserProfile userProfile = null;
		if(optUserProfile.isPresent())	
			userProfile = optUserProfile.get();
		else
			userProfile = new UserProfile();
        userProfileDto.buildUserProfile(userProfile, bookAuthorMapper, bookCategoryMapper);
        userProfileMapper.save(userProfile);
    }
}
