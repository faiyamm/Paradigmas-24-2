package UNIDAD1.U1_E7;
/* Programa que calcula el IVA de un producto y usa operadores ternarios para derterminarlo basandose en el precio del producto */

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        // 3 valores aleatorios entre 1 y 50
        int valor1 = (int)(Math.random()*50+1);  
        int valor2 = (int)(Math.random()*50+1); 
        int valor3 = (int)(Math.random()*50+1); 
        double iva = 0;  // almacenar el cálculo del IVA
        
        /*  Se aplica un IVA de acuerdo a la siguiente lógica:
        - Si valor1 es mayor a 39, el IVA es 3% (0.03).
        - Si valor1 está entre 30 y 39 (inclusive), el IVA es 2% (0.02).
        - Si valor1 es menor a 30, no se aplica IVA (0%). */

        // operador ternario para calcular el IVA
        iva = (valor1 > 39) ? valor1 * 0.03 : ((valor1 > 29) ? valor1 * 0.02 : 0);


        // imprimir el precio de los productos
        System.out.println("Precio 1 = " + valor1);  
        System.out.println("Precio 2 = " + valor2); 
        System.out.println("Precio 3 = " + valor3); 

        System.out.println("IVA = " + iva);  // IVA calculado
        System.out.println("Total = " + (valor1 + iva));  // precio total con IVA incluido
    }
    
}
