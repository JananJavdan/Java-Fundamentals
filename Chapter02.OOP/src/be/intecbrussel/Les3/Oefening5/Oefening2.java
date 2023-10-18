package be.intecbrussel.Les3.Oefening5;

import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("6 willekeurige getallen afdrukt tussen de 0 en 45");
        int i = 0;
        for ( i = 0; i<6; i++){

            int randomIntBound = random.nextInt(45);
            System.out.println(randomIntBound);


        }

    }
}
