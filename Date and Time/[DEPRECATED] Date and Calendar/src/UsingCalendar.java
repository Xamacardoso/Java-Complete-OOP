import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class UsingCalendar {
    public static void main(String[] args) {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = Date.from(Instant.parse("2024-11-23T12:30:22Z"));

        // Adding time to a date
        // Calendar object instance
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, 4); // Adds 4 hours to cal's time
        date = cal.getTime(); // Sets the new time into the Date object
        int year = cal.get(Calendar.YEAR);
        int month = 1 + cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        int minutes = cal.get(Calendar.MINUTE);
        int seconds = cal.get(Calendar.SECOND);

        System.out.println(sdf1.format(date));
        System.out.printf("Year: %d\nMonth: %d\nDay: %d\n%d:%d:%d\n",year,month,day,hours,minutes,seconds);
    }
}
