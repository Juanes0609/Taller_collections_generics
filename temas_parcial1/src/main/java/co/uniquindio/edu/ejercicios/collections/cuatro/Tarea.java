package co.uniquindio.edu.ejercicios.collections.cuatro;

/**
 * Ejercicio 4: Cola de objetos "Tarea" con prioridad usando PriorityQueue.
 * Convencion: prioridad mas alta (numero mayor) = se atiende primero.
 */
public class Tarea implements Comparable<Tarea>{
    private String nombre;
    private int prioridad;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return nombre + "(prioridad: " + prioridad + ")";
    }

    public int compareTo(Tarea other) {
        return Integer.compare(other.prioridad, this.prioridad);
    }
}
