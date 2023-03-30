/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar nuevas 
recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.

 */
package Cocina;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class CocinaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cocina r1 = new Cocina();
        int aux;
        do {
            System.out.println("Desea:\n1)Cargar reseta\n2)Buscar reseta\n3)Salir");
            aux = leer.nextInt();
            switch (aux) {
                case 1:
                    r1.cargarReseta();
                    break;
                case 2:
                    System.out.println("¿Como desea buscar su reseta?\n1)por nombre\n2)por ingredientes disponibles");
                    int respuesta = leer.nextInt();
                    if (respuesta == 1) {
                        r1.buscadorReseta();
                    } else {
                        r1.buscadorIngrediente();
                    }
                    break;
                case 3:
                    break;
            }
        } while (!(aux == 3));
    }
}
