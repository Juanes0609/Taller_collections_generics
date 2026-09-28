package co.uniquindio.edu.generics_practica;

import co.uniquindio.edu.generics_practica.genericClass.Box;
import co.uniquindio.edu.generics_practica.genericClass.BoxTwo;
import co.uniquindio.edu.generics_practica.genericClass.GenericBox;
import co.uniquindio.edu.generics_practica.genericClass.PairBox;

public class Main {
    static void main() {
        noGenericMethod();
        genericImplementation();
    }

    public static void noGenericMethod (){
        Box myBox = new Box("Shoes");
        System.out.println(myBox.getElement());

        BoxTwo mySecondBox = new BoxTwo(400);
        System.out.println(mySecondBox.getElement());
    }

    public static void genericImplementation (){
        GenericBox<String> myGenericBox = new GenericBox<>("Trousers");
        System.out.println(myGenericBox.getElement());

        GenericBox<Integer> mySecondGenericBox = new GenericBox<>(50);
        System.out.println(mySecondGenericBox.getElement());

        PairBox<Integer, String> pairBox = new PairBox<>(1, "Phone");
        PairBox<Integer, String> pairBox2 = new PairBox<>(2, "Headphones");
        PairBox<Integer, String> pairBox3 = new PairBox<>(3, "Charger");


    }
}
