package Opdracht1;

public class ElectricCar extends Car{
    private int battery;
    public ElectricCar(){}
    public ElectricCar(int battery){
        this.battery = battery;
    }
    public ElectricCar(int battery,int speed,int hp,String color){
        super(color,speed,hp);
        this.battery = battery;
    }
    public void accelerate(int amount){
     //   this.speed += amount;
    }
    public void slow(int amount){
     //   this.speed -= amount;
    }
}
