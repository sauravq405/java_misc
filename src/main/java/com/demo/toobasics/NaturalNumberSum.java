package com.demo.toobasics;

public class NaturalNumberSum {

    public static void main(String[] args) {
        //ALWAYS remember, the kind of tasks we can achieve using loops
        //can be achieved using recursion

        //For n=5, think like 5 + 4 + 3 + 2 + 1, sum of first five natural numbers
        // this is same as
        // mathematically, sum of first 5 natural numbers = 5 + sum of first 4 natural numbers

        System.out.println("Sum = " + sum(1));



    }

    private static int sum(int n) {
        if (n == 0) //base case
            return 0;

        return n + sum(n-1);
    }
}
