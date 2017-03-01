package com.michalc94;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookrestApplication.class, args);
	}
//
//  @Component
//  public class DataLoader implements ApplicationRunner {
//
//		private BookRepository bookRepository;
//
//		@Autowired
//    public DataLoader(BookRepository bookRepository) {
//      this.bookRepository = bookRepository;
//		}
//
//    public void run(ApplicationArguments args) {
//			bookRepository.save(new Book(new Isbn("22"), new Title("22"), new Author("ss"), new Genre("ss"),
//					new PublicationYear("2001"), BigDecimal.ONE));
//		}
//	}
}
