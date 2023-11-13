package Streams;

import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        Stream.of("Jai", "Ahesh", "Vishal", "Naren", "Hement")
                .limit(3) // met limit allen tot derde index zal uitgevoeren
                .sorted() // hiere ook method sorted toevogen dan zal sorted uitvoren
                .forEach(System.out::println); // met for each zal printed
    }
}
