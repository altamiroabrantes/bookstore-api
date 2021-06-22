package com.altamiro.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.altamiro.bookstore.domain.Categoria;
import com.altamiro.bookstore.domain.Livro;
import com.altamiro.bookstore.repositories.CategoriaRepository;
import com.altamiro.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		
		Livro livro1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsu,", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(livro1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(livro1));
	}

}
