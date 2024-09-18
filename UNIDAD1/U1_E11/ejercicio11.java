package UNIDAD1.U1_E11;
/* programa que genera un número random n entre 1 y 50 y luego imprime los numeros pares, impares y negativos */

public class ejercicio11 {
    public static void main(String[] args) {
        // variable que contiene el valor random entre 1 y 50
        int n = (int)(50 * Math.random()) + 1;
        // variable para números impares
        int imp = 1;

        // imprimir los números pares desde 0 hasta 'n' aka el número random
        System.out.println("Pares");
        for (int i = 0; i <= n; i++) {
            // verificar si el número es par
            if(i % 2 == 0) {
                System.out.println(i);  // imprimir el número si es par
            }
        }

        // imprimir los primeros 5 números impares
        System.out.println("Impares");
        while(imp <= 5) {
            // calcular y mostrar el número impar
            System.out.println(2 * imp - 1);
            imp++;  // incrementar el contador de impares
        }

        // imprimir los equivalentes negativos de los números
        System.out.println("Equivalente negativo");
        int numNeg = n;  // contador en n para los numeros negativos
        do {
            System.out.println(-numNeg);  // imprimir el negativo de numNeg
            numNeg--;  // disminuir el valor de numNeg
        } while(numNeg >= 0);  // sigue si numNeg es mayor o igual a 0
    }
    
}
