package ArraylistOefenigen;

import java.util.ArrayList;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object gebruiken om gebruiker kunnen lezen
        System.out.println("schrijf een woord");//Maak een kleine applicatie die de gebruiker vraagt naar woorden
        ArrayList<String> woorden = new ArrayList<>();//Voeg de input van de gebruiker toe aan een ArrayList
        woorden.add("Hallo");
        woorden.add("Winnen");
        woorden.add("Sucssed");
        woorden.add("Bravo");
        woorden.add("Goed kozen");
        woorden.add("end");
        //De applicatie moet stoppen als de gebruiker het woord "end" ingeeft.
        while (true){
            String input = scanner.next();
            if (input.equals("end")){
                break;//stop

            }else {
                System.out.println("het is een ongeldig woord");
                }
            }
        }

    }

