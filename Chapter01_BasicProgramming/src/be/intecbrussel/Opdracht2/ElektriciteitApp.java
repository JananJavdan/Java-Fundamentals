package be.intecbrussel.Opdracht2;

import java.util.Locale;
import java.util.Scanner;

public class ElektriciteitApp {
    public static void main(String[] args) {

        System.out.println("Welkom to elektiriciteitapp, deze app elektriciteitsrekeningen te berekenen");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebruikers wordt gevraagd of ze berekeningen willen maken voor meer dan één huis (yes/no).");
        char answer = scanner.next().toLowerCase().charAt(0);

        double rekeningTotal = 0;

        if (answer == 'y')
        {
            System.out.println("hoeveel huizen");
            int number = scanner.nextInt();

            for (int i = 1; i <= number;i++)
            {

                System.out.println("Naam van de verbruiker");
                String naam = scanner.next();
                System.out.println("vermogen in watt per uur");

                double VermogenPerUur = scanner.nextDouble();

                System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt");
                double UrenPerDag = scanner.nextDouble();

                System.out.println("Aantal dagen per maand waarop elektriciteit wordt gebruikt");
                double dagenPerMaand = scanner.nextDouble();

                System.out.println("Eenheidsprijs voor elektriciteit");
                double Enheidsprijs = VermogenPerUur*UrenPerDag*dagenPerMaand;

                rekeningTotal += Enheidsprijs;
                System.out.println("*********************************************");
                System.out.println("Naam van de verbuiker is " + naam);
                System.out.println("elektriciteit kosten is " + Enheidsprijs);


            }

            System.out.println("Total elektriciteit kosten is " + rekeningTotal);
        }
        else if (answer == 'n')
        {
            System.out.println("Naam van de verbruiker");
            String naam = scanner.next();
            System.out.println("vermogen in watt per uur");

            double VermogenPerUur = scanner.nextDouble();

            System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt");
            double UrenPerDag = scanner.nextDouble();

            System.out.println("Aantal dagen per maand waarop elektriciteit wordt gebruikt");
            double dagenPerMaand = scanner.nextDouble();


            double Enheidsprijs = VermogenPerUur*UrenPerDag*dagenPerMaand;

            System.out.println("*********************************************");
            System.out.println("Naam van de verbuiker is " + naam);
            System.out.println("Eenheidsprijs voor elektriciteit is " + Enheidsprijs);

        }
        else
        {
                System.out.println("u keuze ongeldig is");
        }

        System.out.println("Bedankt");



    }

}
