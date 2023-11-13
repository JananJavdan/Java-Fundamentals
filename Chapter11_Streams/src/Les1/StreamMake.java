package Les1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMake {
    public static void main(String[] args) {
        //Create Stream using Stream.of
        Stream<String> names = Stream.of("Jai","Hemant");
        names.forEach(System.out::println);

        System.out.println("--------------");
        //Create stream using array of elements
        Stream<Integer> intStream1 = Stream.of(new Integer[]{1,2,3,4,5});
        intStream1.forEach(System.out::println);

        List<String> namesList = Arrays.asList("Vishal","Naren");
        Stream<String> namesStream = namesList.stream();
        namesStream.forEach(System.out::println);
    }
}
