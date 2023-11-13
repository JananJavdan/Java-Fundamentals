package Opdracht1Example;

public class CarCrashApp {

    public static void main(String[] args) {

        //Cabrio cab = new Cabrio("Pink", 50);

        Car SUV = new SUV("Red", 250);
        Car eleky = new ElectricCar("Blue", 80);
        Car caby = new Cabrio("Purple", 100);

        Car[] cars = {SUV, eleky, caby};

        Car.parkAllCars(cars);



    }

}

