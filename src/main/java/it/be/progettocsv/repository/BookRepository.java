package it.be.progettocsv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.be.progettocsv.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	

}
