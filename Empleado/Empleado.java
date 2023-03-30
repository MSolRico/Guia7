/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método 
"calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
package Empleado;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Empleado {

    public String nombre;
    public int edad;
    public double salario;
    public double aumento;

    public Empleado() {
    }

    public void cargarVariables() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre del empleado");
        this.nombre = read.next();
        System.out.println("Ingrese su edad");
        this.edad = read.nextInt();
        System.out.println("Ingrese su salario");
        this.salario = read.nextInt();
    }

    public void calcular_aumento() {
        if (edad >= 30) {
            aumento = (salario * 1.1);
        } else {
            aumento = (salario * 1.05);
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre = " + nombre + ", edad = " + edad + ", salario anterior = " + salario + ", salario con aumento = " + aumento + '}';
    }


}
