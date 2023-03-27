package Rectangulo;
import java.util.Scanner;

public class Rectangulo{
	private double base, altura;

	public Rectangulo()
	{
	}

	public Rectangulo(double base, double altura)
	{
		setBase(base);
		setAltura(altura);
	}

	public void setBase(double base)
	{
		this.base = base;
	}

	public void setAltura(double altura)
	{
		this.altura = altura;
	}


	public double getAltura()
	{
		return altura;
	}

	public double getBase()
	{
		return base;
	}

	public double perimetro()
	{
		return (base+altura)*2;
	}

	public double superficie()
	{
		return base*altura;
	}

	public Rectangulo crearRectangulo()
	{
		Scanner input = new Scanner(System.in);
		double b, a;
		
		System.out.println("Ingrese la base del rectángulo:");
		b = input.nextDouble();

		System.out.println("Ingrese la altura:");
		a = input.nextDouble();

		return new Rectangulo(b, a);
	}

	public void dibujar()
	{
		for(int i = 0; i < altura; ++i){
			for(int j = 0; j < base; ++j){
				if(i == 0 || j == 0 || i == altura - 1 || j == base -1){
					System.out.print(" * ");
				}
				else{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}


	}

};

