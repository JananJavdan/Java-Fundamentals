package be.intecbrussel.Les5.Oefening7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oefening2 {
    public static void main(String[] args) {

        //tijd en datum te formatteren

        LocalDateTime now = LocalDateTime.now();
        System.out.println("BeforeFormatting: " + now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("E,MMM dd YYYY");

        String formatDateTime = now.format(format);
        System.out.println("AfterFormatting: " + formatDateTime);

    }
}
