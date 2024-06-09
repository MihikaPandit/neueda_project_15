package com.example.library;

import com.example.library.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		Book book1 = new Book("8234234", "Blink - Malcolm Gladwell");
		System.out.println(book1);

		// SpringApplication.run(LibraryApplication.class, args);

	}

}
