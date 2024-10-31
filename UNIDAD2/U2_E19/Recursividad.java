package UNIDAD2.U2_E19;

/* Este programa navega de manera recursiva a través de las carpetas y archivos dentro de una ruta específica. 
Comienza en una carpeta dada y lista los archivos y subcarpetas, 
indicando los niveles de profundidad mediante tabulaciones en la salida. */

import java.io.File;

public class Recursividad {
    public static void main(String[] args) {
        // Definir la ruta inicial de la carpeta a explorar
        File fichero = new File("UNIDAD2/U2_E19/Carpeta"); // ruta inicial
        // Llamar a la función recursiva para mostrar el contenido
        mostrarCarpeta(fichero, "->  ");
    }

    public static void mostrarCarpeta(File fichero, String tab) {
        // Verificar si la ruta es un directorio
        if (fichero.isDirectory()) {
            // Extraer lista de archivos y carpetas dentro del directorio
            File[] lista = fichero.listFiles(); 
            if (lista != null) { // Asegurar que la lista no es nula
                for (File file : lista) {
                    System.out.println(tab + file.getName()); // Imprimir el nombre del archivo/directorio

                    // Llamada recursiva si es un directorio
                    if (file.isDirectory()) {
                        mostrarCarpeta(file, "--" + tab); // Bajar de nivel en la estructura
                    }
                }
            }
        } else {
            // Mostrar mensaje si la ruta no es un directorio válido
            System.out.println("Ruta incorrecta o no es un directorio");
        }
    }
}
