package com.sda.rest_api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String libraryNumber;
    private String title;
    private String ISBN;
    private LocalDate dateOfPublication;
    private String tags;
    private int rent_counter;

    @ManyToOne
    private Author author;
}
