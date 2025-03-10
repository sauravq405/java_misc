package com.demo.toobasics;

public class RecursionBeginnerFriendly {
    public static void main(String[] args) {
        System.out.println("Factorial = " + factorialConventional(0));

        //Mathematically 5! = 5 * 4! i.e. n! = n * (n-1)!
        //Above is the principal used in recursion - a method/technique that calls/uses itself

        System.out.println("Factorial recursive-call = " + factorial(0));
    }

    private static int factorialConventional(int n) {
        int result = 1;
        for (int i = n; i >=  1; i--) {
            result *= i;
        }
        return result;
    }

    private static int factorial(int n) {
        if (n == 0) //base case
            return 1;

        return n * factorial(n - 1); //observe how similar it is to Mathematically n! = n * (n-1)!
    }
    //NOTE - Flow explained

    /*
    factorial(5) calls factorial(4)
    factorial(4) calls factorial(3)
    factorial(3) calls factorial(2)
    factorial(2) calls factorial(1)
    factorial(1) calls factorial(0)
    factorial(0) returns 1 -- base case reached (base case is where we STOP)

    factorial(1) returns 1*1 = 1
    factorial(2) returns 2*1 = 2
    factorial(3) returns 3*2*1 = 6
    factorial(4) returns 4*3*2*1 = 24
    factorial(5) returns 5*4*3*2*1 = 120


    Call stack -> It is that part of the memory which tracks method calls

    0)
    main() <-- Bottom of the stack. Placed first.

    1)
    factorial(5)
    main()

    2)
    factorial(4)
    factorial(5)
    main()

    2)
    factorial(3)
    factorial(4)
    factorial(5)
    main()

    3)
    factorial(2)
    factorial(3)
    factorial(4)
    factorial(5)
    main()

    3)
    factorial(1)
    factorial(2)
    factorial(3)
    factorial(4)
    factorial(5)
    main()




     */



}
