package co.uniquindio.edu.ejercicios.collections.diecisiete;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class EventoAgenda {
    private TreeMap<LocalDateTime, String> agenda;

    public EventoAgenda() {
        this.agenda = new TreeMap<>();
    }

    public void agregarEvento(LocalDateTime fecha, String descripcion) {
        agenda.put(fecha, descripcion);
    }

    public void mostrarProximoEvento(LocalDateTime fechaReferencia) {
        Map.Entry<LocalDateTime, String> proximo = agenda.ceilingEntry(fechaReferencia);

        if(proximo != null) {
            DateTimeFormatter formato = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            System.out.println("Proximo evento: " + proximo.getValue() +
                               " | Fecha: " +  proximo.getKey().format(formato));
        } else {
            System.out.println("No hay eventos programados después de esta fecha.");
        }
    }

    public void mostrarEventos() {
        for (Map.Entry<LocalDateTime, String> evento : agenda.entrySet()) {
            System.out.println(evento.getKey() + " - " + evento.getValue());
        }
    }
}
