package be.intecbrussel.Opdracht3;

import be.intecbrussel.Les2.StringBuilderExample;

import java.awt.*;
import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        System.out.println("Welcome to World Of PeaceCraft");//Je bent de moderator van een ‘World Of PeaceCraft’ -
        System.out.println("Niemand mogen neit referentie naar grollia doet");// Je hebt een regel in je server dat niemand een referentie naar gorilla’s doet
        Scanner scanner = new Scanner(System.in);

        int x = 1;
        while (x<3){
            System.out.println("geef je gebruiker naam in");
        }

        String UserName = scanner.nextLine();

        if (UserName.contains("gori") || UserName.contains("gorilla") || UserName.contains("Harambe" )){
        System.out.println("Grollia is verbannen");
        }
        else {
            System.out.println(" user verbannen is : "+ "UserName");
        }

        }


    }
