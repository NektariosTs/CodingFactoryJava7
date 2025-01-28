package gr.aueb.cf.ch2;

/*
 * scanner demo .reads two integers from the
 * std input(keyboard) and calculates the result.
 * */

import java.util.Scanner;

public class ScannerAddApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("please insert two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.printf("to athroisma twn %d kai twn %d einai iso me to %d ", num1, num2, sum);
    }
}
