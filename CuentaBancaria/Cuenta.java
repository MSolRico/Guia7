/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Cuenta {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public double Saldo;
    public String Titular;

    public Cuenta() {
    }

    public Cuenta(int Saldo, String Titular) {
        this.Saldo = Saldo;
        this.Titular = Titular;
    }

    public void retirar_dinero() {
        System.out.println("Cuanto dinero desea retirar?");
        int aux = read.nextInt();
        if (dinero_disponible(Saldo) > aux) {
            System.out.println("Tiene 30 segundos para retirar el dinero. Tenga un buen día :)");
        } else {
            System.out.println("No tiene saldo suficiente");
        }
    }

    public double dinero_disponible(double Saldo) {
        Saldo = (double) (Math.random()* (5000000 - 300) + 300);
        return Saldo;
    }
}
