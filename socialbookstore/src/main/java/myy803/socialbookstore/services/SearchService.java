package myy803.socialbookstore.services;

import java.util.List;

import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.formsdata.SearchDTO;

public interface SearchService {
    List<BookDTO> searchBusinessLogic(SearchDTO searchDto);
}
