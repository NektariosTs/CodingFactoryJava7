package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {
    public static void main(String[] args) {

        try (
                PrintStream ps = new PrintStream("C:\\Users\\Nekta\\Desktop\\c# thewria\\file7.txt", StandardCharsets.UTF_8)) {
            printMessage(ps, "Hello coding factory");
            printMessage(System.out, "Hello CF!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * genikh printstream methodos
     *
     * @param ps      the input PrintSTream
     * @param message the input message
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
