package Les1;

import java.util.stream.Stream;

public class StreamDistinct {
    public static void main(String[] args) {

        //The Stream.distinct() method returns a stream consisting of
        // the distinct elements of this stream. It uses Object.equals() method.
        Stream.of("Jai", "Mahesh", "Vishal", "Naren", "Hemant", "Naren", "Vishal")
                .distinct()
                .forEach(System.out::println);
    }
}
