package Les1;

import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        Stream.of("Jai", "Mahesh", "Vishal", "Naren", "Hemant")
                .sorted()
                .forEach(System.out::println);
    }
}
