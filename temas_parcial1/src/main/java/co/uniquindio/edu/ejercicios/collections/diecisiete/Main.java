package co.uniquindio.edu.ejercicios.collections.diecisiete;

import java.time.LocalDateTime;

/**
 * Ejercicio 17: Agenda de eventos ordenada cronologicamente usando TreeMap.
 * Se usa List<EventoAgenda> como valor para soportar varios eventos el mismo dia
 * sin perder informacion (un TreeMap<LocalDate, EventoAgenda> simple sobrescribiria
 * el evento anterior si cayera el mismo dia).
 */

public class Main {
    static void main() {
        EventoAgenda miAgenda = new EventoAgenda();



        miAgenda.agregarEvento(LocalDateTime.of(2026, 8, 24, 9, 00),
                "Entrega de taller");
        miAgenda.agregarEvento(LocalDateTime.of(2026, 9, 28, 10, 00),
                "Entrega de taller");
        miAgenda.agregarEvento(LocalDateTime.of(2026, 10, 1, 11, 00),
                "Clase de Infraestructura");
        miAgenda.agregarEvento(LocalDateTime.of(2026, 10, 20, 23, 59),
                "Entrega de proyecto de DETI");

        System.out.println("Todos los eventos guardados:");
        miAgenda.mostrarEventos();
        System.out.println("\n");

        LocalDateTime hoy = LocalDateTime.now();

        miAgenda.mostrarProximoEvento(hoy);


    }
}
