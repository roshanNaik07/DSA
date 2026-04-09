package com.examples.array;

public class SumOfTheElementsInAnArray {

    public static void main(String[] args) {

        int[] values = {1,2,3,4,5};
        int sum = findSumOfTheNumbersInAnArray(values);
        System.out.println("The sum is : "+sum);
    }

    static int findSumOfTheNumbersInAnArray(int[] values){
        int sum=0;

        for (int value : values){
            sum += value;
        }

        return sum;
    }


}
