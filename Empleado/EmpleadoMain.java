/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class EmpleadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int aux;
        do {
            e1.cargarVariables();
            System.out.println("Desea:\n1)Consultar aumento\n2)Salir");
            aux = read.nextInt();
            switch (aux) {
                case 1:
                    e1.calcular_aumento();
                    System.out.println(e1);
                    break;
                case 2:
                    break;
            }
        } while (!(aux == 2));

    }
    
}
