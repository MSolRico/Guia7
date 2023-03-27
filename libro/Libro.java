/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int nPaginas;

    public Libro(){
        
    }

    public void addLibro() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese ISBN");
        this.ISBN = read.nextInt();
        System.out.println("Ingrese el titulo del libro");
        this.titulo = read.next();
        System.out.println("Ingrese el autor");
        this.autor = read.next();
        System.out.println("Ingrese el numero de paginas");
        this.nPaginas = read.nextInt();
    }
      
        @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + '}';
    }
}
