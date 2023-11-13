package Oefening1;

public class MainApp {
    public static void main(String[] args) {
        Lion myLion = new Lion(120,"lulu","brullen");
        Tiger myTige = new Tiger("lichtbruin","titi","huuw");
        Leopard myLeopard = new Leopard("vlees","leo","ghoow");

        //Lion
        System.out.println("Naam: " + myLion.getNaam());
        System.out.println("Geluid:" + myLion.getGeluid());
        System.out.println("Snelheid:" + myLion.getSnelheid());
        //Tiger
        System.out.println("Naam:" + myTige.getNaam());
        System.out.println("Geluid:" + myTige.getGeluid());
        System.out.println("Color:" + myTige.getColor());
        //Leopard
        System.out.println("Naam:" + myLeopard.getNaam());
        System.out.println("Geluid:" + myLeopard.getGeluid());
        System.out.println("Food:" + myLeopard.getFood());
    }
}
