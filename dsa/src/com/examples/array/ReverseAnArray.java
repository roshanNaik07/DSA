package com.examples.array;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] reversedArray = reverseAnArray(array);
        System.out.println("given array is    : " + Arrays.toString(array));
        System.out.println("Reverse array is : " + Arrays.toString(reversedArray));
    }

    static int[] reverseAnArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int temp = array[startIndex];
            reversedArray[startIndex] = array[endIndex];
            reversedArray[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        return reversedArray;
    }

}
