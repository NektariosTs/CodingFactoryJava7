package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {12, 123, 34, 14, 55, 55, 55, 11, 1, 2};

    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {


            //find min
            int minPosition = i;
            int minValue = arr[minPosition];

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }

            //Swap(minPos, i)
            swap(arr, minPosition, i);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temporary = arr[i];
        arr[i] = arr[j];
        arr[j] = temporary;
    }
}
