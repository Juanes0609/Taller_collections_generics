package co.uniquindio.edu.ejercicios.generics.basico.cuatro;

/**
 * Ejercicio 4: metodo generico que intercambia dos posiciones de un arreglo.
 */

public class Main {
    static void main() {
        String[] nombres = {"Juan", "Alex", "Joha"};
        intercambiarPosicion(nombres, 0, 2);
        System.out.println("Strings: " + java.util.Arrays.toString(nombres));

        Integer[] numeros = {1, 2, 3, 4, 5};
        intercambiarPosicion(numeros, 4, 0);
        System.out.println("Enteros: " + java.util.Arrays.toString(numeros));
    }

    public static <T> void intercambiarPosicion(T[] arreglo, int i, int j) {
        if (arreglo == null || i < 0 || j < 0 || i >= arreglo.length || j >= arreglo.length) {
            throw new IllegalArgumentException("Indices fuera de rango o arreglo nulo");
        }

        T temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }
}
