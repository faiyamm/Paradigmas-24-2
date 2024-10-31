package UNIDAD2.U2_E17;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declarar variables
        short edad;
        
        // Solicitar edad hasta que sea mayor de edad
        do {
            edad = pedirEdad(); // Llamar a función para pedir la edad
        } while (!mayorEdad(edad)); // Negar la condición mayorEdad

        mostrarDatos(edad); // Llamar a función para mostrar datos personales
        leer.close();
}

// Función para mostrar datos personales
    public static void mostrarDatos(short edad) {
        System.out.println("Datos personales:");
        System.out.println("Edad: " + edad);
    }

    // Función para verificar si es mayor de edad
    public static boolean mayorEdad(short edad) {
        return edad > 17; // Devolver true si la edad es mayor a 17
    }

    // Función para pedir un valor en un rango específico
    public static short pedirValor(String msg, short min, short max) {
        Scanner leer = new Scanner(System.in);
        short valor = 0;
        boolean valido;
        String dato;

        // Validar entrada dentro del rango
        do {
            System.out.println(msg + " : ");
            dato = leer.nextLine();
            valido = true; // Inicializar como válido

            // Verificar que todos los caracteres sean dígitos
            for (int i = 0; i < dato.length(); i++) {
                if (!Character.isDigit(dato.charAt(i))) {
                    valido = false;
                    break;
                }
            }
            if (valido) {
                valor = Short.parseShort(dato);
                valido = valor >= min && valor <= max; // Validar dentro del rango
            }
        } while (!valido); // Repetir hasta que el valor sea válido
        leer.close();
        return valor;  
    }

    // Función para pedir la edad con validación
    public static short pedirEdad() {
        Scanner leer = new Scanner(System.in);
        short valor = 0;
        boolean valido;

        // Solicitar y validar edad
        do {
            System.out.println("Edad: ");
            String dato = leer.nextLine();
            try {
                valor = Short.parseShort(dato); // Convertir a short
                valido = valor >= 0 && valor <= 120; // Verificar rango válido
            } catch (NumberFormatException e) {
                valido = false; // Si no es número, no es válido
            }
        } while (!valido); // Repetir hasta obtener un valor válido
        leer.close();
        return valor;
    }
}
