package com.examples.array;

import java.util.Arrays;

public class CopyArrayElements {

    public static void main(String[] args) {

        String[] names = {"Roshan","Ketan","Manoj","Shantanu","Abhishek","Yashas","Sanat","Shiv"};

        String[] selectedNames = new String[5];

        System.arraycopy(names,2,selectedNames,0,3);
        System.out.println(Arrays.toString(selectedNames));

        System.arraycopy(names,3,selectedNames,0,5);
        System.out.println(Arrays.toString(selectedNames));
    }

}
