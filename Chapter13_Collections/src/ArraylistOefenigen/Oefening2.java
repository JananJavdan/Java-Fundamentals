package ArraylistOefenigen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        ArrayList<String> randomNumbers = new ArrayList<>();
        Random random = new Random();//class random

     //   for (int i =0; i<10; ++i)
        //num.add(random.nextInt

        Integer[] numbers = {5,3,1,4,7,6,9}; //een Arraylist van 10 random numbers
        Arrays.sort(numbers, Collections.reverseOrder());//de getallen moeten van groot naar klein worden afgedrukt
        for (int num : numbers){
            System.out.println(num+"");
        }

        System.out.println(numbers);

    }
}
