package Project1;

public class HeartBeat implements Runnable {
    private int milliSecondsBetweenBeats;

    //constroctur
    public HeartBeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }
//de run methode gaat ook een oneindige loop zijn , en het print telkens een heartbeat af
    @Override
    public void run() {
        while (true) {
            System.out.println("Heartbeat");
            try {
                Thread.sleep(milliSecondsBetweenBeats);//wachten seconden tussen heart beats
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();


            }
        }

    }
}
