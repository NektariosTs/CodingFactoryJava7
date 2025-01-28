package gr.aueb.cf.ch3;

/*
* Turn lights on,if it is raining AND car is running (>100) OR is dark.
*/

import java.util.Scanner;

public class LightsOn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        boolean isLightsOn;
        int speedCar = 0;

        System.out.println("please insert if its Raining");
        isRaining = in.nextBoolean();

        System.out.println("please insert the speed of the car");
        speedCar = in.nextInt();

//        System.out.println("please insert if its running");
//        isRunning = in.nextBoolean();

        System.out.println("please insert if its Dark");
        isDark = in.nextBoolean();




        isRunning = speedCar > 100;
        isLightsOn = isRaining && (isRunning || isDark);

        System.out.println("is lights on when: " + isLightsOn);
    }
}

//        System.out.println("please insert km");
//        km = in.nextInt();
//
//        System.out.println("please insert if its raining");
//        isRaining = in.nextBoolean();
//
//        System.out.println("please insert if its dark");
//        isDark = in.nextBoolean();
//
//        lightsOn = isRaining && km > 100 || isDark;
//
//        System.out.println("lights turnign on: " + lightsOn);
