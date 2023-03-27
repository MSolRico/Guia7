/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cancion;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
/*Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá́ definir además 
dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como 
parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters
correspondientes. */
public class Cancion {
    
    private String autor, titulo;

    public Cancion() {
    }
    
    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public void cancion() {
        System.out.println("Introduzca el titulo");
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        this.titulo = read.next();
        System.out.println("Introduzca el autor");
        this.autor = read.next();
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "autor= " + autor + ", titulo= " + titulo + '}';
    }
    
    
}
