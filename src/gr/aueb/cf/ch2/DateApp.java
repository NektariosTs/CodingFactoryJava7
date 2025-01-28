package gr.aueb.cf.ch2;

public class DateApp {

    public static void main(String[] args) {

        int day = 10;
        int month = 7;
        int year = 2024;

        System.out.println("h hmeromhnia einai: " + day + "/" + month + "/" + year);
        System.out.printf("h hmeromhnia einai: %02d/%02d/%d", day, month, year);//me to 02 mporoume na kanoume format ton kwdika kai ekei pou exei katw apo dhpsifio arithmo thampainei automata to 0

    }
}
