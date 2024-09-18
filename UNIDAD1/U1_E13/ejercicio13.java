package UNIDAD1.U1_E13;
/* programa que pide la dirección en Baja California, solicitando un código postal (CP) válido y un municipio. También
se valida que el CP sea correcto y a que municipio pertenece*/

import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // leer datos de entrada

        //declarar variables
        String CP = "";
        String municipio;
        String[] municipios = {"MEXICALI", "TECATE", "SAN FELIPE", "TIJUANA", "ROSARITO", "ENSENADA", "SAN QUINTIN"};
        boolean correcto=false; // validación

        System.out.println("Dirección en Baja California");

        do{ // pedir CP
        System.out.println("CP: ");
        CP = leer.nextLine();

        // zona de mensajes
        if(CP.length()!=5) System.out.println("Escriba 5 números");
        if (correcto==false) System.out.println("El CP no es de BC");
            // verificar que el CP sea de BC
        correcto = CP.charAt(0)=='2' ? true:false;
        if (correcto==true){ // if para analizar la segunda posición
            correcto = CP.charAt(1)=='1' || CP.charAt(1)=='2' ? true:false;
        }

        } while(CP.length()!=5 || correcto==false);

        do{
            System.out.println("Municipio:");
            municipio = leer.nextLine().toUpperCase();
            correcto=false; //reiniciar la variable de validación

            int i=0;

            do{
                if(municipio.equals(municipios[i]))
                    correcto=true; // si coincide, es correcto
                i++;
            } while(correcto==false && i < municipios.length);

        } while(municipio.length()<1 || correcto==false); // se repite si el municipio no es válido
        // fin del programa
        System.out.println("Datos válidos.");
    }
    
}
