package be.intecbrussel.Les5.Oefening7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Oefening3 {
    public static void main(String[] args) {
        //Gebortedatume
      LocalDate oldDate = LocalDate.of(1986,6,4);
       //De huiudige datume
      LocalDate newDate = LocalDate.now();

        //bereken van de leeftijd
      long years = ChronoUnit.YEARS.between(oldDate,newDate);
      long months = ChronoUnit.MONTHS.between(oldDate,newDate);
      long days = ChronoUnit.DAYS.between(oldDate,newDate);

      System.out.println(years + "years");
      System.out.println(months + "months");
      System.out.println(days + "days");

    }
}
