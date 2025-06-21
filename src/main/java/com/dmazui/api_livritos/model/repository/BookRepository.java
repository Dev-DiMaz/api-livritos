package com.dmazui.api_livritos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmazui.api_livritos.model.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
}
