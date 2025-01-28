package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * dinei ws output ton pollaplasiasmo enos akeraiou
 * pou dinei o xrhsths me olous tous akeraious apo 1 - 10
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Enter an intiger");
        num = scanner.nextInt();

        while (i <= 10) {
            System.out.println(num + " * " + i + " = " +(num * i));
            i++;
        }
    }
}
