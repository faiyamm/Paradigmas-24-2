package UNIDAD1.U1_E5;
/* Juego donde el usuario tiene 3 oportunidades para adivinar un número random entre 1 y 50 */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        int numero = 0; // numero adivinado por el usuario
        int oport = 3; // número de oportunidades para adivinar el número random
        int valor;   // número random

        // número random entre 1 y 50
        valor = (int)(50 * Math.random()) + 1;

        do{ // bucle do-while para garantizar que el usario adivine al menos una vez
            System.out.println("Adivina el número (1-50): ");
            numero = Integer.parseInt(leer.nextLine());

            // pistas para ayudar al usuario
            if (numero<valor)
                System.out.println("Te faltó");
            if (numero>valor) 
                System.out.println("Te pasaste");
            oport --;

            // si el usuario adivina el número antes de agotar las oportunidades
            if (numero == valor){
                System.out.println("Adivinaste el numero!!");
                break;
            }

        } while (numero != valor && oport>0); // el juego continua mientras el número adivinado sea incorrecto y haya oportunidades 

        // si el usuario no adivina después de las 3 oportunidades, decirle el número
        if (numero != valor)
            System.out.println("El número era " + valor);
    }
    
}
