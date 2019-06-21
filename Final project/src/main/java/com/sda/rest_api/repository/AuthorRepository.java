package com.sda.rest_api.repository;

import com.sda.rest_api.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {
}
