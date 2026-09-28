package co.uniquindio.edu.ejercicios.generics.enunciados.ocho;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Enunciado 8: ListaTareas<T extends Comparable<T>> respaldada por ArrayList<T>,
 * que implementa Iterable<T> con:
 *  - iterador "normal" (indice 0 al final): iterator()
 *  - iterador inverso (clase interna) del ultimo al primero
 *  - obtenerEntre(min, max) que usa EXCLUSIVAMENTE el iterador inverso.
 */

public class ListaTareas <T extends Comparable<T>> implements Iterable<T> {
    private final List<T> tareas = new ArrayList<>();

    public void agregarTarea(T tarea) {
        tareas.add(tarea);
    }

    @Override
    public Iterator<T> iterator() {
        return tareas.iterator();
    }

    public Iterator<T> iteradorInverso() {
        return new IteradorInverso();
    }

    private class IteradorInverso implements Iterator<T> {
        private int i = tareas.size() - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalArgumentException("No hay más elementos");
            }
            return tareas.get(i--);
        }
    }

    public List<T> elementosEntre(T min, T max) {
        List<T> resultado = new ArrayList<>();
        Iterator<T> itInverso = iteradorInverso();

        while(itInverso.hasNext()) {
            T actual =  itInverso.next();
            if(actual.compareTo(min) >= 0 && actual.compareTo(max) <= 0) {
                resultado.add(actual);
            }
        }
        return resultado;
    }
}
