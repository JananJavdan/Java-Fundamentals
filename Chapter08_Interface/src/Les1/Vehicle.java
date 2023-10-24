package Les1;

public interface Vehicle {
    //constant variables -> bad practies
    public static final int doors = 3; // public static final is unnecessery
    int wheels = 4;

    //methodes
    public abstract void speedUp();
    void braking();
    void shifftGearUP();
    void shifftGearDown();
    int getCurrentGear();


}
