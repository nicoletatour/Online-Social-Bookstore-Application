package myy803.socialbookstore.services;

import java.util.List;

import myy803.socialbookstore.datamodel.BookCategory;
import myy803.socialbookstore.formsdata.BookDTO;

public interface BookOfferService {
    List<BookDTO> listBookOffersBusinessLogic(String username);
    List<BookCategory> getAllCategories();
    void saveBookOfferBusinessLogic(String username, BookDTO bookOfferDto);
    void deleteBookOfferBusinessLogic(int bookId);
}
