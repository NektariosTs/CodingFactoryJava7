package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
 * upologizei to athroisma 2 akeraiwn
 * me thn xrhsh methodwn
 * */
public class AddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please enter two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = add(num1, num2);
        sub = sub(num1, num2);

        System.out.println(sum);
        System.out.println(sub);
    }

    /*
     * adds two integers
     * param @a the first integer
     * param @b the second integer
     * return the sum of two integers.
     * */
    public static int add(int a, int b) {
//        int result = 0;
//
//        result = a + b;
//
//        return result;

        return a + b;//panta prepei na epistrefei kati mia methodos.autos einai pio kalos tropos
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
