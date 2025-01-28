package gr.aueb.cf.ch3;

/*
 * elegxei an enas akeraios einai artios
 * */

import java.util.Scanner;

public class isEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isEven;

        System.out.println("please insert an number(integer)");
        number = scanner.nextInt();

        isEven = number % 2 == 0;


        System.out.println("is Even: " + isEven);
    }


    }

