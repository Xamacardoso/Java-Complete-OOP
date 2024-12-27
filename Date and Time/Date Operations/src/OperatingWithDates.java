import java.time.*;
import java.time.temporal.ChronoUnit;

public class OperatingWithDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        Instant globalNow = Instant.now();

        // Using plus or minus methods to sum or subtract dates
        LocalDateTime nextWeekTime = localDateTime.plusWeeks(1);
        LocalDate nextWeek = localDate.plusDays(7);

        // Instant date type requires specification of chrono unit
        Instant globalPastWeek = globalNow.minus(7, ChronoUnit.DAYS);

        System.out.println("Next week: " + nextWeek);
        System.out.println("Next week's Time: " + nextWeekTime);
        System.out.println("Global past week: " + LocalDateTime.ofInstant(globalPastWeek, ZoneId.systemDefault()));

        // Duration object that calculates time between two dates
        // It MUST have to be LocalDateTime or Instant, instead, you'll have to convert it to LocalDateTime
        Duration t1 = Duration.between(localDateTime, nextWeekTime);
        System.out.println("Duration between today and next week: " + t1.toDays());

        // atStartOfDay() method parses LocalDate into LocalDateTime, allowing date conversion
        Duration t2 = Duration.between(localDate.atStartOfDay(), nextWeek.atStartOfDay());
        System.out.println("Duration between today and next week without time: " + t2.toDays());

        Duration t3 = Duration.between(globalPastWeek, globalNow);
        System.out.println("Duration between GLOBAL today and past week: " + t3.toDays());
    }
}
