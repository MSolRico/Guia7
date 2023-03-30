/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero"
que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
 */
package CuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int aux;
        do {
            System.out.println("Ingrese nombre del titular");
            c1.Titular = leer.next();
            System.out.println("Desea:\n1)Retirar dinero\n2)Salir");
            aux = leer.nextInt();
            switch (aux) {
                case 1:
                    c1.retirar_dinero();
                    break;
                case 2:
                    break;
            }
        } while (!(aux == 2));
    }
    
}
