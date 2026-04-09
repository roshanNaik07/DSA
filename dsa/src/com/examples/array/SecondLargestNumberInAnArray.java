package com.examples.array;

public class SecondLargestNumberInAnArray {

    public static void main(String[] args) {

        int[] values = {5, 9, 6, 3, 10, 7, 2, 11, 1};

        int secondLargestNumber = getSecondLargestNumber(values);
        System.out.println(secondLargestNumber);
    }

    static int getSecondLargestNumber(int[] values) {
        int secondLargestNumber = 0;
        int largestNumber = values[0];

        for (int value : values) {
            if (value > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = value;
            }
        }
        return secondLargestNumber;
    }

}
