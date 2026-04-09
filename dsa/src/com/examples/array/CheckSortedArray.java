package com.examples.array;

public class CheckSortedArray {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,6,9,10,11,7};
        boolean result = checkSortedArray(array);
        if (!result){
            System.out.println("Array is not sorted ..");
        }else {
            System.out.println("Array is sorted");
        }
    }

    static boolean checkSortedArray(int[] arr){
        int startingValue = arr[0];
        boolean result = false;

        for (int value : arr){
            if (value >= startingValue){
                startingValue = value;
                result = true;
            }else {
                result = false;
            }
        }

        return result;
    }

}
