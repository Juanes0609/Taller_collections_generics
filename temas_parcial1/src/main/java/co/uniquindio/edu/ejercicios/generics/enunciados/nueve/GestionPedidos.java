package co.uniquindio.edu.ejercicios.generics.enunciados.nueve;

import co.uniquindio.edu.ejercicios.generics.intermedio.ocho.Comparador;

import java.util.*;

public class GestionPedidos {
    LinkedList<Pedido> pedidos = new LinkedList<>();

    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }

    public List<Pedido> filtrarPorCliente(String clienteBuscado) {
        List<Pedido> resultado = new ArrayList<>();
        Iterator<Pedido> iterator = pedidos.iterator();

       while(iterator.hasNext()) {
           Pedido actual = iterator.next();
           if (actual.getCliente().equals(clienteBuscado)) {
               resultado.add(actual);
           }
       }
       return resultado;
    }

    public Comparator<Pedido> obtenerComparadorFecha() {
        return new Comparator<Pedido>() {
            @Override
            public int compare(Pedido p1, Pedido p2) {
                int cmpFecha = p1.getFecha().compareTo(p2.getFecha());
                if (cmpFecha != 0) {
                    return cmpFecha;
                }
                return Double.compare(p2.getTotal(), p1.getTotal());
            }
        };
    }
}
