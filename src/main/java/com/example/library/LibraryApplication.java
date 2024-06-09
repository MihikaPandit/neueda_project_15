package com.example.library;

import com.example.library.model.Book;
import com.example.library.model.User;
import com.example.library.service.LibaryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		Book book1 = new Book("8234234", "Blink - Malcolm Gladwell");
		System.out.println(book1);

		User user1 = new User("Dhruv", "453fd");

		LibaryService service = new LibaryService();

		service.addEntity(book1);
		service.addUser(user1);

		service.borrow("453fd", "8234234", "Borrowed on 10/06/2024");

		service.returnEntity("453fd", "8234234", "Book returned");

		service.removeEntity("8234234");



		// SpringApplication.run(LibraryApplication.class, args);

	}

}
