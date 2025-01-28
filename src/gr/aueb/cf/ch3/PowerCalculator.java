package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ypologizei to a sto power
 */
public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1 ;
        int result = 1;

        System.out.println("insert the base");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;

            System.out.println(result);
        }
        System.out.println("result is: " + result);

        }
    }

