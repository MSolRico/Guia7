/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author SFC
 */
public class biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.addLibro();
        Libro l2 = new Libro();
        
        System.out.println(l1);
        System.out.println(l2);
    }
    
}
