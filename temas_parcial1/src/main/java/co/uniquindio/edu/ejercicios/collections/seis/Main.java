package co.uniquindio.edu.ejercicios.collections.seis;
/**
 * Ejercicio 6: Gestion de inventario de una tienda usando ArrayList.
 * Permite agregar, eliminar agotados, buscar y listar (por nombre y por precio).
 */
public class Main {
    static void main() {
        InventarioTienda inventario = new InventarioTienda();

        inventario.agregarProducto(new ProductoTienda("Agua", "04", "2300"));
        inventario.agregarProducto(new ProductoTienda("Pan", "02", "2500"));
        inventario.agregarProducto(new ProductoTienda("Papitas", "03", "6000"));
        inventario.agregarProducto(new ProductoTienda("Leche", "01", "4500"));

        System.out.println("Orden por nombre: " + inventario.listarPorNombre());
        System.out.println("Orden por precio: " + inventario.listarPorPrecio());

        System.out.println("Buscar producto: " + inventario.buscarProducto("04"));

        inventario.eliminarProductoAgotado("03");
        System.out.println(inventario.listarPorNombre());
    }
}
