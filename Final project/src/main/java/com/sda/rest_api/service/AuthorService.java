package com.sda.rest_api.service;

import com.sda.rest_api.model.Author;
import com.sda.rest_api.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }

    public Iterable<Author> getAllAuthor(){
        return authorRepository.findAll();
    }
}
