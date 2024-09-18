package UNIDAD1.U1_E3;
/* Ejercicio 3: Similar al primero y segundo con la ligera modificación que nos permite extraer la primera vocal
 * del apellido paterno usando la función vocalPaterno */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario
        char[] iniciales = new char[10]; // array de 10 para almacenar iniciales

        // declarar variables del programa
        String nombre, paterno, materno;

        // Validación del nombre
        do {
            System.out.println("Nombre: ");
            nombre = leer.nextLine();
            if (nombre.length() == 0)
                System.out.println("No puede quedar vacío");
        } while (nombre.length() == 0 || !noNumeros(nombre) || !soloLetras(nombre));

        // Validación del apellido paterno
        do {
            System.out.println("Apellido paterno: ");
            paterno = leer.nextLine();

            if (paterno.length() == 0)
                System.out.println("No puede quedar vacío");
        } while (paterno.length() == 0 || !noNumeros(paterno) || !soloLetras(paterno));

        // Validación del apellido materno
        do {
            System.out.println("Apellido materno: ");
            materno = leer.nextLine();
            if (materno.length() == 0)
                System.out.println("No puede quedar vacío");
        } while (materno.length() == 0 || !noNumeros(materno) || !soloLetras(materno));

        // Arreglo para almacenar las iniciales como en el ejercicio 1
        iniciales[0] = paterno.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del apellido paterno
        iniciales[1] = vocalPaterno(paterno); // extraer la primera vocal del apellido paterno
        iniciales[2] = materno.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del apellido materno
        iniciales[3] = nombre.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del nombre

        // Imprimir datos
        System.out.println("Comprobando tipos de datos:");
        System.out.println(nombre + " " + paterno + " " + materno); // Imprime el nombre completo

        // Deplegar el arreglo con el método que se creo
        desplegarArreglo(iniciales);
    }

    // Sección de métodos

    // Método para poder imprimir el arreglo
    public static void desplegarArreglo(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // Método para verificar si la cadena tiene numeros o no
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

    // Método para verificar que la cadena no tenga caracteres especiales, solo letras
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

    // método para extraer la primera vocal en el apellido paterno, si es que existe
    public static char vocalPaterno(String cadena) {
        cadena = cadena.toUpperCase(); // convertir a mayúsculas
        String vocales = "AEIOU"; 
        // recorrer la cadena con un for loop
        for (int i = 1; i < cadena.length(); i++) {
            // regresar si se encunetra una vocal
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                return cadena.charAt(i);
            }
        }
        // si el apellido no tiene vocales, regresar un espacio vacío
        return ' ';
    }
}
