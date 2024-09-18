package UNIDAD1.U1_E14;
/* programa que imprime todas las combinaciones de horas y minutos para un formato de reloj de 12 horas (AM/PM). */

public class ejercicio14 {
    public static void main(String[] args) {

        // declarar variables, horas y minutos
        int hh = 0, mm = 0;

        //ciclo anidado para recorrer todas las horas del día y los minutos
        for (int i = 0; i < 24; i++) {
            // minutos
            for (int j = 0; j < 60; j++) {
                // verificar que la hora sea mayor o igual a 13
                if (i >= 13) 
                    System.out.print(i % 12 + ":"); // imprimir la hora en formato de 12 horas
                else 
                    System.out.print(i + ":"); // imprimir la hora en formato de 24 horas

                // imprimir los minutos en formato de dos dígitos
                System.out.printf("%02d", j);

                // checar si la hora es menor o igual a 12 para am y pm
                if (i < 12) 
                    System.out.println(" am"); // imprimir am para horas entre 0 y 12
                else if (i == 12) 
                    System.out.println(" pm"); // imprimir pm para la hora 12
                else 
                    System.out.println(" pm"); // imprimir pm para horas mayores a 12
            }
        }

    }
    
}
