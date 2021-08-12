package someshbose.github.io.springcache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import someshbose.github.io.springcache.model.Book;
import someshbose.github.io.springcache.repo.BookRepository;

@RestController
public class BookController {

  private final Logger logger= LoggerFactory.getLogger(BookController.class);

  @Autowired
  private BookRepository bookRepository;

  @GetMapping("/{id}")
  @Cacheable(value = "books",key="#id")
  public Book getBook(@PathVariable String id){
    logger.info("Getting book with id {}",id);
    return (Book) bookRepository.findById(Long.valueOf(id)).get();
  }
}
