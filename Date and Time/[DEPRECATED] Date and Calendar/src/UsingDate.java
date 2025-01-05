import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class UsingDate {
    public static void main(String[] args) throws ParseException {
        /* Date is a special type in Java that represents time.
        * It stores how many milliseconds have been passed since 1970-01-01T00:00:00Z.
        * It's also deprecated since Java 8 due to the creation of LocalDate and Instant */

        // Defines format to convert between Date (not LocalDate) and String
        // Date type, by standard, picks the system's timezone
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // To use another timezone, it'll be needed to set the different timezone
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Converts a string into a Date object from a SimpleDateFormat
        Date y1 = sdf1.parse("25/02/2001");
        Date y2 = sdf2.parse("25/02/2002 13:22:34");

        /* It's also possible to instantiate a Date object from a Instant object
        But it'll be using system's default timezone, so you'll have to convert it
        if you want to use another timezone. */
        Date y3 = Date.from(Instant.parse("2024-11-23T04:56:07Z"));

        // Instantiates a Date object with current time
        Date x1 = new Date(); // or
        Date x2 = new Date(System.currentTimeMillis());


        // In this way, Java will print the date using default pattern
        // Wkd Mon dd HH:mm:ss TMZ yyyy
        System.out.println("Date 1 = " + y1);

        System.out.println("Date 2 = " + sdf2.format(y2)); // We have to use .format() to print in formatted way
        System.out.println("Date 3 (now) = " + sdf2.format(x1));
        System.out.println("Date 4 (now GMT) = " + sdf3.format(x2));
        System.out.println("Date 5 (Instant) = " + sdf2.format(y3));
        System.out.println("Date 6 (Instant GMT) = " + sdf3.format(y3));
    }
}
