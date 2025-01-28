package gr.aueb.cf.ch2;

/*
 * emfanizei tous tupous dedomenwn akeraiwn,
 * int , byte , short , long mazi me to megeths tous,
 * kai to range (min , max)
 */

public class IntApp {

    public static void main(String[] args) {
        System.out.printf("Int. Size: %d bits, min: %,d, max: %,d\n", Integer.BYTES * 8,Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d bits, min: %d, max: %d\n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short. Size: %d bits, min: %,d, max: %,d\n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Size: %d bits, min: %,d, max: %,d\n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
