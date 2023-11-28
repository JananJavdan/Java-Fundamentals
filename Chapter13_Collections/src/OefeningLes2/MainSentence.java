package Les2Example.OefeningLes2;

import java.util.LinkedList;

public class MainSentence {
    public static void main(String[] args) {

        Sentence sentence = new Sentence();
        sentence.addSentence("heloo world");
        sentence.addSentence("inner class");
        sentence.addSentence("outer class");

        sentence.printSentence();
        System.out.println(" The sentences were printed");

        sentence.printNumberOfWords();

        System.out.println("sentence in rever order: ");
        sentence.printSentenceInReverseOrder();





    }
}