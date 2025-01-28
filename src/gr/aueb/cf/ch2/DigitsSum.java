package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * na lambanei ws input apo ton xrhsth ena dhpsifio akeraio
 * kai na ektupwnei to athroisma twn psifiwn tou.
 * gia paradeigma an o xrhsths dwsei ton arithmo 15 , tha prepei
 * to apotemesma na einai 1 + 5 = 6
 */
public class DigitsSum {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int number;
     int leftDigit = 0;
     int rightDigit = 0;
     int sumDigits = 0;

        System.out.println("please insert a number");
        number = scanner.nextInt();
        leftDigit = number / 10;// me div 10 pairnoume to aristero pshfio
        rightDigit = number % 10;//me mod 10 pairnoume to deksi pshfio
        sumDigits = leftDigit + rightDigit;

        System.out.printf("leftdigit is: %d, and rightdigit is: %d, so the total number is: %d",leftDigit, rightDigit, sumDigits);



    }
}
