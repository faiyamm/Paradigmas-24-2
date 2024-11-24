package UNIDAD2.U2_E23;

public class Puesto {
    private int num; // declarar variable num
    private int salario; // declarar variable salario
    private String nombre; // declarar variable nombre

    // obtener identificador numérico
    public int getNum() {
        return num;
    }

    // asignar identificador numérico
    public void setNum(int num) {
        this.num = num;
    }

    // obtener salario
    public int getSalario() {
        return salario;
    }

    // asignar salario
    public void setSalario(int salario) {
        this.salario = salario;
    }

    // obtener nombre del puesto
    public String getNombre() {
        return nombre;
    }

    // asignar nombre del puesto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // constructor por defecto
    public Puesto() {
        this.salario = 1800; // salario semanal predeterminado
        this.nombre = "ayudante";
    }

    // constructor con salario y nombre
    public Puesto(int salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }

    // constructor con número, salario y nombre
    public Puesto(int num, int salario, String nombre) {
        this.num = num;
        this.salario = salario;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Puesto [num=" + num + ", salario=" + salario + ", nombre=" + nombre + "]";
    }
}
