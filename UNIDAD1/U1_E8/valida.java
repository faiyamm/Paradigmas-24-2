package UNIDAD1.U1_E8;

public class valida {
    // método para verificar si una cadena está vacía
    public static boolean strVacio(String elem) {
        // verificar si la longitud de la cadena es 0
        return elem.length() == 0;
    }

    // método para validar que solo haya letras en la cadena
    public static boolean soloLetras(String cadena) {
        int ultimo = cadena.length() - 1;
        
        // verificar que no haya espacios al inicio o final
        if (cadena.charAt(0) == ' ' || cadena.charAt(ultimo) == ' ') {
            System.out.println("Sin espacios al inicio y al final");
            return false;
        }

        // verificar que todos los caracteres sean letras o espacios en blanco
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ' && !Character.isAlphabetic(cadena.charAt(i))) {
                System.out.println("Solo letras"); // no se permiten caracteres especiales
                return false;
            }
        }
        return true; // todos los caracteres son válidos
    }

    // método para verificar si un número es positivo
    public static boolean positivo(int numero) {
        // regresar true si el número es mayor a 0
        return numero > 0;
    }
    
}
