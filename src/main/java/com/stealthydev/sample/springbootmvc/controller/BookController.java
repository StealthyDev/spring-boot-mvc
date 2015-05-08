package com.stealthydev.sample.springbootmvc.controller;

import com.stealthydev.sample.springbootmvc.model.Book;
import com.stealthydev.sample.springbootmvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
