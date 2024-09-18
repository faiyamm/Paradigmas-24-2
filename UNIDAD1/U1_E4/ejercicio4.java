package UNIDAD1.U1_E4;
/* Simulador de tiendita de dulces donde el usuario introduce la cantidad de saldo que tiene, escoge que quiere comprar
 * mientras que se le va descontando su saldo con cada compra que realiza
 */

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer entradas de usuario

        // declarar variable del saldo que posee el usuario
        System.out.print("¿Cuánto dinero tienes? ");
        int dinero = Integer.parseInt(leer.nextLine());

        System.out.println("Tu saldo es $" + dinero); // mostrar saldo disponible

        // menú principal de la tiendita
        int opc=0;
        do{
            menu();
            System.out.println("¿Qué deseas comprar?");
            System.out.println("Opción: ");
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) { // descontar el dinero del producto en un ciclo while
                case 1: //mazapan 10
                    if (dinero>=10){
                        dinero -= 10; // descontar precio del dulce en el saldo
                        System.out.println("Te sobraron $ " + dinero);
                    } else System.out.println("No te alcanza");
                    break;
                case 2: // chocolate 15
                    if (dinero>=15){
                        dinero -= 15;
                        System.out.println("Te sobraron $ " + dinero);
                    } else System.out.println("No te alcanza");
                    break;
                
                case 3: //gomitas 20
                    if (dinero>=20){
                        dinero -= 20;
                        System.out.println("Te sobraron $ " + dinero);
                    } else System.out.println("No te alcanza");
                    break;
            
                case 9: 
                    break;
                
                default:
                    System.out.println("Opción invalida");
                    break;
            }


        } while (dinero>0 && opc!=9); // el bucle continua mientras el usuario tenga saldo disponible o deseé salir del programa
    }

    // menú principal
    public static void menu() {
        System.out.println("Menú de dulces\n 1. Mazapan $10\n 2. Chocolate $15\n 3. Gomitas $20\n 9.Salir");
        
    }
}
