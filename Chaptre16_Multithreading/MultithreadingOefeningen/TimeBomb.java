package MultithreadingOefeningen;
//Maak een klasse TimeBomb die je gaat gebruiken in onderstaande toepassing
public class TimeBomb extends Thread {
    int countdownSeconds = 0;

    public TimeBomb(int countdownSeconds) {
        this.countdownSeconds = countdownSeconds;
    }

    public static void activate() {
        System.out.println("Bomb activated! Countdown started.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void disarm() {
        System.out.println("Bomb disarmed");


    }
}