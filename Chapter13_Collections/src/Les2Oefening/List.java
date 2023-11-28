package Les2Oefening;

import java.util.LinkedList;
//Maak een nieuwe list met de naam"list", datatype Integer en schrijf deze methoden printList,
// printSum, printAverage. En roep alle methoden op in de main methode.
public class List {
    private LinkedList<Integer> list = new LinkedList<>();

    public List() {
        this.list = list;
    }
    //om de lijst van getallen af te drukken
    public void printList(){
        list.forEach(number-> System.out.println("Number printed: " +number));
    }
    //om de som van alle getallen in de lijst af te drukken
    public void printSum(){
        int sum = list.stream().mapToInt(Integer :: intValue).sum();
        System.out.println("sum of the number: "+sum);
    }

   /* public void printSum(){
        int sum = 0;
        for (Integer number : list){
            sum+= number;
        }
        System.out.println("sum of the number: "+sum);
    }*/

    //om het gemiddelde van de getallen in de lijst af te drukken
    public void printAverage(){
        if (!list.isEmpty()){
            double average = list.stream().mapToDouble(Integer :: doubleValue)
                    .average().orElse(0.0);
            System.out.println("average of number: "+average);
        }else {
            System.out.println("list is empty");
        }
    }

  /*  public void printAverage(){
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
    }*/

    public void addNumber(int number) {
        list.add(number);
    }
    // is verantwoordelijk voor het toevoegen van een getal aan de lijst
}

