package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
 * special froms of while
 * */
public class SpecialWhileTypes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int num;

        while ((num = in.nextInt()) >= 0);

        //den mpainei pote mesa sthn loupa giati to 1 den einai mikrotero iso tou 0
        //opote 0 iterations(epanalhpseis)
        while (i <= 0) {
            System.out.println("Never gets in");
            i++;
        }

        /**
         * den tha mpei mesa . to 1 den einai mikrotero tou 1.opote pali 0 iterations.
         */
        while (i < 1) {
            System.out.println("never gets in");
            i++;
        }

        /**
         * mia fora tha mpei mesa
         */
        while (i <= 1) {
            System.out.println("one time gets in");
            i++;
        }

        /**
         * edw tha trexei gia panta giati einai true.
         * opws eipame gia na stamathsei h loupa prepei na ftasei sthn sunthikh tou false.
         * sthn timh tou false.opote edw tha trexei sunexeia.
         */
        while (true) {
            System.out.println("Eternal loop");
        }
    }
}
