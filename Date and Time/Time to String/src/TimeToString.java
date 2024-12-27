import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeToString {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Creates a formatter that uses the system's default timezone for using Global dates
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate date1 = LocalDate.parse("2024-12-13");
        LocalDateTime date2 = LocalDateTime.parse("2024-12-13T21:12:13");
        Instant date3 = Instant.parse("2024-12-13T21:12:13Z"); // Instant date type needs to specify time zone on formatting

        // The .format() method allows the exhibition of the date using a previously created
        // date format instead of ISO 8605
        System.out.println("Date 1 = " + date1.format(fmt1));
        System.out.println("Date 2 = " + date2.format(fmt2));
        System.out.println("Date 3 = " + fmt3.format(date3)); // Instant dates needs to be formatted like this and specify timezone
    }
}
