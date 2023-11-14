package Project1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookApp {
    public static void main(String[] args) {
        Person person = new Person();//maak en person objecten
//maak een list van person objecten
        List<Person> authors = new ArrayList<>();
        authors.add(new Person("Kathryn","Stockett", LocalDate.ofYearDay(1969, 12)));
        authors.add(new Person("Sara", "Gruen", LocalDate.ofYearDay(1962, 17)));
        authors.add(new Person("Markus", "Zusak", LocalDate.ofYearDay(1939, 8)));
        authors.add(new Person("Arthur", "Golden", LocalDate.ofYearDay(1930, 20)));
        authors.add(new Person("Yann", "Martel", LocalDate.ofYearDay(1977, 10)));


// Maak een array van Book objecten
        Book[] books = new Book[5];
        books[0] = new Book("The Help",authors.get(0), LocalDate.of(2009, 2, 10), "Classic");
        books[1] = new Book("Water for Elphants", authors.get(1), LocalDate.of(2006,5, 22), "Historical");
        books[2] = new Book("The Book Thief", authors.get(2), LocalDate.of(2005, 3, 1), "World War");
        books[3] = new Book("Memories of a Geisha", authors.get(3), LocalDate.of(2005, 22, 11), "Asia");
        books[4] = new Book("Life of Pi", authors.get(4), LocalDate.of(2001, 9, 11), "Literature");
    }


}
