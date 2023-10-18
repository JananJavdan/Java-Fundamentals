package Oefening6VanEnums;

public class HolidayDestination {

    public static String getHolidayDestination(Landen landen){

        switch (landen){
            case BELGIE:
                break;
            case NEDERLAND:
                break;
            case SWAZILAND:
                break;
            case SPANJE:
                break;
            case ZWITSERLAND:
                break;
            case BULGARIJE:
                break;
            case CANADA:
                break;
            case CUBA:
                break;
            case DOMINICA:
                break;
        }
        return "destination";
    }
}

/*
    public static void displayAction(Country country){

        String countryName = country.toString();//Name of the country
        String action = "What to do:";//Action
        System.out.println("Your choice is "+countryName+" - "+action);
        switch (country){
            case USA:
                System.out.println("Visit New York");
                break;
            case INDIA:
                System.out.println("Buy souvenirs");
                break;
            case ITALY:
                System.out.println("Dont forget to buy cookies");
                break;
            case JAPAN:
                System.out.println("Visit a local market");
                break;
            case BRAZIL:
                System.out.println("Buy bright clothe");
                break;
            case CANADA:
                System.out.println("Visit a mapl farm");
                break;
            case FRANCE:
                System.out.println("Visit the Louvre");
                break;
            case GERMANY:
                System.out.println("see a Friend");
                break;
            case AUSTRALIA:
                System.out.println("Visit the opera");
                break;
            case UKRAINE:
                System.out.println("Take a walk around Kyiv");
                break;
        }

    }
}
*/