package Oefening3VanPolymorphism;

public class VormenApp {
    public static void main(String[] args) {
        Vormen cirkel = new Cirkel();
        System.out.println(" De omtrek van cirkel is:" + cirkel.getOmtrek());
        System.out.println("De oppervlakte van cirkel is:" + cirkel.getOppervlakte());
        System.out.println("************************");

        Vormen driehoek = new Driehoek();
        System.out.println("De omtrek van cirkel is:" + driehoek.getOmtrek());
        System.out.println("De oppervlakte van cirkel is:" + driehoek.getOppervlakte());
        System.out.println("******************************");

        Vormen vierkant = new Vierkant();
        System.out.println("De omtrek van vierkant is:" + vierkant.getOmtrek());
        System.out.println("De oppervlakte van vierkant is:" + vierkant.getOppervlakte());




    }
}
