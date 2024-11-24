package UNIDAD3.U3_E26;

import java.util.Scanner;

/* Este ejercicio es una introducción a las funciones lambda y clases anónimas.
 * También, se muestra como utilizar interfaces funcionales para simplificar el código.
 */

public class Main {
    public static void main(String[] args) {
        // declarar escáner para entrada de datos
        Scanner leer = new Scanner(System.in);

        // declarar y usar una función lambda simple con interfaz
        // el código dentro de las llaves reemplaza el método abstracto
        MyInterface lambda = () -> {
            // imprimir un mensaje con una función lambda
            System.out.println("Lambda con interfaz");
        };

        // ejecutar la función lambda
        lambda.saludo();
        System.out.println("------------------------------------------");

        // definir otra función lambda con varias líneas de código
        MyInterface lambda2 = () -> {
            // imprimir mensajes dentro de la función lambda
            System.out.println("Primer encuentro con prog. funcional");
            System.out.println("Probando funciones lambda");
            System.out.println("Suma 2 + 3 = " + (2 + 3)); // calcular y mostrar suma
        };

        // ejecutar la segunda lambda
        lambda2.saludo();
        System.out.println("------------------------------------------");

        // usar una función lambda con una sola instrucción (sin llaves)
        lambda = () -> System.out.println(2 + 3); // calcular y mostrar suma
        lambda.saludo();
        System.out.println("------------------------------------------");

        // función lambda con un parámetro que regresa un valor
        MyInterface2 lambda4 = (nombre) -> 
            // regresar un mensaje usando el parámetro
            nombre + " está aprendiendo lambda.";

        // mostrar el resultado de la lambda
        System.out.println(lambda4.prueba2("Sofía"));
        System.out.println("------------------------------------------");

        // usar una clase anónima que implementa la interfaz Asistencia
        new Asistencia() {
            private int presente; // declarar variable

            public void asiste() {
                // mostrar un mensaje cuando el alumno está presente
                System.out.println("El alumno sí llegó a clase");
            }
        }.asiste();
        System.out.println("------------------------------------------");

        // crear otra clase anónima para un usuario con métodos adicionales
        Usuario persona = new Usuario() {
            // definir método para crear usuario
            public void crearUsuario() {
                System.out.println("Usuario creado");
            }

            // definir método para borrar usuario
            public void borrarUsuario() {
                System.out.println("Usuario borrado");
            }
        };

        // ejecutar los métodos de la clase anónima
        persona.crearUsuario();
        persona.borrarUsuario();
        System.out.println("------------------------------------------");
    }
}
