package com.examples.array;

import java.util.Arrays;

public class FindDuplicateElementsInAnArray {

    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 1, 3, 7, 9, 5, 8};
        int[] duplicateElements = getDuplicateElementsInAnArray(arr);
        System.out.println(Arrays.toString(duplicateElements));
    }

    static int[] getDuplicateElementsInAnArray(int[] arr) {
        int[] duplicateElements = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateElements[index] = arr[i];
                    index++;
                }
            }
        }
        return duplicateElements;
    }

}
