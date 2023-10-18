package be.intecbrussel.Les3.Oefening5;

import java.util.Random;

public class Oefening1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("5 verschillende willekeurige integrs opvraagt");

        for (int i =0; i<5;i++){
            int x = random.nextInt();
            System.out.println(x);
        }


    }
}
