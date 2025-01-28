package gr.aueb.cf.ch4;

public class PowerApp {

    public static void main(String[] args) {
        int base = 2;
        int power = 10;
        int result = 1;

        //for to calculate base ^ power

        for (int i = 1; i <= power ; i++) {
            result = result * base; //result *= base;
        }

        System.out.println("Result: " + result);
    }
}
