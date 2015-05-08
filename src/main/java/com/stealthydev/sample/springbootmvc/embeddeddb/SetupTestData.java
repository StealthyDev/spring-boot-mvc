package com.stealthydev.sample.springbootmvc.embeddeddb;

import com.stealthydev.sample.springbootmvc.model.Book;
import com.stealthydev.sample.springbootmvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SetupTestData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        bookRepository.save(new Book(1L, "Java: A Beginners Guide", "Herbert Schildt"));
        bookRepository.save(new Book(2L, "Beginning Spring", "Mert Caliskan and Kenan Sevindik"));
        bookRepository.save(new Book(3L, "Just Hibernate", "Madhusudhan Konda"));
    }
}