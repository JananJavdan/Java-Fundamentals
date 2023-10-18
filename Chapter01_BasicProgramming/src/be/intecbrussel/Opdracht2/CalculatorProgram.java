package be.intecbrussel.Opdracht2;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {

        System.out.println("Welcome to age calculator program");
        System.out.println("Write the age");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = myScanner.nextInt();

        if (age >= 18){
            System.out.println("Your are an adult");
        } else if (age >= 10 & age < 18){
            System.out.println("You are a teenager");
        }
        else if (age >= 2 & age < 18){
            System.out.println("You are a child");
        }
        else if (age < 2 ){
            System.out.println("You are a baby");
        }
        System.out.println("Thank you for using this program");

    }
}
