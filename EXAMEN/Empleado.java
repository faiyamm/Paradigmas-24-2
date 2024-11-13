package EXAMEN;

public class Empleado extends Entidad {
    private String apellido;
    private double salario;
    private String puesto;
    private Sucursal sucursal;

    public Empleado(int id, String nombre, String apellido, String puesto, double salario) {
        super(id, nombre);
        setApellido(apellido);
        setPuesto(puesto);
        setSalario(salario);
        this.sucursal = null; // al inicio no está asignado a ninguna sucursal
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        // no apellidos vacíos o nulos
        if (apellido != null && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            this.apellido = "n/a";
        }
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        // validar para no permitir puestos vacíos o nulos
        if (puesto != null && !puesto.isEmpty()) {
            this.puesto = puesto;
        } else {
            this.puesto = "n/a";
        }
    }

    public void setSalario(double salario) {
        // validar que el salario no sea negativo o cero
        if (salario >= 0) {
            this.salario = salario;
        } else {
            this.salario = 0.0;
        }
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + ", Apellido: " + apellido + ", Puesto: " + puesto + ", Salario: $" + salario;
    }  
}
