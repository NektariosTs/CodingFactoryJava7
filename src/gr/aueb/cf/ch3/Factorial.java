package gr.aueb.cf.ch3;

import java.util.Scanner;
/*
 * calculate n
 * */

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     int inputNum = 0;
     int factorial = 1;
     int i = 1;

        System.out.println("please insert an input num");
        inputNum = in.nextInt();

        while (i <= inputNum) {
            factorial *= i;
            i++;
            System.out.println(factorial);
        }

    }
}

