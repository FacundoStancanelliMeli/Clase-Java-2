package com.company;

public class Libro {
    private String titulo;
    private int isbn;
    private String autor;

    public void prestamo(){

    }
    public void devolucion(){

    }

    public Libro (){

    }

    public Libro (String titulo, int isbn, String autor){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}