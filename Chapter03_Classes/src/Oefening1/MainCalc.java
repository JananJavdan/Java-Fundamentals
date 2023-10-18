package Oefening1;

public class MainCalc {
    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        int smallNumber = obj1.kliensteNummer(12,34,56);
        System.out.println("Smallest number is" + smallNumber);

       // System.out.println(Calculator.kliensteNummer(0,2,3));



        System.out.println(obj1.evenGetal(123));//false
        System.out.println(obj1.evenGetal(8642));//true
        System.out.println(obj1.evenGetal(200));//true


        System.out.println(obj1.optellen(7, 6));
        System.out.println(obj1.aftrekken(8, 4));
        System.out.println(obj1.vermenigvuldigen(4, 4));
        System.out.println(obj1.delen(6, 3));
        System.out.println(obj1.modulus(7, 2));


    }
}
