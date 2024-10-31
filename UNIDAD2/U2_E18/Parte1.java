package UNIDAD2.U2_E18;

/* Este programa implementa varias operaciones usando recursividad, bucles y arrays. La funcionalidad principal 
se centra en la multiplicación mediante sumas repetitivas, sumas usando recursividad, y en el llenado de un arreglo 
on números sin repeticiones. */

import java.util.Scanner;
import java.util.Random;

public class Parte1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 7;
        int op = 5; // Operador para multiplicación
        int total = 0;

        // Multiplicación usando sumas
        System.out.println("==== MULTIPLICACIÓN USANDO SUMAS ====");
        for (int i = 0; i < op; i++) {
            total += num; // Sumar num tantas veces como indica op
        }
        System.out.println(num + " * " + op + " = " + total);

        System.out.println("\n==== SUMAS USANDO RECURSIÓN ====");
        total = sumaRecursiva(num); // Llamar a la función recursiva
        System.out.println("Resultado de suma recursiva: " + total);

        System.out.println("\n==== SUMAS CON BUCLE WHILE ====");
        num = 9;
        total = 0;
        while (num > 0) {
            total += num; // Sumar valor de num a total
            num--;
        }
        System.out.println("Resultado de suma con bucle: " + total);

        System.out.println("\n==== PRUEBA CON ARREGLOS ====");
        int[] arr = new int[10];
        iniciar(arr); // Inicializar arreglo con valores -1
        rellenarSinRepetidos(arr); // Llenar arreglo sin valores repetidos
        mostrar(arr); // Mostrar contenido del arreglo
        leer.close();
    }
    
    // Función recursiva para realizar la suma de números descendentes desde num hasta 1
    public static int sumaRecursiva(int num) {
        int res = 0;

        // Caso base: si num es 1, retornar 1
        if (num == 1) {
            return 1;
        } else {
            res += num + sumaRecursiva(num - 1); // Sumar num y llamar recursivamente
        }
        return res; // Retornar el resultado de la suma recursiva
    }

    // Inicializar arreglo con valor -1 en todas sus posiciones
    public static void iniciar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = -1; // Asignar valor -1 en cada posición
        }
    }

    // Mostrar el contenido del arreglo
    public static void mostrar(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println("[" + i + "] = " + b[i]); // Imprimir índice y valor
        }
    }

    // Llenar el arreglo con números aleatorios sin repetir, usando bucle
    public static void rellenarSinRepetidos(int[] d) {
        int num;
        boolean repetido;

        int i = 0; // Índice de posición a rellenar
        while (i < d.length) {
            repetido = false;
            num = (int) (Math.random() * 15 + 1); // Generar número aleatorio entre 1 y 15

            // Verificar que num no se repita en el arreglo
            for (int j = 0; j < d.length; j++) {
                if (num == d[j]) {
                    repetido = true;
                    break;
                }
            }

            // Si no es repetido, asignar a la posición actual y avanzar al siguiente índice
            if (!repetido) {
                d[i] = num;
                i++;
            }
        }
    }

    // Generar un número aleatorio y verificar que no se repita en el arreglo
    public static int gen(int[] a) {
        boolean repetido = false;
        Random ra = new Random();
        int numero = ra.nextInt(a.length + 1); // Generar número aleatorio en rango

        // Verificar si el número ya existe en el arreglo
        for (int i = 0; i < a.length; i++) {
            if (numero == a[i]) {
                repetido = true;
                break;
            }
        }
        
        // Si el número no es repetido, retornar; si es repetido, llamar recursivamente
        if (!repetido) {
            return numero;
        } else {
            return gen(a);
        }
    }
}
