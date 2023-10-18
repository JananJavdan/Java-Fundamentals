package be.intecbrussel.Opdracht2;


import java.util.Random;
import java.util.Scanner;

public class HigherLowerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Higher Lower App.");
        Scanner scanner = new Scanner(System.in); //een scanner object om gebruikersinvoer te lezen

        Random random = new Random(); //Random-object om een willekeurig getal tussen 0 en 99 te genereren
        System.out.println("een willekeurig getal tussen 0 en 99 te genereren");

        int randomNumber = random.nextInt(99); // Dit willekeurige getal wordt opgeslagen in de variabele randomNumber.
        System.out.println(randomNumber);

          boolean doesNotMatch = true; // Deze variabele wordt gebruikt om te controleren of de speler het juiste getal heeft geraden
          int guessedNumber = -1;

          while (doesNotMatch = true) {  //Binnen de while-loop wordt de speler gevraagd om een getal te raden
            System.out.println("geef een getal raden");

            guessedNumber = scanner.nextInt(); //De ingevoerde gok wordt opgeslagen in de variabele guessedNumber.

              //Vergelijking met het willekeurige getal
            if (guessedNumber < randomNumber) { //Als de gok kleiner is dan het willekeurige getal, wordt "Higher" afgedrukt.
                System.out.println("Higher");
            }
            else if (guessedNumber > randomNumber) { //Als de gok kleiner is dan het willekeurige getal, wordt "Higher" afgedrukt.
                System.out.println("Lower");
            }
            else {
                System.out.println("Congrats");//-Als de gok gelijk is aan het willekeurige getal, wordt "Congrats!"

                break; //wat de while-loop beëindigt omdat de speler het juiste getal heeft geraden.
            }
        }
       // doesNotMatch = false;//en de waarde van doesNotMatch wordt ingesteld op false

        System.out.println("Thank you for choosing our app..");
        }

    }


