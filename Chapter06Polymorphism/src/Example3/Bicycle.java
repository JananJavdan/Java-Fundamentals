package Example3;

public class Bicycle extends Vehicle{
    @Override
    public void makeASound() { //in sub klas override de method van super klkas
        super.makeASound();

        System.out.println("Brr-Brr-rr");
    }
}
