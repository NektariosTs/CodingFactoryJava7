package gr.aueb.cf.ch6;

/**
 * copies the refernce of the array
 * it is shalow copy.There are side effects
 */
public class ArrayReferenceCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr; //shallow copy


        for (int el : arrRefCopy) {
            System.out.println(el + " ");
        }

        arrRefCopy[4] = 100;

        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
