package co.uniquindio.edu.ejercicios.generics.avanzado.once;

/**
 * Ejercicio 11: Clase EntidadPersistente<T extends Number & Comparable<T>>
 * Crear una clase que almacene un valor T y permita compararlo con otros objetos del mismo tipo.
 * @param <T>
 */
public class EntidadPersistente <T extends Number & Comparable<T>> implements Comparable<EntidadPersistente<T>> {
    private T valor;

    private EntidadPersistente(T valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(EntidadPersistente<T> objeto) {
        if(objeto == null || objeto.getValor() == null) {
            throw new IllegalArgumentException("No es posible comparar con un valor nulo");
        }

        return this.valor.compareTo(objeto.getValor());
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }

    static void main() {
        EntidadPersistente<Double> entidadA = new EntidadPersistente(25.5);
        EntidadPersistente<Double> entidadB = new EntidadPersistente(17.8);
        EntidadPersistente<Double> entidadC = new EntidadPersistente(25.5);

        System.out.println("A vs B: " + entidadA.compareTo(entidadB)); // Retorna positivo: A > B
        System.out.println("C vs A: " + entidadC.compareTo(entidadA)); // Retorna 0: C = A
        System.out.println("B vs C: " + entidadB.compareTo(entidadC)); // Retorna negativo: B < C

    }
}
