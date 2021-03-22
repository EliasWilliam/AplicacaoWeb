package com.example.AplicacaoWeb.Repositorys;

import com.example.AplicacaoWeb.Livro;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro,Long>{


    List<Livro> findByAutor(String autor);

    List<Livro> findByTitulo(String titulo);

    Livro findByIsbn(String isbn);
}
