package com.sda.rest_api.service;

import com.sda.rest_api.model.Book;
import com.sda.rest_api.repository.BookRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public List<Book> findTop5() {
        return bookRepository.findBookAscending(PageRequest.of(0, 5, Sort.by("rent_counter").ascending()));
    }
}
