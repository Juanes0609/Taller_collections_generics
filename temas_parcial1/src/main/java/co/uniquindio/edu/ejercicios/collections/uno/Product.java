package co.uniquindio.edu.ejercicios.collections.uno;

public class Product implements Comparable<Product>{
    String productCode;
    String name;
    String price;

    public Product(String productCode, String name, String price) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public int compareTo(Product p2) {
        return productCode.compareTo(p2.getProductCode());
    }

    @Override
    public String toString() {
        return "Producto: " + productCode + " | "+ name  + " | " + price;
    }
}
