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
		Cd cd1 = new Cd("1234567", "Friends");
		System.out.println(cd1);
		Dvd dvd1 = new Dvd("7654321", "It's All Too Much");
		System.out.println(dvd1);
		Periodicals periodical1 = new Periodicals("8004234", "The Times Of India");
		System.out.println(periodical1);

		User user1 = new User("Dhruv", "453fd");
		User user2 = new User("Mihika", "123fd");
		User user3 = new User("Akshay", "900fd");
		User user4 = new User("Ragul", "897fd");
		

		LibaryService service = new LibaryService();

		service.addEntity(book1);
		service.addEntity(cd1);
		service.addEntity(dvd1);
		service.addEntity(periodical1);

		service.borrow("453fd", "8234234", "Borrowed on 10/06/2024");
		service.borrow("123fd", "1234567", "Borrowed on 09/06/2024");

		service.returnEntity("453fd", "8234234", "Book returned");

		service.removeEntity("8234234");
		service.removeEntity("7654321");
		service.removeEntity("8004234");



		// SpringApplication.run(LibraryApplication.class, args);

	}

}
