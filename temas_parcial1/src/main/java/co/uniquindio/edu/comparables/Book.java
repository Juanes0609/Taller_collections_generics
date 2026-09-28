package co.uniquindio.edu.comparables;

public class Book implements Comparable<Book>{
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " x(" + year + ")";
    }

    @Override
    public int compareTo(Book o2) {
        // return title.compareTo(l2.getTitle());
        return Integer.compare(year, o2.getYear());
    }

    
}
