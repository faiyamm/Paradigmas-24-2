package UNIDAD2.U2_E22;

public class Empleado extends Persona {
    private double tiempo; // tiempo de trabajo (antigüedad)
    private Puesto actividad; // puesto que desempeña
    private int id; 
    private char turno; // turno: M V o N

    // Constructor con parámetros
    public Empleado(double tiempo, char turno) {
        super(); // llamar al constructor de la clase padre (Persona)
        this.tiempo = tiempo; // asignar tiempo
        this.turno = turno; // asignar turno
    }

    // getters/setters
    public double getTiempo() {
        return tiempo; // devolver tiempo
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo; // asignar tiempo
    }

    public int getId() {
        return id; // devolver ID
    }

    public void setId(int id) {
        this.id = id; // asignar ID
    }

    public char getTurno() {
        return turno; // devolver turno
    }

    public void setTurno(char turno) {
        this.turno = turno; // asignar turno
    }

    public Puesto getActividad() {
        return actividad; // devolver actividad
    }

    public void setActividad(Puesto actividad) {
        this.actividad = actividad; // asignar actividad
    }

    @Override
    public String toString() {
        // devolver información del empleado
        return "Empleado [tiempo=" + tiempo + ", actividad=" + actividad + ", id=" + id + ", turno=" + turno + "]";
    }
}
