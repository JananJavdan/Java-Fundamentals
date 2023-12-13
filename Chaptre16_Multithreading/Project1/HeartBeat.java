package Project1;

public class HeartBeat implements Runnable {
    private int milliSecondsBetweenBeats;

    //constroctur
    public HeartBeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Heartbeat");
            try {
                Thread.sleep(milliSecondsBetweenBeats);//wachten seconden tussen heart beats
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
