package Opdracht1Example;

public class Car {
    private String color;
    private int speed;
    private int hp;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return this.hp;
    }

    public void accelerate(int amount) {
        if (amount < 0) {
            slow(-amount);
        } else {
            this.speed += amount + (hp / 100);
        }
    }

    public void slow(int amount) {
        if (amount < 0) {
            accelerate(-amount);
        } else {
            this.speed -= (amount + (hp / 100));
        }
    }

    public void park() {
        this.speed = 0;
    }

    public static void parkAllCars(Car[] cars) {
        for(Car car : cars) {
            car.park();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
