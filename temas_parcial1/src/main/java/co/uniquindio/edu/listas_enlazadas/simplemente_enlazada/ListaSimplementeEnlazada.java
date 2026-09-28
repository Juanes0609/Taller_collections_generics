package co.uniquindio.edu.listas_enlazadas.simplemente_enlazada;

public class ListaSimplementeEnlazada {
    private Node inicio;
    private int tam;

    public ListaSimplementeEnlazada() {
        inicio = null;
        tam = 0;
    }

    /**
     * Metodo para agregar un nodo al inicio de la lista
     *
     * @return void
     */
    public void agregarInicio(String element) {
        Node newNode = new Node(element);

        newNode.setNext(inicio);
        inicio = newNode;
        tam++;
    }

    /**
     * Método para mostrar ListaSimplementeEnlazada
     *
     * @return String mostrando la lista
     */
    public String mostrar() {
        String listaString = "[";
        if (inicio == null && tam == 0) {
            listaString += " Null";
        } else {
            Node aux = inicio;

            while (aux != null) {
                listaString += aux.getElement();
                if (aux.getNext() != null) {
                    listaString += ", ";
                }
                aux = aux.getNext();
            }
        }
        listaString += " ]";
        return listaString;
    }

    /**
     * Metodo para agregar un nodo al final de la lista
     * Recorre hasta llegar al ultimo elemento
     * @return void
     */
    public void agregarFinal(String element) {
        Node newNode = new Node(element);

        if(tam == 0 && inicio == null) {
            inicio = newNode;
        } else {
            Node aux = inicio;

            while(aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        tam++;
    }

    public Node getInicio() {
        return inicio;
    }

    public void setInicio(Node inicio) {
        this.inicio = inicio;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
