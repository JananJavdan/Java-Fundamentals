package Oefening2;

public class Oefening2 {
    public static void main(String[] args) {
        String myString = ("maak van deze string een char array");

        char[] charArray = myString.toCharArray();

        System.out.println("CharArray:");
        for (char c : charArray) {
            System.out.println("myChar is:" + c);
        }
    }
   }

