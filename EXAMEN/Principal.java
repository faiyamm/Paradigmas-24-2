package EXAMEN;

// javac *.java
// java EXAMEN.Principal

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Empleado> empleados;
    private Scanner leer;

    private static final String FILE_SUCURSAL = "C:/Users/kokow/OneDrive/Documentos/java/paradigmas/EXAMEN/sucursales.txt";
    private static final String FILE_EMPLEADO = "C:/Users/kokow/OneDrive/Documentos/java/paradigmas/EXAMEN/empleados.txt";

    public Principal() {
        sucursales = new ArrayList<>();
        empleados = new ArrayList<>();
        leer = new Scanner(System.in);
        cargarDatos();
    }

    public static void main(String[] args) {
        Principal tienda = new Principal();
    
        int opc;
        do {
            tienda.menu();
            System.out.println("Opción: ");
            while (!tienda.leer.hasNextInt()) {  // validar si la entrada es un número
                System.out.println("Por favor, ingresa una opción válida.");
                tienda.leer.next();  // consumir entrada no válida
            }
            opc = tienda.leer.nextInt();
            tienda.leer.nextLine();  // limpiar el buffer después de leer el número
    
            switch (opc) {
                case 1: tienda.altaEmpleado(); break;
                case 2: tienda.altaSucursal(); break;
                case 3: tienda.bajaEmpleado(); break;
                case 4: tienda.bajaSucursal(); break;
                case 5: tienda.consultarEmpleado(); break;
                case 6: tienda.consultarSucursal(); break;
                case 7: tienda.mostrarEmpleados(); break;
                case 8: tienda.mostrarSucursal(); break;
                case 0: tienda.guardarDatos();
                    System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida."); break;
            }
        } while (opc != 0);
    }
    

    // menu
    private void menu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Alta de empleado");
        System.out.println("2. Alta de sucursal");
        System.out.println("3. Baja de empleado");
        System.out.println("4. Baja de sucursal");
        System.out.println("5. Consultar empleado");
        System.out.println("6. Consultar sucursal");
        System.out.println("7. Mostrar todos los empleados");
        System.out.println("8. Mostrar todas las sucursales");
        System.out.println("0. Salir");
    }

    // manejo de archivos
    private void cargarDatos() {
        cargarSucursales();
        cargarEmpleados();
    }

    private void guardarDatos() {
        guardarSucursales();
        guardarEmpleados();
    }

    private void cargarSucursales() {
        try (BufferedReader suc = new BufferedReader(new FileReader(FILE_SUCURSAL))) {
            String aux;
            while ((aux = suc.readLine()) != null) {
                String[] datos = aux.split(",");
                Sucursal sucursal = new Sucursal(
                    Integer.parseInt(datos[0]), //id
                    datos[1], //nombre 
                    datos[2], //direccion
                    datos[3], //telefono
                    Integer.parseInt(datos[4])); //vacantes
                sucursales.add(sucursal);
            } // System.out.println("Sucursales cargadas: " + sucursales.size());
        } catch (Exception e) {
            System.out.println("Error al cargar sucursales: " + e.getMessage());
        }
    }

    private void guardarSucursales() {
        try (PrintWriter save_suc = new PrintWriter(new FileWriter(FILE_SUCURSAL))) {
            for (Sucursal sucursal : sucursales) {
                save_suc.println(String.format("%d,%s,%s,%s,%d",
                    sucursal.getId(),
                    sucursal.getNombre(),
                    sucursal.getDireccion(),
                    sucursal.getTelefono(),
                    sucursal.getVacantes()));
            }
        } catch (Exception e) {
            System.out.println("Error al guardar sucursales: " + e.getMessage());
        }
    }

    private void cargarEmpleados() {
        try (BufferedReader emp = new BufferedReader(new FileReader(FILE_EMPLEADO))) {
            String aux;
            while ((aux = emp.readLine()) != null) {
                String[] datos = aux.split(",");
                Empleado empleado = new Empleado(
                    Integer.parseInt(datos[0]), //id
                    datos[1], //nombre
                    datos[2], //apellido
                    datos[3], //puesto
                    Double.parseDouble(datos[4])); //salario
                empleados.add(empleado);
            } // System.out.println("Empleados cargados: " + empleados.size());
        } catch (Exception e) {
            System.out.println("Error al cargar empleados: " + e.getMessage());
        }
    }

    private void guardarEmpleados() {
        try (PrintWriter save_emp = new PrintWriter(new FileWriter(FILE_EMPLEADO))) {
            for (Empleado empleado : empleados) {
                save_emp.println(String.format("%d,%s,%s,%s,%.2f",
                    empleado.getId(),
                    empleado.getNombre(),
                    empleado.getApellido(),
                    empleado.getPuesto(),
                    empleado.getSalario()));
            }
        } catch (Exception e) {
            System.out.println("Error al guardar empleados: " + e.getMessage());
        }
    }

    public void datosCargados() {
        System.out.println("====== Datos cargados de archivos ======");
        System.out.println("Sucursales: ");
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.mostrarDetalles());
        }
        System.out.println("Empleados: ");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.mostrarDetalles());
        }
    }

    // gestion de empleados y sucursales
    private void altaEmpleado() {
        System.out.println("\n=== ALTA DE EMPLEADO ===");
        // validar id y si se repite, darle la oportunidad de ingresar otro
        int id;
        do {
            System.out.println("Id: ");
            id = leer.nextInt();
            leer.nextLine(); // limpiar buffer
            if (buscarEmpleado(id) != null) {
                System.out.println("Ese Id ya existe... ingresa otro");
            }
        } while (buscarEmpleado(id) != null);

        System.out.println("Nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Apellido: ");
        String apellido = leer.nextLine();

        System.out.println("Puesto: ");
        String puesto = leer.nextLine();

        // validar salario para que no sea negativo o cero
        double salario;
        do {
            System.out.println("Salario (ej. 1002.0): ");
            salario = leer.nextDouble();
        } while (salario <= 0);

        Empleado empleado = new Empleado(id, nombre, apellido, puesto, salario);
        empleados.add(empleado);
        System.out.println("Empleado agregado.");
    }

    private void altaSucursal() {
        System.out.println("\n=== ALTA DE SUCURSAL ===");
        // validar id
        int id;
        do {
            System.out.println("Id: ");
            id = leer.nextInt();
            leer.nextLine(); // limpiar buffer
            if (buscarSucursal(id) != null) {
                System.out.println("Ese Id ya existe... Ingresa otro");
            }
        } while (buscarSucursal(id) != null);

        System.out.println("Nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Direccion: ");
        String direccion = leer.nextLine();

        System.out.println("Telefono (ej. 123-456): ");
        String telefono = leer.nextLine();

        System.out.println("Vacantes: ");
        int vacantes = leer.nextInt();

        Sucursal sucursal = new Sucursal(id, nombre, direccion, telefono, vacantes);
        sucursales.add(sucursal);
        System.out.println("Sucursal agregada.");
    }

    private void bajaEmpleado() {
        System.out.println("\n=== BAJA DE EMPLEADO ===");
        System.out.println("Id del empleado: ");
        int id = leer.nextInt();
        leer.nextLine();

        Empleado empleado = buscarEmpleado(id);
        if (empleado != null) {
            empleados.remove(empleado);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private void bajaSucursal() {
        System.out.println("\n=== BAJA DE SUCURSAL ===");
        System.out.println("Id de la sucursal: ");
        int id = leer.nextInt();

        Sucursal sucursal = buscarSucursal(id);
        if (sucursal != null) {
            sucursales.remove(sucursal);
        } else {
            System.out.println("Sucursal no encontrada.");
        }
    }

    private void consultarEmpleado() { // buscar empleado por id
        System.out.println("\n=== CONSULTA DE EMPLEADO ===");
        System.out.println("Id del empleado: ");
        int id = leer.nextInt();

        Empleado empleado = buscarEmpleado(id);
        if (empleado != null) {
            System.out.println(empleado.mostrarDetalles());
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private void consultarSucursal() { // buscar sucursal por id
        System.out.println("\n=== CONSULTA DE SUCURSAL ===");
        System.out.println("Id de la sucursal: ");
        int id = leer.nextInt();

        Sucursal sucursal = buscarSucursal(id);
        if (sucursal != null) {
            System.out.println(sucursal.mostrarDetalles());
        } else {
            System.out.println("Sucursal no encontrada.");
        }
    }

    private void mostrarEmpleados() {
        System.out.println("\n=== TODOS LOS EMPLEADOS ===");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.mostrarDetalles());
        }
    }

    private void mostrarSucursal() {
        System.out.println("\n=== TODAS LAS SUCURSALES ===");
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.mostrarDetalles());
        }
    }

    // auxiliares: buscar empleados y sucursales
    private Empleado buscarEmpleado(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }

    private Sucursal buscarSucursal(int id) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getId() == id) {
                return sucursal;
            }
        }
        return null;
    }
}
