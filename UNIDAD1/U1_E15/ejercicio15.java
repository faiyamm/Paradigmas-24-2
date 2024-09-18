package UNIDAD1.U1_E15;
/* programa que emula un temporizador usando ciclos anidados */

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // declarar variables
        int n; // almacenar los minutos que desea poner el usuario en el temporizador

        // pedir al usuario ingresar los minutos que desea
        System.out.println("Minutos: ");
        n = Integer.parseInt(leer.nextLine());
        int totalseg = n * 60; // convertir los minutos a segundos

        int segres = totalseg; // contador para los segundos restantes

        for (int i = totalseg; i >= 0; i--) { // loop para contar hacia atrás
            // imprimir el tiempo que resta en un formato hh:mm:ss
            int horas = segres / 3600;
            int minutos = (segres % 3600) / 60;
            int segundos = segres % 60;
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

            // decrementar los segundos restantes
            segres--;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error en la pausa.");
            }
        }

    }

}