package Oefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening2 {

    public static void main(String[] args) {

        List<String> staden = Arrays.asList("Roma", "New York", "Amsterdam", "Paris");
        List<Integer> lengthMax = staden.stream().map(x -> x.length())
                .max(Integer::compare).stream()
                .collect(Collectors.toList());

        System.out.println("In deze lijst " + staden + ", is de lengte van de langste String: " + lengthMax);

    }
}
