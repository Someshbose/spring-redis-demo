package someshbose.github.io.springcache.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import someshbose.github.io.springcache.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}
