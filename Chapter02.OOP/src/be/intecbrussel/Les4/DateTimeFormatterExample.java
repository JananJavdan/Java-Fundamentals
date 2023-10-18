package be.intecbrussel.Les4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample{

    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Befor Formatting: " +now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");

        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);
    }
}

