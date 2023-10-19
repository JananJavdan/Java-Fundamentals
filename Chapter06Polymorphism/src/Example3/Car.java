package Example3;

public class Car extends Vehicle{
    @Override
    public void makeASound() {
        super.makeASound();

        System.out.println("Vroem vroem");
    }
}
