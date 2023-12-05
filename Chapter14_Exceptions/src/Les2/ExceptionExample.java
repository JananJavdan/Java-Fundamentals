package Les2;

import java.util.Scanner;
//try catch altij samen gebruiken
public class ExceptionExample {
    public static void main(String[] args) {
        String sLeeftijd;
        int iLeeftijd;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Geef je leeftijd in");
        sLeeftijd = scanner.nextLine();
        //controlr of leeftijd een geheel getal bevat of niet
        try {
            iLeeftijd = Integer.parseInt(sLeeftijd);//kan ook via Double.parseDouble of Float .parseFloat
            System.out.println("Jouw leeftijd: "+iLeeftijd);
        }
        catch (NumberFormatException nfe){
            //de numeriek waarde (numberformat) klopt niet
            System.out.println("Err: leeftijd bevat geen numerieke waarde");
        }
    }
}
