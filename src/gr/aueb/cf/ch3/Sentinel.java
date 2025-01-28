package gr.aueb.cf.ch3;

/*
 * Calculate the positvies count
 * */

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivesCount = 0;
        int inputNum = 0;


        System.out.println("please insert the input number");
        inputNum = scanner.nextInt();

        while (inputNum >= 0) {
            positivesCount++;
            System.out.println("please insert the input number");
            inputNum = scanner.nextInt();

        }
        System.out.println("positives count: " + positivesCount);
    }
}
