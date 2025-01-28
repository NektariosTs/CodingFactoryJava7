package gr.aueb.cf.ch17.callbacks;

public class Main4 {

    public static void main(String[] args) {

        doPrint(Main4::sayHelloWorld);//:: einai telesths shmainei scope dhladh anoikei sthn main4 einai deikths kai sumpairenei tis parametrous deksia kai aristera oti den uparxei kamia parametros

        doPrint(Main4::sayHelloCoding);
    }

    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding");
    }
}
