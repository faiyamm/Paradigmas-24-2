package UNIDAD2.U2_E20;

/* Este programa es un juego de “gato” (tic-tac-toe) que permite a dos jugadores competir turnándose para colocar su letra (X o O) 
en una cuadrícula de 3x3 hasta que uno gane o se termine en empate. Cada turno valida la posición elegida y actualiza el tablero, 
mostrando el estado en cada paso.
*/

import java.util.Scanner;

public class Ejercicio20 {

    public static Scanner leer = new Scanner(System.in); // Crear escáner global para lectura de entrada

    public static void main(String[] args) {
        // Declarar variables de las letras elegidas por cada jugador
        String letraJug1, letraJug2;
        int pos; // Declarar posición elegida en el turno actual
        boolean turno = true; // Indica si es el turno del Jugador 1
        boolean victoria = false; // Indica si alguien ha ganado

        String[] gato = new String[9]; // Crear tablero de 9 posiciones

        inicializar(gato); // Inicializar tablero con posiciones numeradas
        mostrar(gato); // Mostrar estado inicial del tablero
        
        // Pedir al Jugador 1 que elija su letra
        letraJug1 = pedirLetra();
        letraJug2 = letraJug1.equals("X") ? "O" : "X"; // Asignar la otra letra al Jugador 2

        System.out.println("Jugador 1 tira " + letraJug1);
        System.out.println("Jugador 2 tira " + letraJug2);

        mostrar(gato); // Imprimir tablero tras elegir las letras

        // Bucle principal del juego
        do {
            System.out.print("Posición Jug " + (turno ? "1" : "2") + ": ");
            pos = Integer.parseInt(leer.nextLine()); // Leer y convertir posición a entero

            // Verificar si la posición está disponible
            if (disponible(pos, gato)) {
                gato[pos - 1] = turno ? letraJug1 : letraJug2; // Asignar letra al tablero
                turno = !turno; // Cambiar el turno al otro jugador
                victoria = ganador(gato); // Verificar si alguien ha ganado
            } else {
                System.out.println("Posición ocupada"); // Avisar si la posición no está libre
            }
            mostrar(gato); // Mostrar tablero actualizado
        } while (!estaLleno(gato) && !victoria); // Repetir hasta victoria o empate

        // Mostrar resultado final
        if (victoria) {
            if (!turno) System.out.println("Ganó Jugador 1");
            else System.out.println("Ganó Jugador 2");
        } else {
            System.out.println("¡Es un empate!");
        }
    }

    // Método para pedir y validar la letra del Jugador 1
    public static String pedirLetra() {
        String dato;
        do {
            System.out.println("Elige X ó O: ");
            dato = leer.nextLine().toUpperCase(); // Leer y convertir a mayúsculas
        } while (!dato.equals("X") && !dato.equals("O")); // Asegurar que sea X o O
        return dato;
    }

    // Método para inicializar el tablero numerado
    public static void inicializar(String[] g) {
        for (int i = 0; i < g.length; i++) {
            g[i] = Integer.toString(i + 1); // Asignar posición numérica como valor inicial
        }
    }

    // Método para mostrar el tablero en formato de 3x3
    public static void mostrar(String[] g) {
        for (int i = 0; i < g.length; i += 3) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + g[i + j] + "]"); // Imprimir posición con formato
            }
            System.out.println(); // Nueva línea para cada fila
        }
    }

    // Verificar si la posición en el tablero está disponible
    public static boolean disponible(int pos, String[] g) {
        return !g[pos - 1].equals("X") && !g[pos - 1].equals("O"); // Retornar si no es "X" ni "O"
    }

    // Verificar si el tablero está lleno
    public static boolean estaLleno(String[] g) {
        for (int i = 0; i < g.length; i++) {
            if (Character.isDigit(g[i].charAt(0))) // Verificar si queda un número
                return false;
        }
        return true; // Retornar true si no quedan números
    }

    // Comprobar si hay un ganador con filas, columnas o diagonales coincidentes
    public static boolean ganador(String[] g) {
        // Comprobar columnas
        if (g[0].equals(g[3]) && g[3].equals(g[6]) ||
            g[1].equals(g[4]) && g[4].equals(g[7]) ||
            g[2].equals(g[5]) && g[5].equals(g[8])) {
            return true;
        }

        // Comprobar filas
        if (g[0].equals(g[1]) && g[1].equals(g[2]) ||
            g[3].equals(g[4]) && g[4].equals(g[5]) ||
            g[6].equals(g[7]) && g[7].equals(g[8])) {
            return true;
        }

        // Comprobar diagonales
        if (g[0].equals(g[4]) && g[4].equals(g[8]) ||
            g[2].equals(g[4]) && g[4].equals(g[6])) {
            return true;
        }

        return false; // Retornar false si no hay coincidencia
    }
    
}
