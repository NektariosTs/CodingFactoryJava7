package gr.aueb.cf.ch6;

public class ArrayHello {

    public static void main(String[] args) {
        int[] arr = new int[10];//declare and init
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse (diasxish tou pinaka kai ektupwsh ths kathe theshs)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
