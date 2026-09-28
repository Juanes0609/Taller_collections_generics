package co.uniquindio.edu.generics.genericClass;

public class GenericBox <E>{
    private E element;

    public GenericBox(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

