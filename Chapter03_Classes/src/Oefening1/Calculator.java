package Oefening1;

public class Calculator {
    //Schrijf een methode die het kleinste nummer van 3 nummers kan vinden.
    public int kliensteNummer(int num1, int num2, int num3){
        int klienste = num1;
        if (num2 < klienste){
            klienste = num2;
        }
        if (num3 < klienste){
            klienste = num3;
        }
        return klienste;
    }


    //Schrijf een methode om te controleren of elk cijfer van een bepaald geheel getal even is.
    public static boolean evenGetal(int number){

        if (number %2 == 0){ //Is het getal even, retourneer dan true
            return true;
        }
        if (number %2 != 0){ //Is het getal even, retourneer dan true
            return false;
        }
        else {
            return false;
        }
    }


    // een programma dat berekening kan doen net als een calculator.
    public static int optellen(int a, int b) {
        int optellen = a + b;
        System.out.println(a+b);
        return optellen;
    }

    public static int aftrekken(int a,int b) {
        int aftrekken = a - b;
        System.out.println(a-b);
        return aftrekken;
    }


    public static int vermenigvuldigen (int a,int b) {
        int vermenigvuldigen = a * b;
        System.out.println(a*b);
        return vermenigvuldigen;
    }
    public static int delen (int a,int b) {
        int delen = a / b;
        System.out.println(a/b);
        return delen;
    }
    public static int modulus (int a,int b) {
        int modulus = a % b;
        System.out.println(a%b);
        return modulus;
    }
}
