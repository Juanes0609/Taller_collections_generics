package co.uniquindio.edu.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class MainUtil {
    static void main() {
        testCollections();
    }

    public static void testCollections() {
        LinkedList listaNotas = new LinkedList<>(Arrays.asList(1,0.5,4,2,3,5));

        IO.println(listaNotas);

    }

}
