package co.uniquindio.edu.ejercicios.collections.seis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InventarioTienda {
    private List<ProductoTienda> inventario;

    public InventarioTienda() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(ProductoTienda p) {
        inventario.add(p);
    }

    public boolean eliminarProductoAgotado(String codigo) {
        return inventario.removeIf(p -> p.getCodigo().equals(codigo));

    }
    public ProductoTienda buscarProducto(String codigo) {
            for (ProductoTienda p : inventario) {
                if (p.getCodigo().equals(codigo)) {
                    return p;
            }
        } return null;
    }

    public List<ProductoTienda> listarPorNombre() {
        List<ProductoTienda> copia = new ArrayList<>(inventario);
        copia.sort(Comparator.comparing(ProductoTienda::getNombre));
        return copia;
    }

    public List<ProductoTienda> listarPorPrecio() {
        List<ProductoTienda> copia = new ArrayList<>(inventario);
        copia.sort(Comparator.comparing(ProductoTienda::getPrecio));
        return copia;
    }
}