package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * convert miles to km
 * metartoph milia se xiliometra
 */
public class MilesToKm {


    public static void main(String[] args) {
        //dhlwsh arxikopoihshs
        Scanner scanner = new Scanner(System.in);
        double miles = 0.0;
        double km = 0.0;
        final double KM_PER_MILE = 1.6;

        System.out.println("please insert miles");
        miles = scanner.nextDouble();

        km = miles * KM_PER_MILE;

        System.out.printf("Miles is: %s, Km is: %s", miles, km);
        System.out.println("Miles: " + miles + "Km: " + km);

    }
}
