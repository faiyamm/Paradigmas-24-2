package UNIDAD2.U2_E21;

/* Este programa mide el uso de memoria mientras genera una lista de números aleatorios no repetidos. 
Utiliza Runtime para mostrar la memoria máxima, total, libre y utilizada del sistema después de realizar 
operaciones de generación y almacenamiento de datos. */

import java.util.ArrayList;
import java.util.Random;

public class Parte1 {
    public static Runtime runtime = Runtime.getRuntime(); // Acceso a Runtime para medir la memoria del sistema

    public static void main(String[] args) {
        int dataSize = 2147483647; // Declarar tamaño de datos (no se usa en el código actual)

        // Generar e imprimir números aleatorios no repetidos
        System.out.println("=================================================");
        imprimir(generarAleatoriosNoRepetidos(10));
        System.out.println("\n=================================================");

        // Imprimir estadísticas de memoria
        System.out.println("Memoria máxima = " + runtime.maxMemory());
        System.out.println("Memoria total = " + runtime.totalMemory());
        System.out.println("Memoria libre = " + runtime.freeMemory());
        System.out.println("Memoria usada = " + (runtime.totalMemory() - runtime.freeMemory()));
    }

    // Genera una lista de números aleatorios no repetidos de tamaño especificado
    public static ArrayList<Integer> generarAleatoriosNoRepetidos(int cantidad) {
        ArrayList<Integer> respuesta = new ArrayList<>(); // Crear lista de números
        for (int i = 0; i < cantidad; i++) {
            respuesta.add(gen(respuesta)); // Añadir números generados sin repetir
        }
        return respuesta;
    }

    // Genera un número aleatorio entre 0 y 10 y verifica que no esté en la lista
    public static int gen(ArrayList<Integer> a) {
        Random ra = new Random();
        int numero = ra.nextInt(11); // Generar número aleatorio entre 0 y 10
        if (!a.contains(numero)) { // Verificar si el número ya está en la lista
            return numero;
        } else {
            return gen(a); // Intentar nuevamente si se repite
        }
    }

    // Imprime los elementos de la lista
    public static void imprimir(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i)); // Imprimir cada número de la lista
        }
    }
}
