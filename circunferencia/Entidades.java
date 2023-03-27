/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
/* Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class Entidades {
    
    private double radio;

    public Entidades() {
    }

    public Entidades(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
          
    public double crearCircunferencia(){
        System.out.println("Intruduzca el radio");
        Scanner read = new Scanner(System.in);
        radio = read.nextDouble();
        return radio;
    }
    
     public double area(){
        double area = ((Math.pow(radio, 2))*Math.PI);
        return area;
    }
     
     public double perimetro(){
        double perimetro = (2*Math.PI*radio);
        return perimetro;
    }
}

