package com.examples.array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElementInAnArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 5, 8, 11, 12};

        System.out.println("Enter a number to delete in an Array : " + Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        int deleteElement = sc.nextInt();

        int[] newArray = deleteAnElementInAnArray(array, deleteElement);
        System.out.println("After deleting " + deleteElement + " Array  is : " + Arrays.toString(newArray));
    }

    static int[] deleteAnElementInAnArray(int[] array, int deleteElement) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement) {
                for (int j = i; j < array.length; j++) {
                    if (j + 1 < array.length) {
                        array[j] = array[j + 1];
                    }
                }
                size++;
            }
        }

        int[] newArray = new int[array.length - size];

        for (int i = 0; i < array.length - size; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

}
