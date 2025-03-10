package com.demo.toobasics;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // values stored in heap (new operator is used)
        //address of each cell in array is stored in stack
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 24;
        arr[3] = 32;
        for (int i = 0; i < arr.length ; i++){
           // System.out.println(arr[i]);
        }
        for (int i : arr){
            //System.out.println(i);
        }

        arr = new int[] {12, -156, 345, 65, 23, 87};

        //search a number 65 in an array
        boolean found = false;
        for (int e : arr){
            if (e == 65) {
                System.out.println("found");
                found = true;
            }
        }
        if(!found)
            System.out.println("not found");

        //find maximum number
        int max = Integer.MIN_VALUE; //could be 0 also, but in order to handle negative numbers, max number initialized to MIN_VALUE (negative infinity).
        for(int e : arr){
            if ( e > max ){
                max = e;
            }
        }
        System.out.println(max);

        //reverse print array
        for(int i = arr.length - 1 ; i >= 0; i--){
            System.out.println("rev print -> "+arr[i]);
        }

        //sum of an array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);


    }
}
