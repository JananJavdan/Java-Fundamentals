package Les2Example.OefeningLes2;

import java.util.LinkedList;

public class List {
    private LinkedList<Integer> list = new LinkedList<>();

    public List() {
        this.list = list;
    }
    //om de lijst van getallen af te drukken
    public void printList(){
        for (Integer number : list){
            System.out.println("number printed "+number);
        }
    }
    //om de som van alle getallen in de lijst af te drukken
    public void printSum(){
        int sum = 0;
        for (Integer number : list){
            sum+= number;
        }
        System.out.println("sum of the number: "+sum);
    }
    //om het gemiddelde van de getallen in de lijst af te drukken
    public void printAverage(){
        if (!list.isEmpty()) {//controleert of de lijst leeg is. Als de lijst leeg is, retourneert deze methode true, anders retourneert deze false.
            int sum = 0;
            for (Integer number : list) {
                sum += number;
            }
            double averege = (double) sum / list.size();
            System.out.println("average of number: " + averege);
        }else {
            System.out.println("list is empty, can not calculate");
        }

    }

    public void addNumber(int number) {
        list.add(number);
    }
    // is verantwoordelijk voor het toevoegen van een getal aan de lijst
}

