package Les1;

import java.util.concurrent.Callable;

public class CarApp {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("This vehicle is an : "+myCar.getTypeOfVehicle()+"\n The brand is:" +myCar.getBrandName());

        myCar.sound();

        myCar.honk();



    }



    }

