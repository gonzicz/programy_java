package com.sda.rest_api.controller;

import com.sda.rest_api.model.Book;
import com.sda.rest_api.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/app/books")
public class LibraryViewController {
    private BookService bookService;

    public LibraryViewController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    String AllBooks(Model model, @RequestParam(value = "view", required = false) String view) {
        List<Book> books;
        if ("show_book".equals(view))
            books = bookService.getAllBooks();
        else
            books = bookService.findTop5();
        model.addAttribute("allBooks", books);
        return "html/index";
    }

    @PostMapping
    String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/app/books/view?view=add_book";
    }

    @GetMapping("/view")
    String view() {
        return "html/view";
    }

}
