package ArraylistOefenigen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oefening1 {
    public static void main(String[] args) {
        ArrayList<String> wordSet = new ArrayList<>(); //Maak een ArrayList
        wordSet.add("Lessen");
        wordSet.add("boeken");
        wordSet.add("Les");
        wordSet.add("NoteBoek");
        wordSet.add("Laptop");

        ArrayList<String> wordSet2 = new ArrayList<>();//Maak vervolgens een tweede ArrayList
        wordSet2.add("hhh");
        wordSet2.add("kkk");
        wordSet2.add("lll");

        ArrayList<String> mixtList = new ArrayList<>(wordSet);
        mixtList.addAll(wordSet2);
        System.out.println(mixtList);
       // wordSet2.addAll(wordSet); //Voeg nu beide ArrayList samen in een nieuwe ArrayList

        System.out.println("ArrayList -> ");
      //  System.out.println(wordSet + " "+ wordSet2);


    }
}
