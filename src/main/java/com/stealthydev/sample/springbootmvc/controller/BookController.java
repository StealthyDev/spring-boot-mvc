package com.stealthydev.sample.springbootmvc.controller;

import com.stealthydev.sample.springbootmvc.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @RequestMapping(value = "list")
    @ResponseBody
    public List<Book> listAllBooks() {
        List<Book> books = new ArrayList<Book>();

        Book book = new Book();

        book.setId(1L);
        book.setName("Java: A Beginner's Guide");
        book.setAuthor("Herbert Schildt");
        books.add(book);

        book.setId(2L);
        book.setName("Beginning Spring");
        book.setAuthor("Mert Caliskan and Kenan Sevindik");
        books.add(book);

        return books;
    }
}
