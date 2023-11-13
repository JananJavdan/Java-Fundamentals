package Streams;

import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        Stream.of("Jai", "Mahesh", "Vishel", "Naren", "Hemant")
                .sorted() // met sorteren de alfabet
                .forEach(System.out::println);
    }
}
