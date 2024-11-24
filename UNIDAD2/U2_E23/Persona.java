package UNIDAD2.U2_E23;

public class Persona {
    private String nombre; // declarar variable nombre
    private float estatura; // declarar variable estatura
    private boolean activo; // declarar variable activo
    private String curp; // declarar variable curp

    // obtener nombre
    public String getNombre() {
        return nombre;
    }

    // asignar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // obtener estatura
    public float getEstatura() {
        return estatura;
    }

    // asignar estatura
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    // verificar si está activo
    public boolean isActivo() {
        return activo;
    }

    // asignar estado de actividad
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // obtener CURP
    public String getCurp() {
        return curp;
    }

    // asignar CURP
    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", estatura=" + estatura + ", activo=" + activo + ", curp=" + curp + "]";
    }

    // incrementar la estatura
    public void crece(float valor) {
        this.estatura += valor;
    }

    // constructor sin parámetros
    public Persona() {
        this.nombre = "Pendiente";
        this.estatura = 0;
        this.activo = false;
    }

    // constructor con todos los parámetros
    public Persona(String nombre, float estatura, boolean activo) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.activo = activo;
    }

    // constructor con solo nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.estatura = 0;
        this.activo = false;
    }
}
