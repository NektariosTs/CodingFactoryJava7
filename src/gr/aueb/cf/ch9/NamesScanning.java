package gr.aueb.cf.ch9;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * diavazei apo ena arxeio dedomena
 */
public class NamesScanning {


    public static void main(String[] args) {
        String inFilePath = "C:\\Users\\Nekta\\Desktop\\c# thewria\\names.txt";
        String outFilePath = "C:\\Users\\Nekta\\Desktop\\c# thewria\\names-formatted.txt";
        String line;
        String[] tokens;
              try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
                   PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {
                  while ((line = reader.readLine()) != null) {
                      tokens = line.split(",+\\s*");
//                      ps.printf()
                  }


              }catch (IOException e) {
                  System.err.println(e.getMessage());
              }


    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
//        ps.printf() // to path leipei
    }
}
