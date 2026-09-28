package co.uniquindio.edu.listas_enlazadas.simplemente_enlazada;

public class Main {
    static void main() {
        ListaSimplementeEnlazada miLista = new ListaSimplementeEnlazada();

        miLista.agregarFinal("Chica");
        miLista.agregarInicio("Esteban");
        miLista.agregarInicio("Juan");
        miLista.agregarFinal("Ortega");


        System.out.println(miLista.mostrar());
    }


}
