package com.juliodias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliodias.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
