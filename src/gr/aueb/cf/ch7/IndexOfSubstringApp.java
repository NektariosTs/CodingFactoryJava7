package gr.aueb.cf.ch7;


public class IndexOfSubstringApp {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");// einai to 1 sta indexes
        int positionOfSecondo = cf.indexOf("o", 2);//psaxnei META apo to index pou tou orizoume
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring((0)); //"Coding Factory"
//        String cf2 = cf.substring((1)); //"oding Factory"
       String slice = cf.substring(1, 3); //od

    }
}
