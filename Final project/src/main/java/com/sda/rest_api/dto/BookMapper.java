package com.sda.rest_api.dto;

import com.sda.rest_api.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    // metoda zamienia nam obiekt CreateBookDTO na Book
    public Book model (CreateBookDto bookDto){
        Book book = new Book();
        book.setTitle(bookDto.getTytul());
        book.setDateOfPublication(bookDto.getData_publikacji());
        book.setISBN(bookDto.getISBN());
        book.setTags(bookDto.getKategoria());
        book.setLibraryNumber(bookDto.getISBN()+"/1234");
        return book;
    }

    // met
    public BookDto toDto(Book book){
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTytul(book.getTitle());
        bookDto.setKategoria(book.getTags());
        bookDto.setNr_biblioteczny(book.getLibraryNumber());
        bookDto.setISBN(book.getISBN());
        bookDto.setData_publikacji(book.getDateOfPublication());
        bookDto.setIlosc_wyporzyczen(book.getRent_counter());
//        bookDto.setAutor(book.getAuthor().getName() +" "+ book.getAuthor().getSurname());
        return bookDto;
    }
}
