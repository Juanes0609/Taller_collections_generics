package co.uniquindio.edu.ejercicios.collections.seis;

public class ProductoTienda {
    private String nombre;
    private String codigo;
    private String precio;

    public ProductoTienda(String nombre, String codigo, String precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | " + codigo + " | " + precio;
    }

}
