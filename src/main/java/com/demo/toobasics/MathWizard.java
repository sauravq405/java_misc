package com.demo.toobasics;

public class MathWizard {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = Math.max(a, b);
        int min = Math.min(a,b);
        int c = -11;
        int abs = Math.abs(c);
        double d = 1.12;
        System.out.println("Math.ceil(d): "+Math.ceil(d));//ceil() -> closest integer greater than d
        System.out.println("Math.floor(d): "+Math.floor(d));//floor() -> closest integer lesser than d
        System.out.println("Math.round(d): "+Math.round(d));//round() -> closest integer to d
        d = 1.52;
        System.out.println("Math.round(d): "+Math.round(d));//round() -> closest integer to d
        int e = 144;
        System.out.println("Math.sqrt(e): "+Math.sqrt(e));
        System.out.println("Math.pow(10,2.1): "+Math.pow(10,2.1));
        System.out.println("Math.log(e): "+Math.log(e));
        System.out.println("Math.log10(e): "+Math.log10(e));
        System.out.println("Math.sin(30): "+Math.sin(30)); //trigonometric methods
        System.out.println("Math.cos(30): "+Math.cos(30));
        System.out.println("Math.tan(30): "+Math.tan(30));
        System.out.println("Math.PI: "+Math.PI);
        System.out.println("Math.random(): "+((int) (Math.random()*11)));
        System.out.println("Math.nextAfter(1, 2): "+Math.nextAfter(1, 2)); //returns a float number between 1 & 2
        System.out.println("Math.nextAfter(1, 0): "+Math.nextAfter(1, 0)); //returns a float number between 1 & 0


    }
}
