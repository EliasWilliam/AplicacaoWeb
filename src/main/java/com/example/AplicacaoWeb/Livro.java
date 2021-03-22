package com.example.AplicacaoWeb;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Livro {

    @Id
    @GeneratedValue(Strategy=GenerationType.AUTO)
    private long id;

    @Column(name="titulo", nullable=false)
    private String titulo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescprtion() {
        return descprtion;
    }

    public void setDescprtion(String descprtion) {
        this.descprtion = descprtion;
    }
    @Column(name="isbn", nullable=false, unique=true)
    private String isbn;

    @Column(name="autor", nullable=false)
    private String autor;

    @Column(name="description", nullable=true)
    private String descprtion;

}
