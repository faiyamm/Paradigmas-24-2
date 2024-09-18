/* Ejercicio 1: Se capturan varios datos como letras, nombre completo del usuario y fecha de nacimiento. 
Dichos datos se almacenan en un array de caracteres. 
El programa también valida si el año es bisiesto y que los días correspondan al mes respectivo. */

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Tipos de datos en java");
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        char[] iniciales = new char[10]; // array de 10 para almacenar iniciales

        // declarar variables del programa
        char letra;
        String nombre, paterno, materno;
        byte aa, mm, dd;

        // capturar una letra del usuario
        System.out.println("Letra: ");
        letra = leer.nextLine().charAt(0);

        // capturar nombre completo del usuario
        System.out.println("Nombre: ");
        nombre = leer.nextLine();
        System.out.println("Apellido paterno: ");
        paterno = leer.nextLine();
        System.out.println("Apellido materno: ");
        materno = leer.nextLine();

        // capturar y validar fecha de nacimiento del usuario
        do{
            System.out.println("Año(íltimos 2 dígitos): ");
            aa = leer.nextByte();
        } while(aa < 1 || aa >99);

        //verificar si el año es bisiesto o no
        if ((aa % 400 == 0) || ((aa % 4 == 0) && (aa % 100 != 0))) {
            System.out.println("El año " + aa + " es un año bisiesto");
          } else {
            System.out.println("NO es un año bisiesto");
          }
      
        // checar y verificar los días de los meses
        do {
            System.out.println("Mes: ");
            mm = leer.nextByte();
        } while (mm < 1 || mm > 12);
      
        if (mm == 2) {
            System.out.println("Este mes tiene 28 o 29 días");
        } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
            System.out.println("Este mes tiene 30 días");
        } else {
            System.out.println("Este mes tiene 31 días");
        }

        // checar y verificar los días
        do {
            System.out.println("Día: ");
            dd = leer.nextByte();
        } while (dd < 1 || dd > 31);

        // asignar iniciales en el arreglo
        iniciales[0] = paterno.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del apellido paterno
        iniciales[1] = ' '; // espacio vacío
        iniciales[2] = materno.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del apellido materno
        iniciales[3] = nombre.toUpperCase().charAt(0); // convertir a mayúscula la primera letra del nombre

        // arreglo para convertir y almacenar el año y mes a caracteres 
        if (aa < 10) {
            iniciales[4] = '0'; // por si el año es un solo dígito se añade 0
            iniciales[5] = (char)('0' + aa);
        }
        else {
            iniciales[4] = (char) ('0' + aa / 10);  // Primer dígito del año
            iniciales[5] = (char) ('0' + aa % 10);  // Segundo dígito del año
        }

        if (mm < 10) {
            iniciales[6] = '0'; // igual que anteriormente, se añade 0 si es un mes de un solo dígito
            iniciales[7] = (char) ('0' + mm);
        } else {
            iniciales[6] = (char) ('0' + mm / 10);  // 1er num del mes
            iniciales[7] = (char) ('0' + mm % 10);  // 2do num del mes
        }

        // imprimir datos
        System.out.println("Comprobando tipos de datos:");
        System.out.println(nombre + " " + paterno + " " + materno);
        System.out.println(letra);

        // deplegar el arreglo con el método que se creo
        desplegarArreglo(iniciales);
    }

    // método para poder imprimir el arreglo
    public static void desplegarArreglo(char[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}