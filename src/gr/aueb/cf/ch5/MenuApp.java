package gr.aueb.cf.ch5;

/*
emfanizei ena menou epilogwn kai o xrhsths
epilegei ena menu item kai sthn sunexeia analoga me
thn epilogh ekteleitai kapoia energeia.
 */

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid.");
                continue;
            }

            doOnChoice(choice);

        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Epileksete ena apo ta parakatw: ");
        System.out.println("1.eisagwgh");
        System.out.println("2.diagrafh");
        System.out.println("3.anazhthsh");
        System.out.println("4.enhmerwsh");
        System.out.println("5.eksodos");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("eisagwgh");
                break;
            case 2:
                System.out.println("diagrafh");
                break;
            case 3:
                System.out.println("anazhthsh");
                break;
            case 4:
                System.out.println("enhmerwsh");
                break;
            case 5:
                System.out.println("eksodos");
                break;
            default:
                System.out.println("lathos epilogh");
                break;
        }
    }
}
