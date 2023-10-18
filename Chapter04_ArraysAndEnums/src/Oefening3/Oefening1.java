package Oefening3;

public class Oefening1 {
    public static void main(String[] args) {

        String myString = "Char Array!";
        char[] charArray = myString.toCharArray();

        for (int index = 0; index<charArray.length;index++){

            System.out.print( "|"+ index+"="+charArray[index]);
        }


    }
}

