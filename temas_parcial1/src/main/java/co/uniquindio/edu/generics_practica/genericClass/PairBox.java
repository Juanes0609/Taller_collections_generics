package co.uniquindio.edu.generics_practica.genericClass;

import java.util.Map;

public class PairBox <K, V> implements ShowElements{
    private K key;
    private V value;

    public PairBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public <M, N> void showElements(Map <M, N> map) {
        if (map == null || map.isEmpty()) {
            System.out.println("Map is empty.");
        }
        for (Map.Entry<M, N> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + "Valor: " + entry.getValue());
        }

    }
}
