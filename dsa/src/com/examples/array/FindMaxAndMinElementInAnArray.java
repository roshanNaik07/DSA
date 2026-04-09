package com.examples.array;

public class FindMaxAndMinElementInAnArray {

    public static void main(String[] args) {

        int[] values = {9, 4, 3, 6, 8, 3, 10, 2, 11,1,13};

        int maxElement = getMaxElementInAnArray(values);

        int minElement = getMinElementInAnArray(values);

        System.out.println("The maximum element in an array is : " + maxElement);
        System.out.println("The minimum element in an array is : " + minElement);
    }

    static int getMinElementInAnArray(int[] values) {
        int minElement = values[0];

        for (int value : values){
            if(value<=minElement){
                minElement = value;
            }
        }

        return minElement;
    }


    static int getMaxElementInAnArray(int[] values) {
        int maxElement = 0;

        for (int value : values) {
            if (value >= maxElement) {
                maxElement = value;
            } else {
                continue;
            }
        }
        return maxElement;
    }

}
