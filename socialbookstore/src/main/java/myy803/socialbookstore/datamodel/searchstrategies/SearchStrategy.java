package myy803.socialbookstore.datamodel.searchstrategies;

import java.util.ArrayList;

import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.formsdata.SearchDTO;
import myy803.socialbookstore.mappers.BookMapper;

public interface SearchStrategy {
	ArrayList<BookDTO> search(SearchDTO bookDto, BookMapper bookMapper);
}
