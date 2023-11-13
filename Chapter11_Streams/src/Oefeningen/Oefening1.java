package Oefeningen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Oefening1 {

        // Schrijf een programma om het gemiddelde van alle even getallen in een lijst te vinden
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10); //wordt een lijst van getallen gemaakt

            double gemiddeld = numbers.stream()  // wordt een stream gebruikt om alleen de even getallen te filteren.
                    .filter(i -> i%2 == 0)       //here filteren alle even getalen
                    .mapToInt(Integer :: intValue)   // met deze methode elk element in de stroom omzet in een int-waarde.
                    .average()          //methode gebruikt om het gemiddelde van de even getallen te berekenen.
                    .orElse(Double.NaN);  // Als er geen even getallen in de lijst zijn, zal de orElse-methode een NaN (Not a Number) teruggeven

            System.out.println("Het gemiddelde van alle even getallen is:"+gemiddeld); //zal de gemmideld van even getal afdrukt




        }
    }

