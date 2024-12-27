import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertingDates {
    public static void main(String[] args) {
        // Converting Global date to Local date
        // Global date + timezone = local date
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.parse("2022-10-18T01:20:33Z");

        // Converts Instant to LocalDate specifying timezone
        LocalDate r1 = LocalDate.ofInstant(date3, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(date3, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);

        // We can also pick individual values from LOCAL dates, like month, year or day
        // Or even hours, minutes and seconds
        System.out.printf("Day: %d, Month: %d, Year: %d\n", date2.getDayOfMonth(), date2.getMonthValue(), date2.getYear());
        System.out.printf("NOW : Hour - %d | Minute: %d | Second - %d\n ", date2.getHour(), date2.getMinute(), date2.getSecond());
    }
}
