package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xrhsths tha dinei:
 * 1.tous sunolikous vathmous mathimatwn
 * 2.to plithos twn mathimatwn
 * <p>
 * tha upologizei ton meso oro kai tha xaraktirizei
 * "arista" an o mesos oros einai >=9,
 * "polu kala" an o mesos oros einai >= 7,
 * "kalws" an o mesos oros einai >=5
 * "apotuxia" an o mesos oros einai < 5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("total marks must not be 0");
            System.exit(1);// vgainei ap to if statment mono to 0 paei na pei oti einai ola kala.
        }

        System.out.println("please insert courses count");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("error.the average must be less or equal than 10");
            System.exit(1);

            if (average >= 9) {
                System.out.println("Excellent");
            } else if (average >= 7) {
                System.out.println("Very good");
            } else if (average >= 5) {
                System.out.println("Good");
            } else {
                System.out.println("Failure");
            }
        }
    }
}
