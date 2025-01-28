package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * upologizei to athroisma twn artiwn apo to 2
 * mexri ena orio pou dinei o xrhsths
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        int inputNumber = 0;
        int sum = 0;

        System.out.println("insert the number limit");
        inputNumber = scanner.nextInt();

        while (i <= inputNumber) {
            sum += i;
            i += 2;
        }
        System.out.println("the sum of even numbers up to " + inputNumber + " is: " + sum);
    }
}
