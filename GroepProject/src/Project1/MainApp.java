package Project1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        System.out.println("Welcome to Roulette: guess 1 number 0-20: ");
        number = scanner.nextInt();

        System.out.println("You won: "+roulette.rolleTheRoulette(200,number)+ "€");
        roulette.getWinNumber();
    }

}
