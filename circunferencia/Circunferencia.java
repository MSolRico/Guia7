/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

/**
 *
 * @author SFC
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidades c = new Entidades();
        c.crearCircunferencia();
        System.out.println(c.area());
        System.out.println(c.perimetro());
    }
    
}
