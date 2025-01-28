package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * lambanei mia thermokrasia apo ton xrhsth
 * kai emfanizei katallhlo mhnuma
 */

public class TempApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowToZero;
        System.out.println("please insert the current temp");
        temp = scanner.nextInt();

        isTempBelowToZero = temp < 0;

        System.out.println("h thermokrasia einai katw apo to 0: " + isTempBelowToZero);
    }
}
