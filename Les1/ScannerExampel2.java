package be.intecbrussel.Les1;

import java.util.Scanner;

public class ScannerExampel2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = myScanner.nextLine();

        System.out.println("Enter age:");
        int age = myScanner.nextInt();

        System.out.println("Enter salary:");
        double salary = myScanner.nextDouble();

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
    }
}
