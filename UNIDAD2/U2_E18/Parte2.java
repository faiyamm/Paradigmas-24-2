package UNIDAD2.U2_E18;

/* Este programa genera una lista de números aleatorios 
sin repeticiones usando recursividad para verificar que los números generados 
no estén duplicados en la lista. Luego, imprime el conjunto de números generados */

import java.util.ArrayList;
import java.util.Random;

public class Parte2 {
    /**
     * Genera una lista de números aleatorios sin repetición.
     * @param cantidad cantidad de números no repetidos a crear. Debe ser menor al límite del Random.
     * @return arreglo de números no repetidos.
     */
    public static ArrayList<Integer> generarAleatoriosNoRepetidos(int cantidad) {
        ArrayList<Integer> respuesta = new ArrayList<>();
        // Generar y agregar números no repetidos a la lista
        for (int i = 0; i < cantidad; i++) {
            respuesta.add(gen(respuesta));
        }
        return respuesta;
    }

    /**
     * Método recursivo que genera un número aleatorio. Verifica si el número ya existe en el arreglo; 
     * si es repetido, intenta de nuevo hasta encontrar uno no repetido.
     * @param a lista de números aleatorios previamente generados.
     * @return número que no existe en la lista.
     */
    public static int gen(ArrayList<Integer> a) {
        Random ra = new Random();
        int numero = ra.nextInt(11); // Generar número aleatorio entre 0 y 10

        // Verificar si el número no está en la lista
        if (!a.contains(numero)) {
            System.out.println("Asignado " + numero); // Número único encontrado
            return numero;
        } else {
            System.out.println("Repetido " + numero); // Número repetido, intentar de nuevo
            return gen(a); // Llamada recursiva para intentar otro número
        }
    }

    /**
     * Imprime los elementos de la lista.
     * @param num lista a imprimir.
     */
    public static void imprimir(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i)); // Imprimir elemento en la posición i
        }
    }

    public static void main(String[] args) {
        // Llamar al método con la cantidad de números no repetidos deseada
        imprimir(generarAleatoriosNoRepetidos(10));
    }
}
