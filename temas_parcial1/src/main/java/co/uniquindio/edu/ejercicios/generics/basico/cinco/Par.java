package co.uniquindio.edu.ejercicios.generics.basico.cinco;

/**
 * Ejercicio 5 (Basico): clase generica que guarda dos valores de tipo T
 * y verifica si ambos son iguales.
 */

import java.util.Objects;

public class Par<T>{
    private T e1;
    private T e2;

    public Par(T e1, T e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public T getE1() {
        return e1;
    }

    public void setE1(T e1) {
        this.e1 = e1;
    }

    public T getE2() {
        return e2;
    }

    public void setE2(T e2) {
        this.e2 = e2;
    }

    @Override
    public String toString() {
        return "(" + e1 + ", " + e2 + ")";
    }

    public boolean sonIguales() {
        return Objects.equals(e1, e2);
    }

    static void main() {
        Par<String> parString = new Par<>("Ingenieria", "Ingenieria");
        System.out.println("Son iguales (String): " + parString.sonIguales());

        Par<Integer> parInteger = new Par<>(04, 40);
        System.out.println("Son iguales (Integer): " + parInteger.sonIguales());

        Par<String> parStringDiferentes = new Par<>("Java", "Python");
        System.out.println("Son iguales (String): " + parStringDiferentes.sonIguales());

        Par<String> parNulos = new Par<>(null, null);
        System.out.println("Son iguales (Nulos): " + parNulos.sonIguales());


    }
}
