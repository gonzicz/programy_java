package com.sda.rest_api.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateBookDto {
    private String tytul;
    private String kategoria;
    private String ISBN;
    private LocalDate data_publikacji;

}
