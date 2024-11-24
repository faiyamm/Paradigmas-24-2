package UNIDAD3.U3_E25;

public class Estatica {
    public static boolean bisiesto(int num) {
        // año es bisiesto si es divisible entre 4 y no por 100, excepto si es divisible por 400
        return num % 4 == 0 && !(num % 100 == 0 && num % 400 != 0);
    }

    // generar un número aleatorio entre límites dados
    public static int aleatorio(int liminf, int limsup) {
        // calcular número aleatorio dentro del rango [liminf, limsup]
        int aux = (int) (Math.random() * (limsup - liminf + 1)) + liminf;
        System.out.println("Valor generado: " + aux); // mostrar valor generado
        return aux; // retornar número generado
    }

    // calcular el año de la siguiente década
    public static int sigDecada(int num) {
        // sumar 10 al año actual
        int inc = 10;
        num += inc;
        return num;
    }
}
