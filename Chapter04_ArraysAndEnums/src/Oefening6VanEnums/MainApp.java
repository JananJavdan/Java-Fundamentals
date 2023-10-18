package Oefening6VanEnums;

import com.sun.jdi.Value;

public class MainApp {
    public static void main(String[] args) {

        for (int i = 0; i < Landen.values().length; i++ ) {
            System.out.println(i + " :" + Landen.values()[i]);
        }
        Landen landen = Landen.BELGIE;
        String destination = HolidayDestination.getHolidayDestination(landen);

        System.out.println("the holiday destination for " +landen + " " + "is" + " " + destination);

    }
}
/*
import java.util.Scanner;

public class MainAppForCountries {
    public static void main(String[] args) {
        System.out.println("Countries: ");
        for (int i = 0; i<Country.values().length;i++){
            System.out.println(i+"="+Country.values()[i]);
        }
//calling a method with a switch option
//MethodForCountries.displayAction(Country.Brazil);

//Entering the index of the Country
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter index of the Country");
        int countryIndex = scanner.nextInt();

//Country+Method(Action)
        Country selectedCountry = Country.values()[countryIndex];
        MethodForCountries.displayAction(selectedCountry);

    }

 */