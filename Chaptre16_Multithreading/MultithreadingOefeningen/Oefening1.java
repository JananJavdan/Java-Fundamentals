package MultithreadingOefeningen;

import java.time.LocalDateTime;
//Maak een applicatie die 10 seconden aftelt. Gebruik hiervoor Thread.sleep() en toon
// ook de huidige tijd aan met LocalDateTime.
public class Oefening1 {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();
        for (int i = 10; i>0; i--){
            System.out.println("Huidige Tijde: "+LocalDateTime.now()+" Aftelen: "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
