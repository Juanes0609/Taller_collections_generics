package co.uniquindio.edu.ejercicios.generics.enunciados.nueve;

import java.time.LocalDateTime;

/**
 * Enunciado 9: Pedido(id, cliente, fecha, total) con orden natural por id.
 * GestorPedidos mantiene LinkedList<Pedido> y ofrece:
 *  - filtrarPorCliente(cliente): solo con Iterator
 *  - orden natural por id (Comparable<Pedido>)
 *  - Comparator por fecha asc y, si empata, por total desc.
 */

public class Pedido implements Comparable<Pedido>{
    private String id;
    private String cliente;
    private LocalDateTime fecha;
    private double total;

    public Pedido(String id, String cliente, LocalDateTime fecha, double total) {
        this.id = id;
        this.cliente = cliente;
        this. fecha = fecha;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int compareTo(Pedido otro) {
        return this.id.compareTo(otro.id);
    }
}
