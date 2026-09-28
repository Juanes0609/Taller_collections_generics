package co.uniquindio.edu.ejercicios.collections.tres;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Crear una lista de elementos que no permite duplicados e imprima el contenido de la
 * lista usando iteradores.
 */

public class Main {
    static void main() {
        HashSet<String> elements = new HashSet<>();

        elements.add("Padel");
        elements.add("Fútbol");
        elements.add("Basketball");
        elements.add("Running");
        elements.add("Padel");
        elements.add("Running");

        Iterator<String> elementsIterator = elements.iterator();

        while (elementsIterator.hasNext()) {
            IO.println(elementsIterator.next());
        }
    }
}
