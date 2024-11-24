package UNIDAD2.U2_E22;

/* Programa que simula la gestión de personas, puestos y empleados en una organización.
 * Utilizando herencia, encapsulamiento y sobrecarga de métodos.
 */

public class Main {
    public static void main(String[] args) {
        // Instancias de Persona
        Persona vendedor = new Persona(); // persona sin datos
        Persona profesor = new Persona("Roberto"); // persona con nombre
        Persona alumno = new Persona("Arturo", 1.78f, true); // persona con todos los datos

        // Instancias de Puesto
        Puesto secretaria = new Puesto(3600, "Secretaria");

        // Imprimir info de las personas
        System.out.println(vendedor.toString());
        System.out.println(profesor.toString());
        System.out.println(alumno.toString());
        System.out.println("\n---------------------------------------------------------");

        // Instancias de Empleado
        Empleado conserje = new Empleado(3000, 'V'); // empleado con tiempo y turno
        conserje.setNombre("Mike"); // asignar nombre al empleado
        conserje.setActivo(true); // activar empleado
        conserje.setActividad(secretaria); // asignar puesto

        // Imprimir info del empleado
        System.out.println(conserje.toString());
    }
}