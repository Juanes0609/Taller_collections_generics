package co.uniquindio.edu.ejercicios.generics.avanzado.trece;

import java.util.List;

public interface Servicio <T extends Number & Comparable<T>>{
    T minimo(List<T> lista);
    T maximo(List<T> lista);
}
