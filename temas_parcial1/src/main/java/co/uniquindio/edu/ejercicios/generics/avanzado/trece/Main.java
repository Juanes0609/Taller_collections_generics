package co.uniquindio.edu.ejercicios.generics.avanzado.trece;

/**
 * Ejercicio 13: Interfaz Servicio<T extends Number & Comparable<T>>
 * Definir una interfaz con métodos T minimo(List<T> lista) y T maximo(List<T> lista).
 * Implementar en una clase ServicioNumerico.
 */

import java.util.List;

public class Main {
    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        ServicioNumerico servicio = new ServicioNumerico<>();

        System.out.println("Lista de números: " + numeros);
        System.out.println("Valor mínimo " + servicio.minimo(numeros));
        System.out.println("Valor máximo: " + servicio.maximo(numeros));

    }
}
