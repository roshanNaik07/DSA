package com.examples.array;

import java.util.Arrays;

public class MissingElementInAnArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 6};
        getMissingElementInAnArray(array);
    }

    static int getMissingElementInAnArray(int[] array) {
        int missingValue = 0;
        int n = array[array.length - 1];
        int expectedSum = (n * (n + 1)) / 2;
        int sumOfArrayElements = 0;
        int[] newArray = new int[array.length + 1];


        for (int num : array) {
            sumOfArrayElements += num;
        }

        missingValue = expectedSum - sumOfArrayElements;
        System.out.println("Missing number is : " + missingValue);

        for (int i = 0; i <= array.length; i++) {
            if (missingValue < array[i]) {
                newArray[i] = missingValue;
                newArray[i + 1] = array[i];
                i++;
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println("New array will be : " + Arrays.toString(newArray));
        return missingValue;
    }

}
