package com.demo.toobasics;

public class StringDemo {
    public static void main(String[] args) {
        String a = new String("hi");
        String b = "hi";
        String c = "hi";
        if(b == c) System.out.println(true);
        if(b.equals(c)) System.out.println(true);

        String x = "Hi";
        String x1 = new String(x);
        String x2 = new String(x);

        boolean result = x1 == x2;
        System.out.println("Result x: "+result);

        //a, x1, x2 will be stored in heap (memory location assigned to jvm by the os).
        //b, c , x will be stored in string pool


    }
}
