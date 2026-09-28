package co.uniquindio.edu.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Inventory implements Iterable<String> {
    private String[] objects = new String[10];
    private int cant = 0;

    public void addObjects(String item) {
        if (cant < objects.length) {
            objects[cant] = item;
            cant++;

        }

    }

    @Override
    public Iterator<String> iterator() {
        return new InventoryIterator();

    }

    private class InventoryIterator implements Iterator<String> {
        private int actIndex = 0;

        @Override
        public boolean hasNext() {
            return actIndex < cant;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            return objects[actIndex++];
        }
    }
}
