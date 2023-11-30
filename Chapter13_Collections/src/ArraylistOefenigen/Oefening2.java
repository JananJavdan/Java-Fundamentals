package ArraylistOefenigen;

import java.util.*;

public class Oefening2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();//class random

       for (int i =0; i<10; i++) {
           int randomNumbers = random.nextInt(50);
           numbers.add(randomNumbers);
       }

      numbers.stream().sorted(Comparator.reverseOrder())
              .forEach(number -> System.out.println(numbers));
        System.out.println(numbers);
        }



    }

