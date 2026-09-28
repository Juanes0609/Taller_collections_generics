package co.uniquindio.edu.comparables;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MainComparable {
    static void main() {
        LinkedList<Book> library = new LinkedList<>();

        library.add( new Book("Ingeniería de Software", 2009));
        library.add(new Book("Cien años de soledad", 1980));
        library.add(new Book("Programación Funcional", 2010));
        IO.println("Biblioteca: \n" + library);

        // Using Comparator
        Collections.sort(library, new BooksComparator());
        IO.println("Biblioteca: \n" + library);

        // Creating Comparator as an anonymous class
        Collections.sort(library, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        IO.println("Biblioteca: \n" + library);

        // Using lambda to create an anonymous class Comparator
        library.sort(((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())));
        IO.println("Biblioteca: \n" + library);

        // Using Integer for primitives as int
        library.sort(((o1, o2) -> Integer.compare(o1.getYear(), o2.getYear())));
        IO.println("Biblioteca: \n" + library);

        library.sort(Comparator.comparing(Book::getYear));
        IO.println("Biblioteca: \n" + library);

        // Descendent form: use .reversed()
        library.sort(Comparator.comparing(Book::getYear).reversed());
        IO.println("Biblioteca: \n" + library);

    }
}
