package co.uniquindio.edu.ejercicios.collections.siete;
import java.util.LinkedList;
import java.util.List;

/**
 * Ejercicio 7: Sistema de turnos de un banco usando LinkedList<String>.
 * Se elige LinkedList porque permite insertar/eliminar en ambos extremos,
 * lo cual es ideal para atender en orden y para insertar clientes con urgencia
 * al inicio sin recorrer ni desplazar toda la estructura
 */

public class MainBanco {
    static void main() {
        MainBanco turnosBanco = new MainBanco();

        turnosBanco.agregarCliente("Juan");
        turnosBanco.agregarCliente("Luis");
        turnosBanco.agregarCliente("Gerónimo");
        System.out.println("Cola inicial: " + turnosBanco.getCola());

        turnosBanco.agregarClientePrioritario("Martha VIP");
        turnosBanco.agregarClientePrioritario("AlexVIP");
        System.out.println("Cola prioritaria: " + turnosBanco.getCola());

        System.out.println("Atendido: " + turnosBanco.atenderCiente());
        System.out.println("Cola final: " + turnosBanco.getCola());
    }
    private final List<String> cola;

    public MainBanco() {
        this.cola = new LinkedList<>();
    }

    public List<String> getCola() {
        return cola;
    }

    public void agregarCliente(String nombre) {
        cola.addLast(nombre);
    }

    public void agregarClientePrioritario(String nombre) {
        cola.addFirst(nombre);
    }

    public String atenderCiente() {
        if(cola.isEmpty()) {
            return "No hay clientes en la cola";
        }

        return cola.removeFirst();
    }
}
