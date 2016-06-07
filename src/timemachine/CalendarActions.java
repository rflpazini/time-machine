package timemachine;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rflpazini
 */
public class CalendarActions {

    private static final String TAG = CalendarActions.class.getSimpleName();

    public static Date manipulateDate(Calendar calendar, int minutes) {
        System.out.println("Calculating new date...");
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    public static String formatDate(Date day) {
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String date = simpleDate.format(day);
        return date;
    }
}
