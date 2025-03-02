package com.demo.toobasics;

public class BitwiseOperations {
    public static void main(String[] args) {
        //computers -> 0 or 1
        int value = 5;
        System.out.println(Integer.toBinaryString(value));

        //int -> 4 Bytes = 4 * (8 Bits) or (8 binary digits)
        //00000000 00000000 00000000 00000101

        //bitwise operations can only be applied on certain primitive datatypes:
        //operands -> byte, short, int, long
        /*
        operators:

        and, &
        or, |
        xor, ^
        not, ~
        left shift, <<
        right shift, >>
        unsigned right shift >>>

        Assume & is like multiplication, | is like addition , also remember the learning:
        1, 10, 11, 100, 101, 110, 111, 1000....

        ^ -> IF TWO BITS ARE DIFFERENT, RESULT IS ZERO

         */
        int a = 5, b = 4;
        System.out.println("a & b  = " + (a & b));
        System.out.println("a | b  = " + (a | b));
        System.out.println("a ^ b  = " + (a ^ b));
        System.out.println("a's binary representation: " + Integer.toBinaryString(a));
        System.out.println("~a's binary representation: " + Integer.toBinaryString(~a));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1)); // left shift one time
        System.out.println("a >> 1 = " + (a >> 1)); // right shift one time
        int c = -5;
        System.out.println("c = " + c);
        System.out.println("c >>> 1 = " + (c >>> 1)); // unsigned right shift one time - it fills left most bits with zeros
        System.out.println("c >> 1 = " + Integer.toBinaryString(c >> 1));
        System.out.println("c >>> 1 = " + Integer.toBinaryString(c >>> 1));



    }
}
