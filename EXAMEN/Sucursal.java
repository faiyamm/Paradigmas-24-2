package EXAMEN;

import java.util.ArrayList;

public class Sucursal extends Entidad {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private String direccion;
    private String telefono;
    private int vacantes;
    
    public Sucursal(int id, String nombre, String direccion, String telefono, int vacantes) {
        super(id, nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        this.vacantes = vacantes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        // no permitir direcciones vacías o nulas
        if (direccion != null && !direccion.isEmpty()) {
            this.direccion = direccion;
        } else {
            this.direccion = "n/a";
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        // solo telefnos de 10 digitos
        if (telefono != null && !telefono.matches("\\d{10}")) {
            this.telefono = telefono;
        } else {
            this.telefono = "0000000000"; // default por si el formato no es correcto
        }
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public void darDeBajaEmpleado(Empleado empleado) {
        // eleminar empleado de la lista y aumentar num de vacantes
        if (empleados.remove(empleado)) {
            vacantes++;
            System.out.println("Empleado: " + empleado.getNombre() + " dado de baja.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", Vacantes: " + vacantes;
    }
}
