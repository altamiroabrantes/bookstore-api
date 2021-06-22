package com.altamiro.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altamiro.bookstore.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
