package Oefening1;

import java.util.Arrays;

public class MainLambda {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //hiere array van numbe schrijven

        Lambda even = (number) -> number % 2 == 0; //hier lambda expressin schrijven
        for (int number : numbers) { //for elke number numbers rekenenhouden
            if (even.even(number)) { //als even is
                System.out.println(number + " is even");//dan uitgevoerd worden

            }

        }

    }
}



