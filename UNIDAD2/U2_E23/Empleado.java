package UNIDAD2.U2_E23;

public class Empleado extends Persona {
    private double tiempo; // declarar variable tiempo
    private Puesto actividad; // declarar actividad asociada al empleado
    private int id; // declarar identificador único del empleado
    private char turno; // declarar variable turno (M: matutino, V: vespertino, N: nocturno)

    // obtener antigüedad en años
    public double getTiempo() {
        return tiempo;
    }

    // asignar antigüedad en años
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    // obtener identificador del empleado
    public int getId() {
        return id;
    }

    // asignar identificador del empleado
    public void setId(int id) {
        this.id = id;
    }

    // obtener turno del empleado
    public char getTurno() {
        return turno;
    }

    // asignar turno del empleado
    public void setTurno(char turno) {
        this.turno = turno;
    }

    // obtener actividad del empleado
    public Puesto getActividad() {
        return actividad;
    }

    // asignar actividad del empleado
    public void setActividad(Puesto actividad) {
        this.actividad = actividad;
    }

    // constructor con parámetros
    public Empleado(double tiempo, char turno) {
        super(); // llamar al constructor de Persona
        this.tiempo = tiempo;
        this.turno = turno;
        this.actividad = null; // actividad inicial es nula
    }

    // constructor sin parámetros
    public Empleado() {
        super(); // llamar al constructor de Persona
        this.tiempo = 0;
        this.turno = ' '; // turno sin asignar
        this.actividad = null;
    }

    @Override
    public String toString() {
        return "Empleado [tiempo=" + tiempo + ", actividad=" + actividad + ", id=" + id + ", turno=" + turno
                + ", nombre=" + getNombre() + ", estatura=" + getEstatura() + ", activo=" + isActivo() + "]";
    }
}
