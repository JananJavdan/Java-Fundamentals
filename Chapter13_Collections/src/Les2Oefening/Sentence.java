package Les2Oefening;
//Maak een nieuwe list met de naam"sentence", datatype String en schrijf deze methoden
// printSentence, printSentenceInReverseOrder, printNumberOfWords. En roep alle methoden op in de main methode
import java.util.Collections;
import java.util.LinkedList;

public class Sentence {
    private LinkedList<String> sentenceList;


    public Sentence(String sentence) {
        this.sentenceList.add(sentence);
    }

    public Sentence() {
        this.sentenceList = new LinkedList<>();
    }
    public void addSentence(String sentence) {
        sentenceList.add(sentence);
    }

    public void printSentence() {
        for (String sentence : sentenceList) {
            System.out.println(sentence);
        }
    }

    public void printSentenceInReverseOrder() {
        LinkedList<String> reversSentence = new LinkedList<>(sentenceList);
        Collections.reverse(reversSentence);
        for (String sentence : reversSentence) {
            System.out.println(sentence);

        }
    }
        public void printNumberOfWords() {
            int numberOfWords = sentenceList.size();
            System.out.println("Numberof de words" + numberOfWords);



        }


}

