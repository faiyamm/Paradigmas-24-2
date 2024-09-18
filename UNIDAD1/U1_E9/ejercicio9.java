package UNIDAD1.U1_E9;
/* Ejercicio 9: Programa que le permite al usuario ingresar su fecha de nacimiento y el programa la convierte a texto. */

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        //declarar variables día, mes y año
        int dd, mm, aa;

        // pedirle al usario su fecha de nacimiento
        System.out.println("Fecha de nacimiento (Escriba en 2 dígitos)");
        System.out.print("Día: ");
        dd = Integer.parseInt(leer.nextLine());  // convertir a entero

        // meses
        do {
            System.out.print("Mes: ");
            mm = leer.nextInt(); 
        } while (mm < 1 || mm > 12);  // validar que el mes esté entre 1 y 12

        // años
        do {
            System.out.print("Año: ");
            aa = leer.nextInt();  
        } while (aa < 0 || aa > 99);  // validar que el año esté entre 0 y 99

        // convertir la fecha de nacimiento a letras y mostrar el resultado
        System.out.println("Naciste el " + nombreDia(dd) + " de " + nombreMes(mm) + " de " + nombreYear(aa));
    }

    // método para convertir el día en texto
    public static String nombreDia(int numero) {
        String dia = "";  // Declarar variable para almacenar el día en texto
        int decenas = numero / 10;  // Calcular decenas del día
        int unidades = numero % 10;  // Calcular unidades del día

        // Si el día está entre 10 y 15, utilizar nombres especiales
        if (numero >= 10 && numero <= 15) {
            switch (numero) {
                case 10: dia = "diez"; break;
                case 11: dia = "once"; break;
                case 12: dia = "doce"; break;
                case 13: dia = "trece"; break;
                case 14: dia = "catorce"; break;
                case 15: dia = "quince"; break;
            }
        } else {
            // Si el día es mayor, formar el número con decenas y unidades
            switch (decenas) {
                case 1: dia = "dieci"; break;
                case 2: dia = "veinti"; break;
                case 3: dia = "treinta"; break;
            }
            // Agregar las unidades al nombre del día
            switch (unidades) {
                case 1: dia += "uno"; break;
                case 2: dia += "dos"; break;
                case 3: dia += "tres"; break;
                case 4: dia += "cuatro"; break;
                case 5: dia += "cinco"; break;
                case 6: dia += "seis"; break;
                case 7: dia += "siete"; break;
                case 8: dia += "ocho"; break;
                case 9: dia += "nueve"; break;
            }
        }

        return dia;  // regresar el nombre del día
    }

    // mes a texto
    public static String nombreMes(int numero) {
        String mes = "";
        switch (numero) {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febrero"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
            case 7: mes = "Julio"; break;
            case 8: mes = "Agosto"; break;
            case 9: mes = "Septiembre"; break;
            case 10: mes = "Octubre"; break;
            case 11: mes = "Noviembre"; break;
            case 12: mes = "Diciembre"; break;
        }
        return mes;  // regresar el nombre del mes
    }

    //  año a texto
    public static String nombreYear(int numero) {
        String year = ""; 
        // si el año es entre 0 y 9, agregar como "dos mil x"
        if (numero >= 0 && numero <= 9) {
            year = "dos mil " + nombreDia(numero);
        } 
        // si el año está entre 10 y 99, usar "mil novecientos x"
        else if (numero >= 10 && numero <= 99) {
            if (numero < 21) {
                year = "dos mil " + nombreDia(numero);  // para años entre 00-20
            } else {
                year = "mil novecientos " + nombreDia(numero);  // para años mayores
            }
        }
        return year;  // regresar el nombre del año

    }
}
