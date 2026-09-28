package co.uniquindio.edu.ejercicios.generics.enunciados.doce;
/**
 * AgendaEventos (LinkedList<Evento>) implementa Iterable<Evento> con:
 * - iterador por defecto (orden de insercion iterador "solo futuros":
 * clase interna privada que avanza, en su constructor,
 * hasta el primer evento con fecha >= hoy.
 * - Comparator por (fecha asc, lugar, titulo)
 * - listarEntre(desde, hasta) usando exclusivamente un Iterator.
 */

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento implements Iterable<Evento> {
    private LinkedList<Evento> eventos = new LinkedList<>();

    public void agregarEventos(Evento e) {
        eventos.add(e);
    }

    @Override
    public Iterator<Evento> iterator() {
        return eventos.iterator();
    }

    public Iterator<Evento> iteradorFuturos() {
        return new IteradorFuturos();
    }

    private class IteradorFuturos implements Iterator<Evento> {
        private final LocalDate hoy = LocalDate.now();
        private final Iterator<Evento> base = eventos.iterator();
        private Evento siguienteValido = null;

        public IteradorFuturos() {
            avanzarAlProximoValido();
        }

        private void avanzarAlProximoValido() {
            siguienteValido = null;
            while (base.hasNext()) {
                Evento e = base.next();
                if (!e.getFecha().isBefore(hoy)) {
                    siguienteValido = e;
                    break;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return siguienteValido != null;
        }

        @Override
        public Evento next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            Evento actual = siguienteValido;
            avanzarAlProximoValido();
            return actual;
        }
    }

    public Comparator<Evento> comparadorCompleto() {
        return Comparator.comparing(Evento::getFecha)
                .thenComparing(Evento::getLugar)
                .thenComparing(Evento::getTitulo);
    }

    public List<Evento> listarEntre(LocalDate desde, LocalDate hasta) {
        List<Evento> resultado = new ArrayList<>();
        for (Evento e : eventos) {
            if(!e.getFecha().isBefore(desde) && !e.getFecha().isAfter(hasta)) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}
