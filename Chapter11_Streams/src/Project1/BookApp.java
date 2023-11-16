package Project1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookApp {
    public static void main(String[] args) {
        Person person = new Person();//maak en person objecten

//maak een list van person objecten
        List<Person> authors = new ArrayList<>();
        System.out.println("De naam van authors is :");
        authors.add(new Person("Kathryn","Stockett" , LocalDate.of(1969,10,15)));
        authors.add(new Person("Sara", "Gruen", LocalDate.of(1962, 8, 17)));
        authors.add(new Person("Markus", "Zusak", LocalDate.of(1939, 9, 7)));
        authors.add(new Person("Arthur", "Golden", LocalDate.of(1939, 6, 20)));
        authors.add(new Person("Yann", "Martel", LocalDate.of(1977, 4, 14)));

        for (Person author : authors)
            System.out.println(author.getFirstName()+" "+author.getLastName());
        System.out.println("***************************");


// Maak een array van Book objecten
        Book[] books = new Book[5];
        books[0] = new Book("The Help",authors.get(0), LocalDate.of(2009, 2, 10), "Classic");
        books[1] = new Book("Water for Elphants", authors.get(1), LocalDate.of(2006,5, 22), "Historical");
        books[2] = new Book("The Book Thief", authors.get(2), LocalDate.of(2016, 3, 1), "World War");
        books[3] = new Book("Memories of a Geisha", authors.get(3), LocalDate.of(2005, 11, 22), "Asia");
        books[4] = new Book("Life of Pi", authors.get(4), LocalDate.of(2001, 9, 11), "Literature");

        for (Book book : books){
            System.out.println(book.getTitle() + book.getAuthor().firstName +" by "+ book.getAuthor().getLastName()
                    +" date of publish :"+book.getReleaseDate() +" /genre :"+ book.getGenre());
        }
        System.out.println("***********************");
        //de methoden aanroepen
        Book newesteBook = BookInfo.getNewesteBook(books);//moet een object maken omdat niet static is
        System.out.println("het nieuweste book is: "+newesteBook.getTitle()+person.getFirstName()+newesteBook.getReleaseDate());
        System.out.println("*********************");

        BookInfo.printyoungestWriter(books);
        //System.out.println("youngest writer"+newesteBook.author);
        System.out.println("**********************");

        BookInfo.printSortedByTitle(books);
        System.out.println("boeken sorted by title");
        System.out.println("**********************");

        BookInfo.countBooksPerAuthor(books);
        //System.out.println("count book per author");
        System.out.println("**********************");

        System.out.println("print since 2016:");
        BookInfo.printBooksReleasedIn2016(books);


    }
}



