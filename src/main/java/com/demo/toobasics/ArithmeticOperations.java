package com.demo.toobasics;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        byte c = 1;

        //c = c + a; // compilation error because explicit results in an int, which can't be stored in a byte
        c += a; //no error because, compound assignment does implicit casting or widening operation
        System.out.println("c: "+c);

        int res1 = a / b * 2; // / and * have same precedence so it's left to right
        int res2 = 2 * a / b;

        System.out.println("res1 = "+res1);
        System.out.println("res2 = "+res2);

        //Always remember increment/decrement operations have the highest precedence, even higher than / or % or *
        // precedence means enclosing that expression with in (). execution will be left to right

        a = 1;
        b = a++; //post increment --> use first, increment later
        System.out.println("input post increment example -- a = "+a);
        System.out.println("1. post increment example -- b = "+b);

        a = 1;
        b = a++ + a; //post increment --> use first, increment later
        System.out.println("2. post increment example -- b = "+b);

        a = 1;
        b = ++a + a; //pre increment --> increment first, use later
        System.out.println("3. pre increment example -- b = "+b);

        a = 1;
        b = ++a + a; //pre increment --> increment first, use later
        System.out.println("4. pre increment example -- b = "+b);

        a = 1;
        b = a + ++a; //pre increment --> increment first, use later
        System.out.println("5. pre increment example -- b = "+b);

        a = 1; // pre post mix
        System.out.println("6. pre-post mix = " + (a++ + --a));

        double x = 1.5, y = 2.5, z = 3.5;
        double complexCalculation = (x + y) * (y - z) / (x + z); //precedence -> brackets first and then left to right
        System.out.println("complexCalculation = "+complexCalculation);



    }
}
