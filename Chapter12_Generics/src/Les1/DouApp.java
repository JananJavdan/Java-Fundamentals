package Les1;

public class DouApp {
    public static void main(String[] args) {
        // maken object van de klass
        Duo<String> duo = new Duo<>("Hallo", "World");
        System.out.println(duo.getS1()); //hoe kan we de waarde van variabelen aanroepen ? met de naam van de object en punt en get
        System.out.println(duo.getS2());

        Duo<Integer> duo2 = new Duo<>(1,5);  //object maken met wrapper class
        System.out.println(duo2.getS1());
        System.out.println(duo2.getS2());
    }



}
