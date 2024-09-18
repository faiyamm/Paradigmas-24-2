package UNIDAD1.U1_E12;
/* programa que le pide al usuario la edad y las siglas de su país. */

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        // declaración de variables
        int edad;
        String pais = "", siglas = "";
        float[] costo = {30, 120, 70, 60}; // costos de visas en dólares
        float dinero = 200; //variable para asignar dinero
        String[] paises = {"Mexico", "Estados Unidos", "China", "Corea"};

        // pedir edad
        do {
            System.out.println("Edad: ");
            edad = Integer.parseInt(leer.nextLine());  // convertir a entero
        } while (edad < 0 || edad > 120);  // verificar que la edad sea entre 0 y 120

        // clasificar a la persona según la edad que tenga
        if (edad < 18)
            System.out.println("Menor de edad");
        else if (edad >= 18 && edad <= 30)
            System.out.println("Adulto joven");
        else if (edad > 30 && edad <= 60)
            System.out.println("Adulto mayor");
        else
            System.out.println("Adulto de tercera edad");

        // pedir las siglas del país para guardarlas
        System.out.println("Siglas del país (MEX, USA, CHI, KR): ");
        siglas = leer.nextLine();

        // asignar las siglas a su país correspondiente
        switch (siglas) {
            case "MEX" -> pais = "Mexico\n";
            case "USA" -> pais = "Estados Unidos\n";
            case "CHI" -> pais = "China\n";
            case "KR" -> pais = "Corea\n";
            default -> pais = "País no válido\n";  // en caso de siglas inválidas
        }
        System.out.println(pais);  // imprimir el nombre del país o el mensaje de error según el caso

        // si es mexicano, calcular cuántas visas le alcanzan con el dinero
        if (siglas.equals("MEX")) {
            for (int i = 0; i < costo.length; i++) {
                // verificar si tiene suficiente dinero para una visa
                if (dinero >= costo[i]) {
                    System.out.println("Visa de " + paises[i]);  // Imprimir el tipo de visa
                    dinero -= costo[i];  // restar el costo de la visa al dinero disponible
                }
            }
        }

    }
    
}
