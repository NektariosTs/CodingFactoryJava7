package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * metatrepei hmeres , wres , lepta , deuterolepta,
 * se sunolika deuterolepta. o xrhsths dinei ta dedomena
 * kai ektupwnei to teliko apotelesma
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int days;
      int hours;
      int minutes;
      int seconds;
      int totalSeconds = 0;
      final int SECONDS_PER_DAY = 3600 * 24;
      final int SECONDS_PER_HOUR = 60 * 60;
      final int SECONDS_PER_MINUTE = 60;

        System.out.println("please insert Days , hours, minutes, seconds");
        days = scanner.nextInt();
        hours = scanner.nextInt();
        minutes = scanner.nextInt();
        seconds = scanner.nextInt();

       totalSeconds = days * SECONDS_PER_DAY + hours * SECONDS_PER_HOUR + minutes * SECONDS_PER_MINUTE + seconds;

        System.out.printf("days %d, hours %d, minutes %d , seconds %d are: %,d total seconds ", days, hours, minutes, seconds, totalSeconds);


    }
}
