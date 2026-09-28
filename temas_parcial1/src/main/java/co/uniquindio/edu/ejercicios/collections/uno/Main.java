package co.uniquindio.edu.ejercicios.collections.uno;

/**
 * Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar
 * un método que busque un producto por su código.
 */

public class Main {
    static void main() {
        Enterprise enterprise = new Enterprise();
        Product p1 = new Product("01", "TV", "$330");
        Product p2 = new Product("02", "MacBook", "$1200");
        Product p3 = new Product("03", "Mouse", "$180");

        enterprise.addProduct(p1);
        enterprise.addProduct(p2);
        enterprise.addProduct(p3);

        Product searchProduct = enterprise.searchProduct("03");
        IO.println("Producto buscado: " + searchProduct);

    }
}
