package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * dikaiwma psifou se hlikies > 18
 * elegxei an mia hlikia exei dikaiwma na psifisei
 * */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AGE_VOTE = 18;
        int age = 0;
        boolean isVoteEligible = false;

        System.out.println("please insert your age");
        age = scanner.nextInt();

        isVoteEligible = age >= AGE_VOTE;

        System.out.println("you can vote: "+ isVoteEligible);
    }
}
