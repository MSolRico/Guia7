/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidades c = new Entidades();
        c.crearOperacion();
        String opcion;
        Scanner read = new Scanner(System.in);
        
        System.out.println("==============MENU===============");
        System.out.println("=============1-Sumar===============");
        System.out.println("=============2-Restar===============");
        System.out.println("=============3-Multiplicar===============");
        System.out.println("=============4-Dividir===============");
        System.out.println("=============5-Salir===============");
        
        do {
            opcion = read.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println(c.Sumar());
                    break;
                case "2":
                    System.out.println(c.Resta());
                    break;
                case "3":
                    System.out.println(c.Multiplicar());
                    break;
                case "4":
                    System.out.println(c.Division());
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
            }
        } while (!opcion.equals("5"));

    }

}
