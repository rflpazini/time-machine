package timemachine;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rflpazini
 */
public class TimeMachine {
    private static Scanner scanner = new Scanner(System.in);
    private static String congrats;
    private static int minutes;

    public static void main(String[] args) throws InterruptedException,
            InputMismatchException {
        System.out.println(".::Welcome to the Time Machine!::.");

        Calendar today = Calendar.getInstance();
        printDate(today.getTime());

        try {
            System.out.print("How much minutes do you want to travel? ");
            minutes = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number");
            //throw new InputMismatchException("Input is not a number");
        }

        if (minutes > 0 || minutes < 0) {
            Date afterModification = CalendarActions.manipulateDate(today, minutes);
            Thread.sleep(800);
            printDate(afterModification);
        } else {
            System.out.println("You still in the same time...");
        }
    }

    private static void printDate(Date date) {
        int hour = date.getHours();
        if (hour >= 0 && hour < 12) {
            congrats = "Good Morning!";
        } else if (hour >= 12 && hour < 17) {
            congrats = "Good Afternoon!";
        } else if (hour >= 17 && hour < 21) {
            congrats = "Good Evening!";
        } else {
            congrats = "Good night!";
        }
        System.out.println(congrats + " Today is " + CalendarActions.formatDate(date));
    }
}
