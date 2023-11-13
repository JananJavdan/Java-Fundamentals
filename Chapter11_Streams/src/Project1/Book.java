package Project1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
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
    public Book getNewesteBook(Book[] books){//methode implementatie
        return Arrays.stream(books)
               .filter(book-> books.releaseDate)
                .collect(Collectors.toList());
    }
}
