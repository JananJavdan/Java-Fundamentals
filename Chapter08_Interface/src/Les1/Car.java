package Les1;

public class Car implements Vehicle{
    private int gear = 0;
    private int maxGears = 5;
    private float speed = 0f;
    private float maxSpeed = 120f;
    //constructor


    public Car(int gear, int maxGears, float speed, float maxSpeed) {
        this.gear = gear;
        this.maxGears = maxGears;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void speedUp() {

    }


    @Override
    public void braking() {

    }


    @Override
    public void shifftGearUP() {

    }

    @Override
    public void shifftGearDown() {

    }

    /**
     * @return
     */
    @Override
    public int getCurrentGear() {
        return 0;
    }
}
