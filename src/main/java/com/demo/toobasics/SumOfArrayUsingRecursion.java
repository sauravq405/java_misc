package com.demo.toobasics;

import java.util.Arrays;

public class SumOfArrayUsingRecursion {

    private static int length;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int length = arr.length - 1; //actual length
        System.out.println("Sum of elements: "+sum(arr, length));
    }

    private static int sum(int[] arr, int length) {
        // Base case: If length is 0, return the first element
        if (length == 0) {
            return arr[0];
        }
        return arr[length] + sum(arr, length-1); // actual length is reduced by 1
    }

}
