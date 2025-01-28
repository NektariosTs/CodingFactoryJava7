package gr.aueb.cf.ch1;


/*
 * Calculates the sum of two integers
 * and the result is printed at cosnole
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {
        //dhlwsh kai arxikopoihsh metavlhtwn
        int num1 = 5;
        int num2 = 12;
        int result = 0;


        // entoles
        result = num1 + num2;


        // ektupwsh
        System.out.println("To apotelesma einai: " + result);
        System.out.println("To athroisma twn " + num1 + ", " + num2 + " einai iso me: " + result);
        System.out.printf("To athroisma twn %d, %d einai iso me: %d", num1, num2, result);


    }
}
