package co.uniquindio.edu.ejercicios.collections.uno;

import java.util.TreeSet;

public class Enterprise {
    private TreeSet<Product> products;

    public Enterprise() {
        products = new TreeSet<>();
    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    public Product searchProduct(String codeProduct) {
        for (Product product: products) {
            if (product.getProductCode().equals(codeProduct)) {
                return product;
            }
        } throw new Error("El producto con ese código no existe.", null);
    }
}