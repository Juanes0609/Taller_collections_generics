package co.uniquindio.edu.ejercicios.generics.intermedio.ocho;
/**
 * Ejercicio 8: clase generica con restriccion T extends Comparable<T>
 * que devuelve el mayor entre dos elementos comparables.
 */
public class Comparador <T extends Comparable<T>> {


    public T mayor(T a, T b) {
        if(a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    static void main() {
        Comparador<Integer> comparadorNumeros = new Comparador<>();
        System.out.println("El numero mayor es: " + comparadorNumeros.mayor(20,45));

        // Orden lexicográfico/alfabético,
        // basándose en el valor númerico en la tabla de codificación Unicode (65-90) (A-Z)
        Comparador<String> comparadorString = new Comparador<>();
        System.out.println("La cadena mayor es: " + comparadorString.mayor("Avioneta", "Xilofono"));

        Comparador<Double> comparadorDecimales = new Comparador<>();
        System.out.println("El numero mayor es: " + comparadorDecimales.mayor(-0.5, -0.8));
    }
}
