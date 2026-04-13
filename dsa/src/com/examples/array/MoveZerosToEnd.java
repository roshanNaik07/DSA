package com.examples.array;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] array = {0, 1, 0, 8, 5, 0, 2};

        int[] newArray = moveZerosToEnd(array);
        System.out.println("New Array is : " + Arrays.toString(newArray));

    }

    static int[] moveZerosToEnd(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                int temp = array[i];
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    System.out.println(Arrays.toString(array));
                }
                array[array.length - 1] = temp;
            }
        }

        return array;
    }


}
