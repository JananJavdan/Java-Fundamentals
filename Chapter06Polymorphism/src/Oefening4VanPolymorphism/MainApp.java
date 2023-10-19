package Oefening4VanPolymorphism;

public class MainApp {
    public static void main(String[] args) {
    //Upcasting
        Vehicle vehicle1 = new Car();
        vehicle1.color = "Red";
        Vehicle vehicle2 = new Motorcycle();
        vehicle2.color = "Yellow";
        Vehicle vehicle3 = new Bike();
        vehicle3.color = "Green";

        System.out.println(vehicle1.color);
        System.out.println(vehicle2.color);
        System.out.println(vehicle3.color);

        vehicle1.model();
        vehicle2.model();
        vehicle3.model();

        //Downcasting
        Car car = (Car)vehicle1;
        Bike bike = (Bike) vehicle2;
        Motorcycle motorcycle = (Motorcycle)vehicle3;


    }
}
