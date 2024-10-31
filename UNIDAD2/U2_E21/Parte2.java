package UNIDAD2.U2_E21;

/* Este programa mide el uso de memoria del sistema y proporciona dos métodos para invertir un número entero: 
uno iterativo (invertir) y otro recursivo (invertirRec). 
Utiliza la clase Runtime para monitorear la memoria mientras se ejecutan estos métodos. */

public class Parte2 {
    public static Runtime runtime = Runtime.getRuntime(); // Obtener la instancia Runtime para monitorear la memoria

    public static void main(String[] args) {
        int dataSize = 100; // Declarar variable para potencial uso en operaciones
        
        // Imprimir estadísticas de memoria iniciales
        System.out.println("Memoria máxima = " + runtime.maxMemory());
        System.out.println("Memoria total = " + runtime.totalMemory());
        System.out.println("Memoria libre = " + runtime.freeMemory());
        System.out.println("Memoria usada = " + (runtime.totalMemory() - runtime.freeMemory()));

        // Invertir un número de manera iterativa y recursiva
        System.out.println(invertir(148)); // Llamar a método iterativo para invertir el número
        System.out.println();
        invertirRec(124565, 148); // Llamar a método recursivo para invertir el número
    }

    // Método iterativo para invertir un número
    public static int invertir(int n) {
        int invert = 0; // Inicializar número invertido
        while (n > 0) { // Iterar mientras el número sea mayor que 0
            invert = invert * 10 + n % 10; // Agregar el dígito al número invertido
            n /= 10; // Reducir el número dividiéndolo entre 10
        }
        System.out.println("en el método " + (runtime.totalMemory() - runtime.freeMemory())); // Verificar memoria usada
        return invert;
    }

    // Método recursivo para invertir un número
    public static int invertirRec(int n, int invert) {
        if (n == 0) { // Verificar si el número ha llegado a 0
            System.out.println("fin del método " + (runtime.totalMemory() - runtime.freeMemory())); // Verificar memoria usada al finalizar
            return invert;
        } else {
            System.out.println("llamada recursiva " + (runtime.totalMemory() - runtime.freeMemory())); // Verificar memoria usada en llamada recursiva
            return invertirRec(n / 10, invert * 10 + (n % 10)); // Llamada recursiva reduciendo el número y construyendo el invertido
        }
    }
}
