package ro.sda.fundamentals._5_arrays;

import java.util.Arrays;

/*
Write a method called reverse() with an int array as a parameter.
The method should not return any value. In other words, the method
is allowed to modify the array parameter.

In main() test the reverse() method and print the array both reversed
and non-reversed.

To reverse the array, you have to swap the elements, so that the first element is
swapped with the last element and son on.

For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
*/
public class ReverseArray {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
        int[] myNewArray = reverseSimpleApproach(myArray);
        System.out.println("Original array before reverse:" + Arrays.toString(myArray));
        System.out.println("Reversed array:" + Arrays.toString(myNewArray));
        int[] myArray2 = {15, 25, 35, 49, 99};
        reverse(myArray2);
        System.out.println("Original array after reverse:" + Arrays.toString(myArray2));

    }

    public static int[] reverseSimpleApproach(int[] input) {
        int[] reversed = new int[input.length];
        int reversedIdx = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            reversed[reversedIdx] = input[i];
            reversedIdx++;

        }
        return reversed;
    }

    // [15, 25, 35, 49, 9]
    //
    public static void reverse(int[] input) {

        int maxIdx = input.length - 1;
        int halfIdx = input.length / 2;
        for (int i = 0; i < halfIdx; i++) {
            int temp = input[i];
            input[i] = input[maxIdx - i];
            input[maxIdx-i] = temp;

        }
    }

}
