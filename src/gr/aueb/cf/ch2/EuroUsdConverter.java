package gr.aueb.cf.ch2;

/*
 * metatroph apo eurw se dolaria
 */

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        System.out.println("please insert a euro");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d usa dollars , %d usa cents\n", inputEuros, usaDollars, usaCents);

        System.out.printf("%d , %d , %d", totalUsaCents, usaDollars, usaCents);


    }
}
