package gr.aueb.cf.ch7;

/**
 * pws prosthetoume 2 strings
 */
public class StrConcatApp {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Factory";

        String s3 = s1 + s2; //  + is overloaded
        String s4 = s1.concat(s2);

        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2);//method chaining
    }
}
