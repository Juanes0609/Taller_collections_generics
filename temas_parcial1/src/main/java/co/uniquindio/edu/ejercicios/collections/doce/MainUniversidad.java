package co.uniquindio.edu.ejercicios.collections.doce;
import java.util.TreeSet;

/**
 * Ejercicio 12: Nombres de estudiantes ordenados alfabeticamente con TreeSet.
 * String ya implementa Comparable<String>, por lo que el TreeSet se ordena solo.
 */

public class MainUniversidad {
    static void main() {
        Universidad universidad = new Universidad();

        universidad.agregarEstudiantes("Juan");
        universidad.agregarEstudiantes("Alex");
        universidad.agregarEstudiantes("Gerónimo");

        System.out.println("Estudiantes ordenados: " + universidad.getEstudiantes());
        System.out.println("Primer estudiante de la lista: " + universidad.primerEstudiante());
        System.out.println("Último estudiante de la lista: " + universidad.ultimoEstudiante());
    }

    public static class Universidad {
        private final TreeSet<String> estudiantes = new TreeSet<>();

        public void agregarEstudiantes(String nombre) {
            estudiantes.add(nombre);
        }

        public String primerEstudiante() {
            if (estudiantes.isEmpty()) {
                return "No hay estudiantes registrados.";
            } else {
                return estudiantes.first();
            }
        }

        public String ultimoEstudiante() {
            if (estudiantes.isEmpty()) {
               return "No hay estudiantes registrados.";
            } else {
                return estudiantes.last();
            }
        }

        public TreeSet<String> getEstudiantes() {
            return estudiantes;
        }
    }
}
