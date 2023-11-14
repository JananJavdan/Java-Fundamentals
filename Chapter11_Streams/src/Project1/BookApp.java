package Project1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookApp {
    public static void main(String[] args) {
        Person person = new Person();//maak en person objecten
//maak een list van person objecten
        List<Person> authors = new ArrayList<>();

        authors.add(new Person("Kathryn","Stockett","1969"));
        authors.add("The Kite Runner");
        authors.add("Water for Elephants");
        authors.add("The Book Thief");
        authors.add("A Thousand Splendid Suns");


// Maak een array van Book objecten
        Book[] books = new Book[5];
        books[0] = new Book("The Help",authors.get(0), LocalDate.of(2009, 2, 10);
    }


}
