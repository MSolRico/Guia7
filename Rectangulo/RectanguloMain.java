package Rectangulo;

public class RectanguloMain{

	public static void main(String[] args)
	{
		Rectangulo rec = new Rectangulo(4, 7);

		System.out.println("Antes de crear un nuevo rectangulo:");
		rec.dibujar();

		//rec = rec.crearRectangulo();

		//System.out.println("Después de crear un nuevo rectangulo:");
		//rec.dibujar();

		System.out.println("El perímetro es: " + rec.perimetro());
		System.out.println("La superficie es: " + rec.superficie());


	}
};
