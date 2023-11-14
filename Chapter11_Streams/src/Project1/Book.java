package Project1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Book {
    public String title;
    public Person author;
    public LocalDate releaseDate;
    public String genre;

    public Book(String title, Person author, LocalDate releaseDate, String genre) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public static Book getNewesteBook(Book[] books){//methode implementatie
        return Arrays.stream(books)
                .max(Comparator.comparing(Book :: getReleaseDate))  //max() methode gebruikt om het boek met de nieuwste datum te vinden
                .orElse(null);


    }
    public void  printyoungestWriter(Book[] books){
         Arrays.stream(books)
                .max(Comparator.comparing(Book :: printyoungestWriter))
                .
    }
    public void  printSortedByTitle(Book[] books){
         Arrays.stream(books)
                .max(Comparator.comparing(Book :: printyoungestWriter))
                .orElse(books);
    }
    public void  printBooksReleasedIn2016(Book[] books){
        Arrays.stream(books);

    }
}
