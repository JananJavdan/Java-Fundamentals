package Oefening;

public class MainApp {
    public static void main(String[] args) {
        //object maken en get methode aanroepen
        Pair<String> pair = new Pair<>("sara", "jackson");
        System.out.println(pair.getFistName());
        System.out.println(pair.getLastName());
        System.out.println(pair.toString());

    }
}
