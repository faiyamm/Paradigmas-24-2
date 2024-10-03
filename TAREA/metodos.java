package TAREA;

/* Realizar metodos que validen lo siguiente:
Leer un float
Leer una palabra sin espacio
Leer un nombre con espacio
Leer un caracter alfabetico
Leer un caracter numerico
 */
import java.util.Scanner;

public class metodos {

    public static void leerFloat() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar un float: ");
        
        float valor = leer.nextFloat(); // leer el float
        
        // verificar si tiene parte decimal
        if (valor % 1 != 0) {
            System.out.println("Validación correcta");
        } else {
            System.out.println("Entrada inválida, ingresar un float.");
        }
    }

    public static void palabraSinespacio() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar una palabra sin espacio: ");
        
        String palabra = leer.nextLine();
        if (palabra.contains(" ")) System.out.println("NO espacios!!!");
        else System.out.println("OK, bien!!");

    }

    public static void nombreConEspacio() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar un nombre con espacio: ");
        
        String nombre = leer.nextLine();
        if (nombre.contains(" ")) System.out.println("OK, bien!!");
        else System.out.println("Entrada inválida, ingresar un nombre con espacio.");
    }

    public static void caracterAlfabetico() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar un caracter alfabético: ");
        
        char caracter = leer.next().charAt(0);
        if (Character.isLetter(caracter)) System.out.println("OK, bien!!");
        else System.out.println("Entrada inválida, ingresar un caracter alfabético.");
    }

    public static void caracterNumerico() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar un caracter numérico: ");
        
        char caracter = leer.next().charAt(0);
        if (Character.isDigit(caracter)) System.out.println("OK, bien!!");
        else System.out.println("Entrada inválida, ingresar un caracter numérico.");
    }

    public static void main(String[] args) {
        leerFloat();
        palabraSinespacio();
        nombreConEspacio();
        caracterAlfabetico();
        caracterNumerico();
    }
}

