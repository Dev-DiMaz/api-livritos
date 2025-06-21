package com.dmazui.api_livritos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmazui.api_livritos.model.entity.Book;
import com.dmazui.api_livritos.model.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public Book saveBook(Book book) {
		return repository.save(book);
	}
	
	public Book updateBook(Long id, Book book) {
		Book existBook = repository.findById(id).orElse(null);
		
		
		if(existBook == null) {
			new RuntimeException("Livro nao encontrado");
		} else {
			existBook.setAuthor(book.getAuthor());
			existBook.setIsbn(book.getIsbn());
			existBook.setReadYear(book.getReadYear());
			existBook.setTitle(book.getTitle());
		}
		return repository.save(existBook);		//precisa?
	}
	
	public Book findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Book> findAll(){
		return repository.findAll();
	}
	
	public void deleteBook(Long id) {
		repository.deleteById(id);
	}
	
}
