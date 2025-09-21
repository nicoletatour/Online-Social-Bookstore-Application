package myy803.socialbookstore.datamodel.searchstrategies;

import java.util.List;

import org.springframework.stereotype.Component;

import myy803.socialbookstore.datamodel.Book;
import myy803.socialbookstore.formsdata.SearchDTO;
import myy803.socialbookstore.mappers.BookMapper;

@Component
public class ExactSearchStrategy extends AbstractSearchStrategy {

    @Override
    protected List<Book> makeInitialListOfBooks(SearchDTO searchDto, BookMapper bookMapper) {
        return bookMapper.findByTitle(searchDto.getTitle());
    }

    @Override
	protected boolean checkIfAuthorsMatch(SearchDTO searchDto, Book book) {
    	if (searchDto.getAuthors() == null || searchDto.getAuthors().isEmpty()) {
            return true;
        }
        return book.writtenBy(searchDto.getAuthors());
	}
}
