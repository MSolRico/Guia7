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
public class Entidades {
    
    private double n1, n2;

    public Entidades() {
    }

    public Entidades(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public void crearOperacion(){
        System.out.println("Introduca el primer numero");
        Scanner read = new Scanner(System.in);
        this.n1 = read.nextDouble();
        System.out.println("Introduca el segundo numero");
        this.n2 = read.nextDouble();
    }
    
    public double Sumar(){
        double sumar = n1 + n2;
        return sumar;
    }
    
    public double Resta (){
        double resta = n1 - n2;
        return resta;
    }
    
    public double Multiplicar (){
        if (n1 == 0 || n2 == 0){
            System.out.println("Uno o ambos de los numeros ingresados es igual a cero");
            return 0;
        } else {
            double multiplicacion = n1*n2;
            return multiplicacion;
        }
    }
    
    public double Division (){
        if (n1 == 0 || n2 == 0){
            System.out.println("Uno o ambos de los numeros ingresados es igual a cero");
            return 0;
        } else {
            double division = n1/n2;
            return division;
        }
    }
}
