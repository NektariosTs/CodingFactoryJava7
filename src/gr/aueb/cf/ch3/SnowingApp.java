package gr.aueb.cf.ch3;

/*
Snowing if raining AND temp < 0
*/

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;

        int temp = 0;

        System.out.println("please insert if its raining");
        isRaining = scanner.nextBoolean();

        System.out.println("please insert the temprature");
        temp = scanner.nextInt();

        isSnowing = isRaining && temp < 0;

        System.out.println("is Snowing: " + isSnowing);
    }
}
