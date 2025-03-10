package com.demo.toobasics;

public class TwoDArraysDemo {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // 2D Array with 3 rows and three columns
        //2D arrays also called matrix, array of arrays
        int[][] nums = {
                {1, 2, 3},  // <-- nums[0]
                {4, 5, 6},  // <-- nums[1]
                {7, 8, 9}   // <-- nums[2]
        };
        System.out.println("nums[2nd row, 3rd column] : " + nums[1][2]);
        // nums[1][2] --> both row and column index start from 0

        //print full 2D array
        for (int i = 0; i < nums.length; i++) { //rows
            for (int j = 0; j < nums.length; j++) { //columns
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        char[][] charr= new char[3][2];

        charr[0][0] = 'a';
        charr[0][1] = 'b';
        charr[1][0] = 'c';
        charr[1][1] = 'd';
        charr[2][0] = 'e';
        charr[2][1] = 'f';

        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[i].length; j++) { //char.length changed to charr[i] (length of each array in array of arrays
                System.out.print(charr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
