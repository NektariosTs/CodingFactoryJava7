package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * ypologizei to athroisma twn pshfiwn enos
 * akeraiou.Gia paradeigma to athroisma twn pshfiwn tou 123 einai 6.
 */
public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int sum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("please insert the number;");
        inputNumber = scanner.nextInt();

        tempNum = inputNumber;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit; //sum = sum + rightDigit
            tempNum /= 10;     //temNum = tempNum / 10;
            System.out.println(sum);
        }

        System.out.println("The sum of digits of " + inputNumber + " is " + sum);
    }
}
