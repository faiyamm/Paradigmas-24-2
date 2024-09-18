package UNIDAD1.U1_E10;
/* programa que imprime los primeros números de la serie de fibonacci */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        // declarar variables para la serie de fibonacci
        int n1 = 0;  // número 1 de la serie de Fibonacci
        int n2 = 1;  // número 2 de la serie de Fibonacci
        int aux = 0; // variable auxiliar para almacenar la suma de n1 y n2

        // mmprimir n1 y n2
        System.out.println(n1);
        System.out.println(n2);

        // do-while para calcular e imprimir los números de la serie de fibonacci
        do {
            aux = n1 + n2;  // sumar n1 y n2, asignar el resultado a aux
            n1 = n2;        // actualizar n1 al valor de n2
            n2 = aux;       // actualizar n2 al valor de aux
            System.out.println(aux);  // imprimir el número de fibonacci calculado
        } while (aux < 11);  // el bucle continua mientras aux sea menor que 11

    }
    
}
