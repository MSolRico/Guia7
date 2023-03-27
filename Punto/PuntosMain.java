package Punto;

import java.util.Scanner;

public class PuntosMain{

	public static Puntos crearPuntos()
	{

		Puntos p = new Puntos();

		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese las coordenadas del primer punto:");
		p.setX1(input.nextInt());
		p.setY1(input.nextInt());

		System.out.println("Ingrese las coordenadas del segundo punto:");
		p.setX2(input.nextInt());
		p.setY2(input.nextInt());

		return p;
	}

	public static void main(String[] args)
	{

		Puntos p1 = crearPuntos();

		System.out.println("La distancia entre los puntos es: " + p1.distancia());
	}
}
