package Project1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class BookInfo {
    //methode 1 implementatie om trug geven het nieuwste boek
    public static Book getNewesteBook(Book[] books){
        return Arrays.stream(books)
                .max(Comparator.comparing(Book :: getReleaseDate))  //max() methode gebruikt om het boek met de nieuwste datum te vinden
                .orElse(null);

    }

    //methode 2 implementatie om afprinted de jongeste schrijver
    public static void  printyoungestWriter(Book[] books){
        Person youngestWriter = Arrays.stream(books)
                .map(Book :: getAuthor)
                .min(Comparator.comparing(person -> person.getDateOfBirth().getYear()))
                .orElse(null);
        System.out.println("youngest Writer is: " +youngestWriter.getFirstName()+" " + youngestWriter.getLastName());
    }

    //methode 3 implementatie om sorted boeken in alfabetische volgorde
    public static void  printSortedByTitle(Book[] books){
        Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(book -> System.out.println(book.getTitle()));
    }

    //methode 4 implementatie om afprint het aantal boeken per auteur
    public static void  countBooksPerAuthor(Book[] books){
        // Arrays.stream(books)
        System.out.println("count books per author: ");
      Map<Person, Long> booksPerAuthor = Arrays.stream(books)
             .collect(Collectors.groupingBy(Book :: getAuthor, Collectors.counting()));
                 booksPerAuthor.forEach((author, count) -> System.out.println(author.getFirstName() +
                 " " + author.getLastName() +":" +count + "books"));
                     //.collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));

    }

    //methode 5 implemetatie om de boeken afprinted die gereleaset zijn in 2016
    public static void  printBooksReleasedIn2016(Book[] books){
        Arrays.stream(books)
                .filter(book -> book.getReleaseDate().getYear() == 2016)
                .forEach(book -> System.out.println(book.getTitle()));

    }

}
