package Oefening4;

import java.util.Arrays;
import java.util.HashSet;

public class Oefening3 {
    public static void main(String[] args) {
        String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};
        HashSet<String> set = new HashSet<>(Arrays.asList(myArray));

        for (String stad : set) {

            System.out.println(stad);

        }

    }
}
