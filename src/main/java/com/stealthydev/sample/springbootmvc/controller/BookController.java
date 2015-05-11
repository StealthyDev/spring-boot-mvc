package com.stealthydev.sample.springbootmvc.controller;

import com.stealthydev.sample.springbootmvc.model.Book;
import com.stealthydev.sample.springbootmvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value = "list")
    @ResponseBody
    public Iterable<Book> listAllBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "findBook")
    @ResponseBody
    public Book findBook(@RequestParam("id") Long bookId) {
        return bookRepository.findOne(bookId);
    }

    @RequestMapping(value = "search")
    public Iterable<Book> searchBook(@RequestParam(value = "author") String author) {
        return bookRepository.searchByAuthor(author);
    }
}
