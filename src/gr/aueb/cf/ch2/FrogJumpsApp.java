package gr.aueb.cf.ch2;

import java.sql.SQLOutput;

/**
 * X = 10
 * Y = 85
 * D = 30
 * <p>
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        //calculate jumps
        jumps = (int) Math.ceil( (target - start) /(double) hop);//kanoume to hop double. alla otan kanoume se mia parastash typecast
        //to ena double automata ola ginontai double

        System.out.println("jumps is: " + jumps);
        
    }
}
