package Les2Oefening;

import java.util.LinkedList;

public class MainSentence {
    public static void main(String[] args) {

        Sentence sentence = new Sentence();
        sentence.addSentence("Hallo world");
        sentence.addSentence("How are you");


        sentence.printSentence();
        System.out.println(" The sentences were printed");

        sentence.printNumberOfWords();

        System.out.println("sentence in rever order: ");
        sentence.printSentenceInReverseOrder();





    }
}