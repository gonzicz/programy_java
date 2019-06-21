package com.sda.rest_api.repository;

import com.sda.rest_api.model.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    @Query("select b from Book b order by b.rent_counter asc")
    List<Book> findAll();

    @Query("select b from Book b order by b.rent_counter asc")
    List<Book> findBookAscending(Pageable pageable);
}