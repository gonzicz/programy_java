package com.sda.rest_api.controller;

import com.sda.rest_api.dto.BookDto;
import com.sda.rest_api.dto.BookMapper;
import com.sda.rest_api.dto.CreateBookDto;
import com.sda.rest_api.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private BookService bookService;
    private BookMapper bookMapper;

    public BookController(BookService bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @PostMapping
    BookDto addBook(@RequestBody CreateBookDto createBookDto) {
        return bookMapper.toDto(bookService.addBook(bookMapper.model(createBookDto)));
    }


    @GetMapping
    Stream<BookDto> getAllBooks() {
        return bookService.getAllBooks().stream().map(bookMapper::toDto);
    }
//
//
//    @GetMapping("/{id}")
//    Optional<Book> findBookById(@PathVariable long id) {
//        return bookRepository.findById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    void deleteBookById(@PathVariable long id) {
//        bookRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    Book updateBook(@PathVariable long id, @RequestBody Book book) {
//        book.setId(id);
//        return bookRepository.save(book);
//    }

}
