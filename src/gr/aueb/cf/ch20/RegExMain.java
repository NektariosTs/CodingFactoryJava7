package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "Athens  Uni      of         Eco and         Bus";
//        System.out.println(isRed(s));
//        System.out.println(beginsWithOneUpperCaseAndEndsIning(s));
//        System.out.println(whitespaceDigit(s));
//        System.out.println(isEmail(s));
//
//        String[] tokens = doSplit(s);
//        for (String token : tokens) {
//            System.out.print(token);
//        }

        System.out.println(deReplace(s));
    }

    /**
     * elegxei (matches) an to input string einai to red
     *
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * elegxei (matches) an to inout string
     * einai "red" h "green"
     *
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    /**
     * elegxei (matches) an to input string einai
     * "red" h "Red" kai "green" h "Green"
     *
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIning(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean anySympbolDigit(String s) {
        return s.matches(".[0-9]");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String deReplace(String s) {
        return s.replaceAll("\\s+", "&");
    }

    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }
}
