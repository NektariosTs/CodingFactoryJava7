package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * calculates the price with vat
 */
public class PriceWithVat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inputPrice = 0;
        final double VAT_RATE = 0.24;
        double totalPrice = 0;
        double vat = 0;

        System.out.println("please insert inputPrice");
        inputPrice = in.nextDouble();

        vat = inputPrice * VAT_RATE;

        totalPrice = inputPrice * VAT_RATE;

        System.out.println("Price is: " + inputPrice + ", Price with VAT is: " + totalPrice);
    }
}
