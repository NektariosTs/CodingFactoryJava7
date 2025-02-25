package gr.aueb.cf.ch8;


import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {

    }

    /**
     * System.in.read() throws IOException.
     * since a checked exception is thrown, it has to be
     * explicitly to be thrown in method signature.
     * or has to be caught {}
     * When this type of method / exception may be used?
     * when no need to handle the exception.
     * Is this meaningful? NO. ideally, we want to handle the exceptions,
     * not only propagate.
     *
     * @return
     * @throws IOException
     */

    public static char readOneChar() throws IOException {
        return (char) System.in.read(); // throws IOException
    }


    /**
     * ean kanoume catch to exception , den xreiazetai na kanoume throws
     * sthn epikefalida ths methodou.and the exception not propagates.
     * Is it a good practise not to propagate?
     * it depends.If there is a caller, then we have to propagate.
     * if there is a client / user then we do not propagate the
     * exception.
     *
     * @return
     */
    public static char readAnotherChar() {
        try {
            return (char) System.in.read();
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
            return ' ';
        }
    }

    /**
     * In this type of method /exception , we take action -- logging,
     * and also rethrow the exception to propagate to the caller.
     *
     * @return
     * @throws IOException
     */
    public static char readAnotherOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
            throw exception;
        }
    }

    public static char readAgainOneChar(char ch) throws IOException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IllegalArgumentException ex1) {
            ex1.printStackTrace();
            System.err.println(ex1.getMessage());
            throw ex1;
        } catch (IOException ex2) {
            ex2.printStackTrace();
            System.err.println(ex2.getMessage());
            throw ex2;
        }
    }
}
