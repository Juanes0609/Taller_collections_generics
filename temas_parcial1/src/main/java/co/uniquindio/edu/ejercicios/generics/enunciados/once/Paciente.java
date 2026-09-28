package co.uniquindio.edu.ejercicios.generics.enunciados.once;

import java.sql.Timestamp;

/**
 * Enunciado 11: Paciente(id, nombre, prioridad, timestampIngreso) con orden natural por nombre.
 * ColaAtencionPacientes (LinkedList<Paciente>) ofrece un metodo que devuelve
 * los K pacientes con prioridad >= P mas recientes,
 * usando SOLO Iterator (sin for-each ni streams).
 */
public class Paciente implements Comparable<Paciente>{
    private String id;
    private String nombre;
    private int prioridad;
    private long timestampIngreso;

    public Paciente(String id, String nombre, int prioridad, long timestampIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.timestampIngreso = timestampIngreso;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTimestampIngreso() {
        return timestampIngreso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente p) {
        return this.nombre.compareTo(p.nombre);
    }
}
