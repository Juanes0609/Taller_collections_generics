package co.uniquindio.edu.ejercicios.collections.cinco;

import co.uniquindio.edu.ejercicios.collections.uno.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Ejercicio 5: Crear una lista de productos de tipo HashMap, otra lista de tipo LinkedHashMap y
 * otra de tipo TreeMap y explicar las diferencias de cada una.
 */

public class MainMaps {
    static void main() {
        Product p1 = new Product("01", "MacBook M4 Pro", "$800");
        Product p2 = new Product("02", "AirPods Max", "$320");
        Product p3 = new Product("03", "Mouse", "$120");
        Product p4 = new Product("04", "AirPods 5", "$120");

        System.out.print("---HashMap (sin orden garantizado)---\n");
        Map<String, Product> hashMap = new HashMap<>();
        fillAndShowAll(hashMap, p3, p1, p4, p2);

        System.out.print("---LinkedHashMap (Mantiene el orden de inserción)---\n");
        Map<String, Product> linkedHashMap = new LinkedHashMap<>();
        fillAndShowAll(linkedHashMap, p3, p1, p4, p2);

        System.out.print("---TreeMap (Orden natural por clave)---\n");
        Map<String, Product> treeMap = new TreeMap<>();
        fillAndShowAll(treeMap, p3, p1, p4, p2);

    }

    /**
     * Método generico para llenar cualquier mapa y mostrarlo
     */
    public static void fillAndShowAll(Map<String, Product> map, Product... products) {
        for (Product p: products) {
            map.put(p.getProductCode(), p);
        }

        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " -> Valor: " + entry.getValue());
        }
    }
}
