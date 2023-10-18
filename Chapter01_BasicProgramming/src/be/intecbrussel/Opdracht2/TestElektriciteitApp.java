package be.intecbrussel.Opdracht2;

import java.util.Scanner;

public class TestElektriciteitApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Elektericiteit App");//Het programma begint met een welkomstbericht
        System.out.println("Dit programma is bedoeld om elektriciteitsrekeningen te berekenen");//Het programma begint met een inleidende boodschap die uitlegt wat het programma doet.
        System.out.println("Gebruikers wordt gevraagd of ze berekeningen willen maken voor meer dan één huis (ja/nee).");
        Scanner scanner = new Scanner(System.in);

        char antwoord = scanner.next().toLowerCase().charAt(0); //char maakt voor charachter y en n

        double totaalRekening = 0;

        if (antwoord == 'y')
        {
            System.out.println("meerdere huizen"); //Als de gebruiker 'ja' (y) kiest, wordt een lus gebruikt om berekeningen uit te voeren voor meerdere huizen.
            int number = scanner.nextInt(); //Voor elk huis wordt de gebruiker gevraagd om de volgende informatie in te voeren:

            for (int i = 1; i <= number; i++)
            { //een lus gebruikt om berekeningen uit te voeren
                //Voor elk huis wordt de gebruiker gevraagd om de volgende informatie in te voeren:
                //variabelen
                System.out.println("schrif jouw naam alstublieft");
                String naam = scanner.next();

                System.out.println("vermogen in watt per uur");
                double vermogenInWarrPerUur = scanner.nextDouble();

                System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt");
                double aantalUrenPerDag = scanner.nextDouble();

                System.out.println("Aantal dagen per maand waarop elektriciteit wordt gebruikt");
                double aantalDagenPerMaand = scanner.nextDouble();

                System.out.println("eenheidsprijs voor elektriciteit");
                double eenheidsprijs = vermogenInWarrPerUur*aantalUrenPerDag*aantalDagenPerMaand;

                totaalRekening += eenheidsprijs;
                System.out.println("***********************************");
                System.out.println("naam van de gebruiker"+ naam);
                System.out.println( "elektriciteitKosten is" + eenheidsprijs);


            }
        }
        else if (antwoord == 'n') { //Als de gebruiker 'nee' (n) kiest, wordt de gebruiker gevraagd om dezelfde informatie in te voeren voor slechts één huis
            System.out.println("een huis");

            System.out.println("schrif jouw naam alstublieft");
            String naam = scanner.next();

            System.out.println("vermogen in watt per uur");
            double vermogenInWarrPerUur = scanner.nextDouble();

            System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt");
            double aantalUrenPerDag = scanner.nextDouble();

            System.out.println("Eenheidsprijs voor elektriciteit");
            double aantalDagenPerMaand = scanner.nextDouble();

            System.out.println("eenheidsprijs voor elektriciteit");
            double eenheidsprijs = vermogenInWarrPerUur*aantalUrenPerDag*aantalDagenPerMaand;

            System.out.println("***********************************");
            System.out.println("naam van de gebruiker"+ naam);
            System.out.println( "elektriciteitKosten is" + eenheidsprijs);



        } else { //Als de gebruiker een ongeldige optie invoert, wordt een bericht weergegeven dat aangeeft dat de keuze ongeldig is.
            System.out.println("de keuze ongeldig is.");
        }
        System.out.println("bedankt"); //Aan het einde van het programma wordt een bedankbericht aan de gebruiker getoond.
    }
}
