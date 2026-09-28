package co.uniquindio.edu.ejercicios.generics.enunciados.once;

import java.util.*;

public class ColaAtencionPacientes {
    private LinkedList<Paciente> pacientes = new LinkedList<>();

    public Comparator<Paciente> comparadorPrioridad() {
        return (p1, p2) -> {
            int cmpPrioridad = Integer.compare(p2.getPrioridad(), p1.getPrioridad());
            if(cmpPrioridad != 0) {
                return cmpPrioridad;
            }
            return Long.compare(p2.getTimestampIngreso(), p1.getTimestampIngreso());
        };
    }

    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public List<Paciente> obtenerTopKPrioritarios(int k, int prioridadMin) {
        pacientes.sort(comparadorPrioridad());

        List<Paciente> resultado = new ArrayList<>();
        Iterator<Paciente> iterator = pacientes.iterator();

        while (iterator.hasNext() && resultado.size() < k){
            Paciente actual = iterator.next();
            if (actual.getPrioridad() >= prioridadMin) {
                resultado.add(actual);
            }
        }
        return resultado;
    }
}
