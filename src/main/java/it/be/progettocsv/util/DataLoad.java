package it.be.progettocsv.util;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;

import it.be.progettocsv.model.Book;
import it.be.progettocsv.repository.BookRepository;
@Component
public class DataLoad implements CommandLineRunner {
	
	@Autowired
	BookRepository bookrepository;

	@Override
	public void run(String... args) throws Exception {
		try (CSVReader csvReader = new CSVReader(new FileReader("book.csv"));) {
			String[] values = null;
			while ((values = csvReader.readNext()) != null) {
				bookrepository.save(new Book(values[0], values[1]));
			}
		}
		System.out.println("TEST");
	}
}
