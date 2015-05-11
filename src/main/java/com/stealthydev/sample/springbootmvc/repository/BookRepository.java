package com.stealthydev.sample.springbootmvc.repository;

import com.stealthydev.sample.springbootmvc.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    @Query(value = "SELECT book FROM Book book WHERE author LIKE %:author%")
    Iterable<Book> searchByAuthor(@Param("author") String author);
}
