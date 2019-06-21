package com.sda.rest_api.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookDto {
    private long id;
    private String tytul;
    private String kategoria;
    private String nr_biblioteczny;
    private String ISBN;
    private LocalDate data_publikacji;
    private String autor;
    private int ilosc_wyporzyczen;
}
