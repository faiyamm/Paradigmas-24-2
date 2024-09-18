package UNIDAD1.U1_E8;
/* Programa que valida entradas del usario, para asegurar que no estén vacías o contengan caracteres especiales */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        // declaración de variables
        String nombre;
        boolean correcto = false;
        int edad;

        // loop para validar que el nombre no esté vacío y solo contenga letras
        do {
            System.out.println("Nombre: ");
            nombre = leer.nextLine();
            
            // verificar si el nombre está vacío
            correcto = valida.strVacio(nombre);

        } while (!correcto || !valida.soloLetras(nombre)); // seguir pidiendo si el nombre está vacío o contiene caracteres no válidos


        // loop para validar que la edad sea un número positivo
        do {
            System.out.println("Edad: ");
            // convertir a entero
            edad = Integer.parseInt(leer.nextLine());
        // seguir pidiendo si la edad no es un número positivo
        } while (!valida.positivo(edad));

    }
    
}
