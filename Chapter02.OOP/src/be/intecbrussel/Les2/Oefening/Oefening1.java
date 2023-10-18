package be.intecbrussel.Les2.Oefening;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("voer een woord in om te controleren of het  een palindroom is");

        String woord = scanner.nextLine();
        System.out.println(woord);

        StringBuilder newWoord = new StringBuilder(woord).reverse();
        System.out.println(newWoord);

        String txt = newWoord.toString();
        System.out.println(txt);

        if (woord.equals(txt)) {
            System.out.println(woord + " is a palindroom");
        } else {
            System.out.println(woord + "is not a palindroom");


        }


    }
}




