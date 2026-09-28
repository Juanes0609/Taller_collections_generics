package co.uniquindio.edu.ejercicios.generics.enunciados.doce;

import java.time.LocalDate;

/**
 * Enunciado 12: Evento(titulo, fecha, lugar).
 */
public class Evento {
    private String titulo;
    private LocalDate fecha;
    private String lugar;

    public Evento(String titulo, LocalDate fecha, String lugar) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }


}
