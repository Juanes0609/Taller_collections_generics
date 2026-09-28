package co.uniquindio.edu.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainSet {
    static void main() {
//        testHashSet();
        testLinkedHashSet();
    }

    public static void testHashSet() {
        HashSet<Integer> setInt = new HashSet<>();

        setInt.add(40);
        setInt.add(3);
        setInt.add(45);
        setInt.add(22);
        setInt.add(100);

        boolean isNum = setInt.contains(100);
        IO.println(isNum);

        IO.println(setInt.size());

        IO.println(setInt.remove(22));
        IO.println(setInt.size());
    }

    public static void testLinkedHashSet() {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        linkedSet.addLast("RAM");
        linkedSet.addFirst("PC");
        linkedSet.add("CPU");
        linkedSet.add("Mouse");
        IO.println(linkedSet);

        IO.println(linkedSet.contains("SSD"));

        Iterator<String> setIterator = linkedSet.iterator();

        IO.println("Iterador con linkedSet: ");
        while (setIterator.hasNext()) {
            IO.println(setIterator.next());
        }

    }
}
