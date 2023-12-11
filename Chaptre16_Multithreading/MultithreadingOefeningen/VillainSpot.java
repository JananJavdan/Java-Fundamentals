package MultithreadingOefeningen;

import java.util.Random;
//Als je niet genoeg tijd hebt om de bom te ontmantelen, dan ontploft de bom. Anders, heb je die disarmed
public class VillainSpot {
    private int i;
        public static void main(String[] args) {
            Random random = new Random();
            TimeBomb timeBomb = new TimeBomb(10); // Bomb has 10 seconds!
            timeBomb.activate();
            try {
                Thread.sleep(random.nextInt(30000)); // It will take us between 0-30 secs to disarm the bomb.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeBomb.disarm();
        }

}

