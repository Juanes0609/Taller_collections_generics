package co.uniquindio.edu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MainList {
    static void main() {
        testLinkedList();

    }

    public static void testLinkedList() {
        // Crear una lista que recibe <E>
        LinkedList list = new LinkedList<>();

        list.add("Juan");
        list.add(5);
        list.add(4.56);
        IO.println("LinkedList de cualquier objeto: " + list);

        // Crear una lista que recibe <String>, especificando tipo de dato
        LinkedList<Integer> listInt = new LinkedList<>();

        listInt.addFirst(1);
        listInt.add(4);
        listInt.addLast((int) Math.random()); // casting double to int
        listInt.addFirst((int) Math.random()); // casting double to int
        System.out.println("LinkedList de tipo Integer: " + listInt);
    }

    public static void testIteratorOnLists() {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("JS");
        lista.add("Java");
        lista.add("C#");
        lista.add("Python");
        lista.add("Elixir");

        Iterator<String> iterator = lista.iterator();



    }
}
