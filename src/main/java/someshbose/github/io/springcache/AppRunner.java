package someshbose.github.io.springcache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import someshbose.github.io.springcache.model.Book;
import someshbose.github.io.springcache.repo.BookRepository;


@Component
public class AppRunner implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

  @Autowired
  private BookRepository bookRepository;

  @Override
  public void run(String... args) throws Exception {
    logger.info(".... Saving books");
    Book Gita = new Book("123","Gita by Basudev");
    Book Mahabharat = new Book("126","Mahabhrat by Vyasa");
    Book Ramayan = new Book("130","Ramayan by Balmiki");

    bookRepository.save(Gita);
    bookRepository.save(Mahabharat);
    bookRepository.save(Ramayan);

  }

}

