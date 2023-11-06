package Project3;

public class DummyPhone implements ISimCard,IRadio{
    @Override
    public void playChannel(double fm) {

    }

    @Override
    public void changeChannel(double fm) {

    }

    @Override
    public void startCall(String number) {
        ISimCard.super.startCall(number);
    }

    @Override
    public void endCall() {
        ISimCard.super.endCall();
    }
}
