package co.uniquindio.edu.ejercicios.generics.intermedio.diez;

/**
 * Ejercicio 10: metodo generico con multiples restricciones
 * (T extends Number & Comparable<T>) que recibe dos numeros comparables y
 * devuelve el mayor. El orden importa: la clase (Number) va primero,
 * la(s) interfaz(ces) despues.
 */

public class ImprimirMayor {
    public <T extends Number & Comparable<T>> T imprimirMayor(T a, T b) {
        T mayor;

        if (a.compareTo(b) > 0) {
            mayor = a;
        } else {
            mayor = b;
        }
        System.out.println("El mayor entre " + a + " y " + b + " es: " + mayor);
        return mayor;
    }

    static void main() {
        ImprimirMayor mayorNumero = new ImprimirMayor();
        mayorNumero.imprimirMayor(10,25);
        mayorNumero.imprimirMayor(30,25);

    }
}
