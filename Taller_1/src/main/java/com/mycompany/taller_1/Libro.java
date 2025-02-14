/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_1;

/**
 *
 * @author Maria liz
 */
public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;
   

    public Libro(){
        this.titulo="tomate";
         this.autor="toto";
         this.numeroPaginas=8;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro:" + "\ntitulo:" + titulo + ",\nautor:" + autor + "\nnumeroPaginas:" + numeroPaginas ;
    }
    

   
    
    }
    

