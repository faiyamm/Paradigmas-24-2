package UNIDAD2.U2_E22;

public class Puesto {
    private int salario;
    private String nombre; // nombre del puesto

    // Constructor por default, sin parámetros
    public Puesto(){
        this.salario = 1800; // valor inicial
        this.nombre = "Pendiente"; // nombre por default
    }

    // Constructor con parámetros
    public Puesto(int salario, String nombre){
        this.salario = salario; // asignar salario
        this.nombre = nombre; // asignar nombre
    }

    // getters/setters
    public int getSalario() {
        return salario; // devolver salario
    }

    public void setSalario(int salario) {
        this.salario = salario; // asignar salario
    }

    public String getNombre() {
        return nombre; // devolver nombre del puesto
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // asignar nombre del puesto
    }

    @Override
    public String toString() {
        // devolver información del puesto
        return "Puesto [salario=" + salario + ", nombre=" + nombre + "]";
    }
}