package gr.aueb.cf.ch6;


/**
 * demo me arrays se methodous
 */
public class ArraysInMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);

        printArray(arr, 0, arr.length - 1);
        printArray(arr, 1, 4);
    }

    public static void printArray(int[] arr) {
        //otan den theloume to index einai pio grhgoros tropos
        for (int el : arr) {
            System.out.println(el + " ");
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    /**
     * Overloaded version of print array.
     * Prints the element of array from low to high.
     *
     * @param arr  the input array
     * @param low  the start index
     * @param high the end index
     */

    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length - 1) {
            return;
        }

        for (int i = low; i <= high; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
