package it.develhope.dateTime2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-YY HH:mm");
        System.out.println("Today's date: " + today.format(f1));

        ZonedDateTime zonedToday = ZonedDateTime.now();
        System.out.println("Today's date in ISO: " + zonedToday.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

    }
}
