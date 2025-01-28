package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * convert years (ages) to days
 * metatroph xronwn se meres
 */

public class YearsToDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = 0;
        final int DAYS_PER_YEAR = 365;
        int ageToDays = 0;

        System.out.println("please insert a age");
        years = scanner.nextInt();

        ageToDays = years * DAYS_PER_YEAR;

        System.out.printf("Age is: %d and days is: %d\n", years, ageToDays);
        System.out.println("Age is years: " + years + ",Age in days: " + ageToDays);

    }
}
