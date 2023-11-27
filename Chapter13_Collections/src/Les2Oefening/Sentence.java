package Les2Oefening;
//Maak een nieuwe list met de naam"sentence", datatype String en schrijf deze methoden
// printSentence, printSentenceInReverseOrder, printNumberOfWords. En roep alle methoden op in de main methode
import java.util.Collections;
import java.util.LinkedList;

public class Sentence {
    LinkedList<String> sentence = new LinkedList<>();

    private LinkedList<String> sentenceList;
    

    public Sentence(String sentence) {
        this.sentenceList = new LinkedList<>();
    }

    public Sentence() {

    }

    public void printSentence(){
        for (String s : sentenceList) {
            System.out.println(" " + sentenceList);
        }
    }
    public void printSentenceInReverseOrder(){
        LinkedList<String> reverssentence = new LinkedList<>(sentenceList);
        Collections.reverseOrder();
        for (String s : sentenceList);
        System.out.println(sentenceList + " ");

    }
    public void printNumberOfWords(){
        System.out.println("Numberof de words");
        sentenceList.size();



    }
}

