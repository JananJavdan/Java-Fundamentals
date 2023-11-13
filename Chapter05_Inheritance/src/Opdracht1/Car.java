package Opdracht1;

public class Car {
    private String color;
    private int speed;
    private int hp;

    public Car(){}
    public Car(String color){
        this.color = color;
    }
    /*public Car(int speed){
        this.speed = speed;
    }
    public Car(int hp){
        this.hp = hp;
    }*/
    public Car(String color,int speed,int hp){
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
    public int getHp() {
        return hp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void accelerate(int amount){
        this.speed += amount;
    }
    public void slow(int amount){
        this.speed -= amount;
    }
    public void park(){
        this.speed = 0;
    }
    public  String toString(){
        return "car with speed";
    }
}
