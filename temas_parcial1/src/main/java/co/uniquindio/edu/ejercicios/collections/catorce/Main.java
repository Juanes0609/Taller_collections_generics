package co.uniquindio.edu.ejercicios.collections.catorce;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Ejercicio 14: Historial de mensajes de una app de mensajeria usando ArrayDeque.
 */

public class Main {
    static void main() {
        HistorialMensajes mensajes = new HistorialMensajes(10);

        for (int i = 0; i <= 15; i++) {
        mensajes.enviarMensaje("Mensaje " + i);
        }

        // Imprime los ultimos 10, del Mensaje 6 al 15
        for (String msg : mensajes.obtenerUltimo()) {
            System.out.println(msg);
        }

    }

    public static class HistorialMensajes {
        private final Deque<String> historial;
        private final int limite;

        public HistorialMensajes(int limite) {
            this.historial = new ArrayDeque<>();
            this.limite = limite;

        }

        public void enviarMensaje(String texto) {
            historial.addLast(texto);

            if(historial.size() > limite) {
                historial.removeFirst();
            }
        }

        public Iterable<String> obtenerUltimo() {
            return historial;
        }
    }
}
