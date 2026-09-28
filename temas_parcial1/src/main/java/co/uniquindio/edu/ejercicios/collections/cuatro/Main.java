package co.uniquindio.edu.ejercicios.collections.cuatro;
import java.util.PriorityQueue;

/**
 * Ejercicio 4: Cola que almacena objetos de tipo Tarea,
 * usando PriorityQueue
 */

public class Main {
    static void main() {
        PriorityQueue<Tarea> queue = new PriorityQueue<>();

        queue.add(new Tarea("Revisar correo", 2));
        queue.add(new Tarea("Comer", 10));
        queue.add(new Tarea("Actualizar documentación", 1));
        queue.add(new Tarea("Reunión con cliente", 5));

        System.out.println("Orden de atención:");
        while (!queue.isEmpty()) {
            System.out.println("->" + queue.poll());
        }
    }
}
