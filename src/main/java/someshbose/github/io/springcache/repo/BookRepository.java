package someshbose.github.io.springcache.repo;

import someshbose.github.io.springcache.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}