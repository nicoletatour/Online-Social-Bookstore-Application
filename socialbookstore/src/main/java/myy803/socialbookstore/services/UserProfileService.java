package myy803.socialbookstore.services;

import java.util.List;

import myy803.socialbookstore.datamodel.BookCategory;
import myy803.socialbookstore.formsdata.UserProfileDTO;

public interface UserProfileService {
    List<BookCategory> getAllCategories();
    UserProfileDTO retrieveProfileBusinessLogic(String username);
    void saveProfileBusinessLogic(UserProfileDTO userProfileDto);
}