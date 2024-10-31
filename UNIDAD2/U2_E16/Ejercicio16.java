package UNIDAD2.U2_E16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declarar variables
        float peso = 0;
        float altura = 0;
        float imc = 0;
        short edad;
        char genero;
        String status = "";

        System.out.println("Peso en kilogramos: ");
        peso = Float.parseFloat(leer.nextLine());

        System.out.println("Estatura en metros (ej: 1.84): ");
        altura = Float.parseFloat(leer.nextLine());

        // Calcular IMC
        imc = imcGral(peso, altura);
        
        // Pedir edad y género al usuario
        edad = pedirEdad(leer);
        genero = pedirGenero(leer);

        // Calcular y mostrar estado de salud basado en IMC, edad y género
        status = tablaIMC(imc, edad, genero);
        mostrarIMC(peso, altura, imc, status);

        leer.close(); // Cerrar el scanner
    }

    public static String tablaIMC(float imc, short edad, char genero) {
        String status = "";
        
        // Verificar género y clasificar según IMC y edad
        if (genero == 'M') {
            if (edad < 19) {
                status = (imc > 32) ? "Obesidad" :
                         (imc > 27) ? "Sobrepeso" :
                         (imc > 22) ? "Peso Normal" :
                         (imc > 17) ? "Peso bueno" : "Excelente";
            } else if (edad >= 20 && edad <= 29) {
                status = (imc > 33) ? "Obesidad" :
                         (imc > 28) ? "Sobrepeso" :
                         (imc > 23) ? "Peso Normal" :
                         (imc > 18) ? "Peso bueno" : "Excelente";
            } else if (edad >= 30 && edad <= 39) {
                status = (imc > 34) ? "Obesidad" :
                         (imc > 29) ? "Sobrepeso" :
                         (imc > 24) ? "Peso Normal" :
                         (imc > 19) ? "Peso bueno" : "Excelente";
            } else if (edad >= 40 && edad <= 49) {
                status = (imc > 35) ? "Obesidad" :
                         (imc > 30) ? "Sobrepeso" :
                         (imc > 25) ? "Peso Normal" :
                         (imc > 20) ? "Peso bueno" : "Excelente";
            } else {
                status = (imc > 36) ? "Obesidad" :
                         (imc > 31) ? "Sobrepeso" :
                         (imc > 26) ? "Peso Normal" :
                         (imc > 21) ? "Peso bueno" : "Excelente";
            }
        } else if (genero == 'H') {
            if (edad < 19) {
                status = (imc > 27) ? "Obesidad" :
                         (imc > 22) ? "Sobrepeso" :
                         (imc > 17) ? "Peso Normal" :
                         (imc > 12) ? "Peso bueno" : "Excelente";
            } else if (edad >= 20 && edad <= 29) {
                status = (imc > 28) ? "Obesidad" :
                         (imc > 23) ? "Sobrepeso" :
                         (imc > 18) ? "Peso Normal" :
                         (imc > 13) ? "Peso bueno" : "Excelente";
            } else if (edad >= 30 && edad <= 39) {
                status = (imc > 29) ? "Obesidad" :
                         (imc > 25) ? "Sobrepeso" :
                         (imc > 20) ? "Peso Normal" :
                         (imc > 15) ? "Peso bueno" : "Excelente";
            } else if (edad >= 40 && edad <= 49) {
                status = (imc > 30) ? "Obesidad" :
                         (imc > 26) ? "Sobrepeso" :
                         (imc > 21) ? "Peso Normal" :
                         (imc > 16) ? "Peso bueno" : "Excelente";
            } else {
                status = (imc > 31) ? "Obesidad" :
                         (imc > 26) ? "Sobrepeso" :
                         (imc > 21) ? "Peso Normal" :
                         (imc > 16) ? "Peso bueno" : "Excelente";
            }
        }

        return status;
    }

    public static char pedirGenero(Scanner leer) {
        char genero;
        do {
            System.out.println("Género (M/H):");
            genero = leer.nextLine().toUpperCase().charAt(0);
        } while (!(genero == 'M' || genero == 'H')); // Negar valores distintos de M y H
        return genero;
    }

    public static short pedirEdad(Scanner leer) {
        String dato;
        short valor = 0;
        boolean valido;

        do {
            valido = true;
            System.out.println("Edad:");
            dato = leer.nextLine();

            for (int i = 0; i < dato.length(); i++) {
                if (!Character.isDigit(dato.charAt(i))) {
                    valido = false;
                    break;
                }
            }
            if (valido) {
                valor = Short.parseShort(dato);
            }
        } while (!(valor >= 0 && valor <= 120) || !valido); // Negar condiciones fuera del rango
        return valor;
    }

    public static float imcGral(float peso, float altura) {
        return peso / (altura * altura); // Calcular IMC
    }

    public static void mostrarIMC(float peso, float altura, float imc, String status) {
        System.out.println("Índice de masa corporal");
        System.out.println("Según fórmula general IMC = peso / altura^2");
        System.out.printf("Peso: %.2f kg, Altura: %.2f m\n", peso, altura);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Estado: " + status);
    }
}
