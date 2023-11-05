package ru.erma.boot.library.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.erma.boot.library.pojo.Book;
import ru.erma.boot.library.pojo.Person;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByReader(Person reader);

    List<Book> findByTitleStartingWithIgnoreCase(String startString);
}