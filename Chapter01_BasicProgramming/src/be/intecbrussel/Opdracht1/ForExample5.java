package be.intecbrussel.Opdracht1;

import java.util.Scanner;

public class ForExample5 {
    public static void main(String[] args) {
        //maak een programma dat alle getallen afdrukt tussen -10 en +10
        for (int i = -10; i <= 10; i++) {
            if (i > 0) {
                System.out.println(i++);
            } else {
                System.out.println(i);
            }
        }
    }
}
