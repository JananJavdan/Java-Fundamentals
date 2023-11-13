package Oefeningen;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Oefening5 {
    public static void main(String[] args) {
        //Schrijf een programma om alle dubbele elementen uit een lijst te verwijderen

        List<String>strings = Arrays.asList("abs", "bc", "na","abs", "na","mk");
        List<String> stream = strings.stream()
                .distinct()     //deze methode alle dubbele elementen uit de lijst verwijderd.
                .collect(Collectors.toList());//deze methode gebruikt om de resultaten op te slaan in een nieuwe lijst.
        System.out.println("dubbele elementen uit een lijst  verwijderd" +stream);

    }
}
//Collectors
//worden gebruikt om het resultaat van verwerking op de elementen van een stroom te
//combineren. Collectors kunnen worden gebruikt om een lijst of een string te retourneren.