package UNIDAD2.U2_E24;

public class Articulo {
    private String nombre; // nombre del artículo
    private double precio; // precio del artículo
    protected double descuento; // porcentaje de descuento

    // obtener nombre
    public String getNombre() {
        return nombre;
    }

    // asignar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // obtener precio
    public double getPrecio() {
        return precio;
    }

    // asignar precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // constructor por defecto
    public Articulo() {
        this.nombre = ""; // inicializar nombre vacío
        this.precio = 0; // precio inicial
        this.descuento = 0.10; // descuento del 10%
    }

    // método para convertir el nombre a mayúsculas
    public void convertir() {
        this.nombre = this.nombre.toUpperCase();
    }

    // método para convertir el nombre a minúsculas (sobrecarga)
    public void convertir(int num) { // usar parámetro para sobrecarga
        this.nombre = this.nombre.toLowerCase();
    }

    // validar si el precio es mayor a 0
    public boolean valida() {
        return this.precio > 0;
    }

    // validar precio y aplicar descuento si es necesario
    public void valida(double precio) {
        // aplicar descuento si el precio es mayor a 1000
        this.precio = precio > 1000 ? precio - (precio * descuento) : precio;
    }

    // validar si el nombre tiene al menos un carácter
    public boolean valida(String nombre) {
        return nombre.length() > 0;
    }

    // validar y asignar nombre (sobrecarga)
    public void valida(String nombre, int num) { 
        // verificar si el nombre contiene números
        boolean numeros = false;
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isDigit(nombre.charAt(i))) {
                numeros = true;
            }
        }
        // asignar nombre solo si no contiene números
        this.nombre = !numeros ? nombre : "";
    }

    // representar artículo como texto
    @Override
    public String toString() {
        return "Articulo [nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento + "]";
    }
}
