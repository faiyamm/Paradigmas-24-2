package UNIDAD2.U2_E23;

/* Este ejercicio gestiona la información de empleados, puestos y personas, incluyendo
 * funcionalidades para manejar los datos de los empleados y puestos, mostrar los registros, 
 * agregar nuevos datos y guardarlos en un txt file y cargar la info desde un archivo ya existente. 
 */

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // inicializar objetos de ejemplo
        Persona vendedor = new Persona();
        Persona profesor = new Persona("Roberto");
        Persona alumno = new Persona("Arturo", 1.78f, true);

        // inicializar puestos de ejemplo
        Puesto secretaria = new Puesto(3600, "Asistente administrativa");
        Puesto chofer = new Puesto(1800, "Conductor");

        // inicializar empleado de ejemplo
        Empleado conserje = new Empleado(3000, 'V');
        conserje.setNombre("Mike");
        conserje.setActivo(true);
        conserje.setActividad(secretaria);

        System.out.println(conserje.toString());
        System.out.println("------------------------------------------------------");

        // ruta del archivo
        String myFile = "/workspaces/Paradigmas-24-2/UNIDAD2/U2_E23/Puestos.txt";
        ArrayList<Puesto> puestos = new ArrayList<>(); // lista de puestos
        ArrayList<Empleado> empleados = new ArrayList<>(); // lista de empleados

        // leer archivo de puestos si existe
        File file = new File(myFile);
        if (file.exists()) {
            try {
                readFile(myFile, puestos);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Archivo de puestos no encontrado. Se creará un archivo vacío al guardar.");
        }

        // menú interactivo
        int opcion;
        do {
            menu();
            opcion = leer.nextInt();
            leer.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // insertar puesto
                    System.out.println("Nombre del Puesto: ");
                    String nombre = leer.nextLine();

                    System.out.println("Salario semanal: ");
                    int salario = Integer.parseInt(leer.nextLine());

                    int id = puestos.size() + 1;
                    Puesto nuevoPuesto = new Puesto(id, salario, nombre);
                    puestos.add(nuevoPuesto); // agregar puesto a la lista
                    break;

                case 2: // mostrar puestos
                    for (Puesto puesto : puestos) {
                        System.out.println(puesto);
                    }
                    break;

                case 3: // insertar empleado
                    System.out.println("Nombre: ");
                    String nombreEmpleado = leer.nextLine();
                    System.out.println("Estatura: ");
                    float estatura = Float.parseFloat(leer.nextLine());
                    System.out.println("Antigüedad: ");
                    int antiguedad = Integer.parseInt(leer.nextLine());
                    System.out.println("Turno M/V/N: ");
                    char turno = leer.nextLine().charAt(0);

                    Empleado nuevoEmpleado = new Empleado();
                    nuevoEmpleado.setNombre(nombreEmpleado);
                    nuevoEmpleado.setEstatura(estatura);
                    nuevoEmpleado.setTiempo(antiguedad);
                    nuevoEmpleado.setTurno(turno);
                    empleados.add(nuevoEmpleado); // agregar empleado a la lista
                    break;

                case 4: // guardar puestos
                    try {
                        grabarArchivo(myFile, puestos);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Puestos guardados con éxito.");
                    break;

                case 5: // mostrar empleados
                    for (Empleado empleado : empleados) {
                        System.out.println(empleado);
                    }
                    break;

                case 9: // salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 9);

        leer.close(); // cerrar escáner
    }

    // método para grabar puestos en un archivo
    public static void grabarArchivo(String archivo, ArrayList<Puesto> array) throws Exception {
        File file = new File(archivo);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Puesto puesto : array) {
            writer.write(puesto.getNum() + "," + puesto.getNombre() + "," + puesto.getSalario() + "\n");
        }
        writer.close();
    }

    // método para leer puestos desde un archivo
    public static void readFile(String archivo, ArrayList<Puesto> array) throws Exception {
        InputStream ins = new FileInputStream(archivo);
        Scanner obj = new Scanner(ins);
        while (obj.hasNextLine()) {
            String linea = obj.nextLine();
            String[] parts = linea.split(",");
            Puesto puesto = new Puesto(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]), parts[1]);
            array.add(puesto);
        }
        obj.close();
    }

    // menú principal
    public static void menu() {
        System.out.println("Ejercicio 23: Empleados con objetos\n" +
                "1. Insertar puestos\n" +
                "2. Mostrar puestos\n" +
                "3. Insertar empleados\n" +
                "4. Guardar puestos\n" +
                "5. Mostrar empleados\n" +
                "9. Salir\n" +
                "Opción:");
    }
}
