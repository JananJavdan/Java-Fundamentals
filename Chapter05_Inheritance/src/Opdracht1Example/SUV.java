package Opdracht1Example;

public class SUV extends Car {
    private boolean bullbar;
    private boolean isAWDOn;

    public SUV(String color, int hp) {
        super(color, hp);
    }

    public boolean getBullbar() {
        return this.bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void allWheelDrive(boolean aWD) {
        this.isAWDOn = aWD;
        if (isAWDOn && getSpeed() > 30) {
            setSpeed(30);
        }
    }

    @Override
    public void accelerate(int amount) {
        super.accelerate(amount);
        if (isAWDOn && getSpeed() > 30) {
            setSpeed(30);
        }
    }

    @Override
    public String toString() {
        return "SUV{" +
                "bullbar=" + bullbar +
                ", isAWDOn=" + isAWDOn +
                "} " + super.toString();
    }

}
