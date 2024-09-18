package UNIDAD1.U1_E6;
/* Juego similar al del ejercicio 5, con la diferencias que se usa un booleano para verificar si el usuario ha adivinado el número correctamente */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        int numero = 0; // numero adivinado por el usuario
        int oport = 3; // número de oportunidades para adivinar el número random
        int valor;   // número random
        boolean acerto = false; // rastrear si el usuario ha adivinado el número o no

        // número random entre 1 y 50
        valor = (int)(50 * Math.random()) + 1;

        do{ // bucle do-while para garantizar que el usario adivine al menos una vez
            System.out.println("Adivina el número (1-50): ");
            numero = Integer.parseInt(leer.nextLine());

            // validación del boolean
            if (numero==valor) acerto = true; // verificar si el usuario adivino el número o no

            else{ // pistas
                if (numero<valor) {
                    System.out.println("Te faltó");
                }
                else{
                    System.out.println("Te pasaste");
                }
            }
            oport --; // reducir las oportunidades -1

        } while (!acerto && oport>0); // el juego continua mientras el número adivinado sea incorrecto y haya oportunidades 

        // no le atino acerto==false, ! false equivale a true
        if (!acerto)
            System.out.println("El número era " + valor);
    }
    
}
