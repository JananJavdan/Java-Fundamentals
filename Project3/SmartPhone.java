package Project3;

public class SmartPhone implements ICamera,IGPS,IRadio,ISimCard,IWifi{
    //attributes
    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;
//constraction
    public SmartPhone(double PRICE, String BRAND) {
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }
//getter
    public double getPRICE() {
        return PRICE;
    }
    public String getBRAND() {
        return BRAND;
    }
//ICamera
    @Override
    public void shootAPhoto(double amountOfPhotos) {
    }
    @Override
    public String[] viewPhotos() {
        return new String[0];
    }
//IGPS
    @Override
    public String locate(double latitude, double longitude) {
        return null;
    }
    @Override
    public void navigate() {
    }
//IRadio
    @Override
    public void playChannel(double fm) {
    }
    @Override
    public void changeChannel(double fm) {
    }
//ISimCard
    @Override
    public void startCall(String number) {
        ISimCard.super.startCall(number);
        System.out.println("Calling 911");
    }
    @Override
    public void endCall() {
        ISimCard.super.endCall();
        System.out.println("Call ended");
    }
//IWifi
    @Override
    public void connect(String internetConnection) {
        System.out.println("Internet connection 555");
    }
    @Override
    public void disconnect(String internetConnection) {
        System.out.println("Internet disconnected");
    }
}

