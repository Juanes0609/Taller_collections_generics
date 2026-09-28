package co.uniquindio.edu.iterables;

public class MainIterable {
    static void main() {
        Inventory myInventory = new Inventory();
        myInventory.addObjects("PC");
        myInventory.addObjects("Cargador");
        myInventory.addObjects("Celular");

        for (String object : myInventory) {
            
        }
    }
}
