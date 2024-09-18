package UNIDAD1.U1_E2;
/* Ejercicio 2: Este ejercicio es similar al primer ejercicio con la diferencia que se verifica que los espacios de 
nombre y apellidos no estén vacíos, que no contengan números o caracteres especiales. */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        char[] iniciales = new char[10]; // array de 10 para almacenar iniciales

        // declarar variables del programa
        String nombre, paterno, materno;
        
        // loop para verificar que el nombre no este en blanco, sin numeros o caracteres especiales
        do {
            System.out.println("Nombre: ");
            nombre = leer.nextLine();
            // advertir al usuario si se deja el espacio vacío
            if (nombre.length() == 0)
                System.out.println("No puede quedar vacío");
        } while (nombre.length() == 0 || !noNumeros(nombre) || !soloLetras(nombre));

        // loop para el apellido paterno y materno, similar al anterior
        do {
            System.out.println("Apellido paterno: ");
            paterno = leer.nextLine();

            if (paterno.length() == 0) 
                System.out.println("No puede quedar vacío");
        } while (paterno.length() == 0 || !noNumeros(paterno) || !soloLetras(paterno));

        do {
            System.out.println("Apellido materno: ");
            materno = leer.nextLine(); 
            if (materno.length() == 0)
                System.out.println("No puede quedar vacío");
        } while (materno.length() == 0 || !noNumeros(materno) || !soloLetras(materno));
        
        // arreglo para almacenar las iniciales como en el ejercicio 1
        iniciales[0] = paterno.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del apellido paterno
        iniciales[1] = ' '; // espacio vacío
        iniciales[2] = materno.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del apellido materno
        iniciales[3] = nombre.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del nombre

        // imprimir datos
        System.out.println("Comprobando tipos de datos:");
        System.out.println(nombre + " " + paterno + " " + materno); // Imprime el nombre completo
    
        // deplegar el arreglo con el método que se creo
        desplegarArreglo(iniciales);
    }
    // sección de métodos

    // método para poder imprimir el arreglo
    public static void desplegarArreglo(char[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // método para verificar si la cadena tiene numeros o no
    public static boolean noNumeros(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            // Si encuentra un dígito en la cadena, muestra un mensaje y retorna false
            if (Character.isDigit(cadena.charAt(i))) {
                System.out.println("No usar numeros");
                return false; // No se permite el uso de números
            }  
        }
        return true; // Si no contiene números, retorna true
    }
    
    // método para verificar que la cadena no tenga caracteres especiales, solo letras
    public static boolean soloLetras(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            // Si encuentra un carácter que no sea alfabético, muestra un mensaje y retorna false
            if (!Character.isAlphabetic(cadena.charAt(i))) {
                System.out.println("Solo letras");
                return false; // No se permite el uso de caracteres especiales
            }
        }
        return true; // Si solo contiene letras, retorna true
    }
}
