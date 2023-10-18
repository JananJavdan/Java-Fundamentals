package be.intecbrussel.Les4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Month;
public class LocalDateTimeExamplePlus {
    public static void main(String[] args) {

        System.out.println("now:" + LocalDateTime.now());

        System.out.println("Apr 15, 1994, 11:30am:"+ LocalDateTime.of(1994,Month.APRIL, 15, 11, 30));


        System.out.println("now (from Instant); "+ LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));


        System.out.println("6months from now: "+ LocalDateTime.now().minusMonths(6));
    }
}
