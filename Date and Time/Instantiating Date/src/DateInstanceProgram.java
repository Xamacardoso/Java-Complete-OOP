import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateInstanceProgram {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now(); // Picks system date (local date)
        LocalDateTime date2 = LocalDateTime.now(); // Picks system date and time (hours, minutes and seconds)
        Instant date3 = Instant.now(); // Picks global date, with timezone

        // Parses a string date in the ISO 8601 format
        LocalDate date4 = LocalDate.parse("2024-11-25");
        LocalDateTime date5 = LocalDateTime.parse("2024-11-26T01:30:24");
        Instant date6 = Instant.parse("2024-10-17T04:39:24Z");
        Instant date7 = Instant.parse("2024-10-17T04:39:24+05:00");

        // Creates a date format based in a VALID string
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Instantiates a date object (it will be in the ISO format) using my own formatting
        LocalDate date8 = LocalDate.parse("24/10/2023", fmt1);
        LocalDateTime date9 = LocalDateTime.parse("11/12/2024 12:30:23", fmt2);

        // Instantiates a date object based in single numbers as parameters using LocalDate.of()
        LocalDate date10 = LocalDate.of(2024, 12,3);
        LocalDateTime date11 = LocalDateTime.of(2024, 12,3,2,30,12);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Date 3: " + date3);
        System.out.println("-----------------");
        System.out.println("Date 4: " + date4);
        System.out.println("Date 5: " + date5);
        System.out.println("Date 6: " + date6);
        System.out.println("Date 7: " + date7);
        System.out.println("-----------------");
        System.out.println("Date 8: " + date8);
        System.out.println("Date 9: " + date9);
        System.out.println("-----------------");
        System.out.println("Date 10: " + date10);
        System.out.println("Date 11: " + date11);


    }
}
