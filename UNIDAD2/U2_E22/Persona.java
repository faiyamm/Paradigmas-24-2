package UNIDAD2.U2_E22;

public class Persona {
    private String nombre;
    private float estatura;
    private boolean activo; // default: false
    private String curp;

    // Constructor por default, sin parámetros
    public Persona(){
        this.nombre = "Pendiente";
        this.estatura = 0; // valor inicial
        this.activo = false; // inactivo
    }

    // Constructor con todos los parámetros para asignar los valores iniciales
    public Persona(String nombre, float estatura, boolean activo){
        this.nombre = nombre; 
        this.estatura = estatura;
        this.activo = activo;
    }

    // Constructor con solo nombre
    public Persona(String nombre){
        this.nombre = nombre; // asignar el nombre
        this.estatura = 0; // valor inicial
        this.activo = false; // inactivo
    }

    // getters/setters
    public String getNombre() {
        return nombre; // devolver nombre
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // asignar nombre
    }

    public float getEstatura() {
        return estatura; // devolver estatura
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura; // asignar estatura
    }

    public boolean isActivo() {
        return activo; // devolver estado activo
    }

    public void setActivo(boolean activo) {
        this.activo = activo; // asignar estado activo/inactivo
    }

    public String getCurp() {
        return curp; // devolver CURP
    }

    public void setCurp(String curp) {
        this.curp = curp; // asignar CURP
    }

    @Override
    public String toString() {
        // devolver información de la persona
        return "Persona [nombre=" + nombre + ", estatura=" + estatura + ", activo=" + activo + "]";
    }

    // método para aumentar la estatura
    public void crece(float valor){
        this.estatura += valor; // aumentar la estatura
    }
}