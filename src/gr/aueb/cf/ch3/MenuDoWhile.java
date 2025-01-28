package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
 * Show a menu at least one
 * h while prepei na ektelestei TOULAXISTON MIA fora
 * */
public class MenuDoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("please select one of the following: ");
            System.out.println("1. insert");
            System.out.println("2. Delete");
            System.out.println("3. Quit");
            choice = in.nextInt();

        }while (choice != 3);

        System.out.println("thanks for using the menu app");
    }
}
