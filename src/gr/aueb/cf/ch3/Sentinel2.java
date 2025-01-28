package gr.aueb.cf.ch3;

/**
 * edw vazoume to scnanner next.Int mesa sthn sunthikh ths loupas gia na mhn to epanalamvanoume.
 * opote mesa sto while oso to inputnumber pou vazoume einai thetiko tha sunexizei,
 * otan stamathsoun oi thetikoi tote mpainei sthn sunthikh false kai mhdenizei.
 */

import java.util.Scanner;

public class Sentinel2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int positivesCount = 0;
        int inputNum = 0;


        System.out.println("please insert the input number");

        while ((inputNum = scanner.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("please insert the input number");


        }
        System.out.println("positives count: " + positivesCount);
    }
}
