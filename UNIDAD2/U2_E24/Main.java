package UNIDAD2.U2_E24;

/* Este programa muestra el uso de polimorfismo, sobrecarga de métodos y clases abstractas. */

public class Main {
    public static void main(String[] args) {
        // sobrecarga de métodos
        Articulo juguete = new Articulo(); // crear objeto Articulo
        juguete.valida(500); // validar precio del artículo
        juguete.valida("rompecabezas", 0); // validar nombre del artículo
        System.out.println(juguete.toString()); // mostrar detalles del artículo

        juguete.valida(1200); // aplicar descuento si el precio > 1000
        juguete.valida("lego", 1); // validar y asignar nuevo nombre
        System.out.println(juguete.toString());

        // clases abstractas y polimorfismo
        Circulo pelota = new Circulo(); // crear objeto Circulo
        System.out.println(pelota.toString());
        pelota.setBase(10); // asignar radio
        pelota.area(); // calcular área del círculo
        pelota.perimetro(); // calcular perímetro del círculo
        System.out.println(pelota.toString());

        // hacer lo mismo con Cuadrado
        Cuadrado mesa = new Cuadrado(); // crear objeto Cuadrado
        System.out.println(mesa.toString());
        mesa.setBase(5); // asignar lado del cuadrado
        mesa.area(); // calcular área del cuadrado
        mesa.perimetro(); // calcular perímetro del cuadrado
        System.out.println(mesa.toString());
    }
}
