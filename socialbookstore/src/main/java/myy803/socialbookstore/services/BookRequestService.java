package myy803.socialbookstore.services;

import java.util.List;

import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.formsdata.UserProfileDTO;

public interface BookRequestService {
    void requestBusinessLogic(String username, int bookId);
    List<BookDTO> showUserBookRequestsBusinessLogic(String username);
    List<UserProfileDTO> showRequestingUsersForBookOfferBusinessLogic(int bookId);
    void acceptBookRequestBusinessLogic(String username, int bookId);
    void deleteBookRequestBusinessLogic(int bookId, String username);

}
