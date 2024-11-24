package UNIDAD3.U3_E25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Este programa usa funciones estáticas, composición de funciones y diferencias 
entre programación imperativa y declarativa. */

public class Main {
    public static void main(String[] args) {
        // crear escáner para lectura de datos
        Scanner leer = new Scanner(System.in);

        // declarar año y verificar si es bisiesto
        int year = 2024;
        System.out.println("El año " + year + " es bisiesto: " + Estatica.bisiesto(year));
        System.out.println("--------------------------------------------------------------");

        // generar número aleatorio entre 100 y 140
        System.out.println("Aleatorio " + Estatica.aleatorio(100, 140));
        System.out.println("--------------------------------------------------------------");

        // composición de funciones: generar un año aleatorio y verificar si es bisiesto
        int year_random = Estatica.aleatorio(2000, 2024);
        System.out.println(year_random + " es bisiesto: " + Estatica.bisiesto(year_random));
        System.out.println("--------------------------------------------------------------");

        // calcular la siguiente década del año actual
        year = Estatica.sigDecada(year);
        System.out.println("Década siguiente: " + year);
        System.out.println("--------------------------------------------------------------");

        // ejemplo de programación imperativa y declarativa para obtener números pares
        List<Integer> positivos = new ArrayList<>(Arrays.asList(1, 3, 4, 7, 8, 21, 24, 50)); // lista inicial
        List<Integer> pares = new ArrayList<>(); // lista para pares (imperativa)
        List<Integer> pares2 = new ArrayList<>(); // lista para pares (declarativa)

        // iterar sobre la lista y verificar si cada número es par
        System.out.println("Números pares: ");
        for (int i = 0; i < positivos.size(); i++) {
            int num = positivos.get(i); // obtener elemento de la lista
            System.out.println(num + " ¿Es par? " + par(num));

            // agregar a la lista si es par
            if (par(num) == 1) {
                pares.add(num);
            }
        }

        // mostrar la lista de pares (imperativa)
        System.out.println("------------ArrayList pares------------");
        for (Integer n : pares) {
            System.out.println(n);
        }

        // mostrar pares con programación declarativa
        System.out.println("------------ArrayList pares: Prog declarativa------------");
        positivos.forEach((var) -> {
            if (par(var) == 1) { // verificar si es par
                pares2.add(var); // agregar a la lista
                System.out.println("El número " + var + " es par");
            }
        });
    }

    // función para verificar si un número es par
    public static int par(int n) {
        // retornar 1 si es par, 0 si no
        return n % 2 == 0 ? 1 : 0;
    }
}
