package myy803.socialbookstore.datamodel.searchstrategies;

import java.util.ArrayList;
import java.util.List;

import myy803.socialbookstore.datamodel.Book;
import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.formsdata.SearchDTO;
import myy803.socialbookstore.mappers.BookMapper;

public abstract class AbstractSearchStrategy implements SearchStrategy {

    @Override
    public ArrayList<BookDTO> search(SearchDTO searchDto, BookMapper bookMapper) {
        ArrayList<BookDTO> bookDtos = new ArrayList<>();

        if (searchDto.getTitle() != null) {
            List<Book> books = makeInitialListOfBooks(searchDto, bookMapper);

            for (Book book : books) {
                if (checkIfAuthorsMatch(searchDto, book)) {
                    bookDtos.add(book.buildDto());
                }
            }
        }

        return bookDtos;
    }

    protected abstract List<Book> makeInitialListOfBooks(SearchDTO searchDto, BookMapper bookMapper);

    protected abstract boolean checkIfAuthorsMatch(SearchDTO searchDto, Book book);
}
