package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigIntiger class demo
 */
public class BigIntApp {

    public static void main(String[] args) {

        //prwta dhlwseis Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("123456789987654321");
        BigInteger bigNum2 = new BigInteger("234123789655555588");
        BigInteger result;

        //Commands entoles
        result = bigNum1.add(bigNum2);

        //Printing the results
        System.out.printf("%,d", result);

    }
}
