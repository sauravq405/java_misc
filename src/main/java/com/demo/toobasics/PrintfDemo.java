package com.demo.toobasics;

import java.util.Arrays;
import java.util.Locale;

public class PrintfDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String c = "Sum";
        System.out.println(c + " of " + a + " and " + b + " is " + (a + b));
        System.out.print(c + " of " + a + " and " + b + " is " + (a + b) + "\n");
        System.out.printf(c + " of " + a + " and " + b + " is " + (a + b) + "\n");
        System.out.printf(c + " of " + a + " and " + b + " is " + (a + b));
        //Alternatively you can use
        System.out.println("=====ALTERNATIVELY=====");
        //System.out.printf("sum of a and b is expression"); //alternatively write using format specifier
        System.out.printf("%s of %d and %d is %d %n", c, a, b, a + b); //%n is added at the end for new line.
        //%n is platform independent and is recommended for usage.
        char ch = 'a';
        float fl = 1.82f;
        System.out.printf("Character value is %c, float value is %f%n", ch, fl);
        //if you want to restrict no of digits after decimal use %0.nf
        System.out.printf("Character value is %c, float value is %.1f %n", ch, fl);
        System.out.printf("Character value is %c, float value is %.2f %n", ch, fl);
        float e = 6.7f;
        System.out.printf("float value is %e %n", e);

        double d = 123765.489;

        System.out.printf("Default local: %,.2f %n", d);
        System.out.printf(Locale.US, "US locale: %f %n", d);
        System.out.printf(Locale.FRANCE, "FRANCE locale: %f %n", d);
        System.out.printf(Locale.GERMANY, "GERMANY locale: %f %n", d);

    }
}
