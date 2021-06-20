package com.example.mvcs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvcs.models.Book;
import com.example.mvcs.repositories.BookRepo;

@Service
public class BookService {
	 private final BookRepo bookRepository;
	 public BookService(BookRepo bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    // returns all the books
	    public List<Book> allBooks() {
	        return bookRepository.findAll();
	    }
	    // creates a book
	    public Book createBook(Book b) {
	        return bookRepository.save(b);
	    }
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
		public void deleteBook(Long id) {
			this.bookRepository.deleteById(id);
			
		}
//		public Book updateBook(book updateBook) {
//		
//			return null;
//		}
		public Book updateBook(Long id,String title, String desc, String lang, Integer numOfPages) {
			Book book = findBook(id);
			book.setTitle(title);
			book.setDescription(desc);
			book.setLanguage(lang);
			book.setNumberOfPages(numOfPages);
			bookRepository.save(book);
			
			return book;
		}

}
