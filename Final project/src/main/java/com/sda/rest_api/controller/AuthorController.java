package com.sda.rest_api.controller;

import com.sda.rest_api.dto.AuthorDto;
import com.sda.rest_api.dto.AuthorMapper;
import com.sda.rest_api.dto.CreateAuthor;
import com.sda.rest_api.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authors")
public class AuthorController {

    private AuthorMapper authorMapper;
    private AuthorService authorService;

    public AuthorController(AuthorMapper authorMapper, AuthorService authorService) {
        this.authorMapper = authorMapper;
        this.authorService = authorService;
    }

    @PostMapping
    AuthorDto addAuthro(@RequestBody CreateAuthor createAuthor){
        return null;
    }
}
