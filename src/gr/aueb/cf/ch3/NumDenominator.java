package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denomirator = 0;
        int result = 0;

        while (true) {
            System.out.println("please insert numerator (Quit with numerator = 0)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero.Quiting...");
                break;
            }

            System.out.println("please insert denominator");
            denomirator = scanner.nextInt();

            if (denomirator == 0) {
                System.out.println("Denominator must not be zero.");
                continue;
            }

            result = numerator / denomirator;
            System.out.println("Result " + result);
        }
    }
}
