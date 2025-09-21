package myy803.socialbookstore.mappers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import myy803.socialbookstore.datamodel.Book;

public interface BookMapper extends JpaRepository<Book, Integer> {
	List<Book> findByTitle(String title);
	List<Book> findByTitleContaining(String title);
	List<Book> findByCategoryNameContaining(String category);
	List<Book> findByCategoryNameContainingAndTitleContaining(String category, String title);


}
