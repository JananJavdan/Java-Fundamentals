package be.intecbrussel.Opdracht3;
import java.util.Random;
public class Oefening3 {
    public static void main(String[] args) {

        int  experiencePunten = 0;
        int monster = 0;

        Random random = new Random();
        //De monsters geven je experience punten, en dat wordt ge-randomized.


        // Je moet nog maar 15 experience punten halen.
        while (experiencePunten < 15 & monster < 10) {

            experiencePunten = random.nextInt(3);//de monster geven 1,2 of 3 experience punten
            switch (monster){
                case 1:
                    System.out.println("exprience punten halen");
                case 2:
                    System.out.println("exprience punten halen");
                case 3:
                    System.out.println("exprience punten halen");
                    break;
            }
        }

        if (experiencePunten>1){ // je wilt monsters negeren die maar 1 experience punt geven.
            experiencePunten += monster;
            experiencePunten++;
        }
        if (experiencePunten<= 15){
            System.out.println("je level up hebt bereik");//zorg dat je stopt vanaf dat je een ‘Level up’ hebt bereikt.
        }

    }
}

