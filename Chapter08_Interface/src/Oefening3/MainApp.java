package Oefening3;

public class MainApp {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.closeDoor(Vehicle.doors);
        System.out.println("omdat door is open");
        mycar.openDoor(Vehicle.doors);
        System.out.println("de door is close");
    }
}
