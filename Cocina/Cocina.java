/*                                   MATRIZ: 
Reseta | ingrediente | ingrediente | ingrediente | ingrediente | ingrediente |
Reseta | ingrediente | ingrediente | ingrediente | ingrediente | ingrediente |
Reseta | ingrediente | ingrediente | ingrediente | ingrediente | ingrediente |
Reseta | ingrediente | ingrediente | ingrediente | ingrediente | ingrediente |

 */
package Cocina;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Cocina {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public String Resetas[][] = new String[11][10];
    int Contador = 0;

    public Cocina() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                Resetas[i][j] = "*";
            }
        }

    }

    public void cargarReseta() {
        System.out.println("Ingrese el nombre de la reseta");
        for (int i = Contador; i < (Contador + 1); i++) {
            Resetas[i][0] = read.next();
        }
        Contador++;
        System.out.println("¿Cuantos ingredientes tiene su reseta? (Máximo 10)");
        int aux = read.nextInt();
        System.out.println("Introduzca los ingredientes");
        for (int j = 1; j < aux + 1; j++) {
            Resetas[Contador - 1][j] = read.next();
        }
    }

    public void buscadorReseta() {
        System.out.println("Introduzca el nombre de la reseta:");
        String nombre = read.next();
        for (int i = 0; i < 10; i++) {
            if (Resetas[i][0].equals(nombre)) {
                imprimirReseta(i);
                break;
            } else {
                System.out.println("La reseta buscada no se encuetra en la lista");
            }

        }
    }

    public void imprimirReseta(int i) {
        for (int j = 0; j < 10; j++) {
            if (Resetas[i][j].equals("*")) {
                break;
            } else if (j == 0) {
                System.out.println(Resetas[i][j] + ":");
            } else {
                System.out.println(Resetas[i][j]);
            }
        }
    }

    public void buscadorIngrediente() {
        System.out.println("Introduzca ingrediente disponible");
        String ingrediente = read.next();
        for (int i = 0; i < 11; i++) {
            for (int j = 1; j < 10; j++) {
                if (Resetas[i][j].equals(ingrediente)) {
                    imprimirReseta(i);
                }
            }
        }
    }
}
