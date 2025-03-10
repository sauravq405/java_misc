package com.demo.toobasics;

public class LoopFundamentals {

    public static void main(String[] args) {
        boolean condition = false;
        while(condition){
            System.out.println("As long as the variable 'condition' is true, the loop keeps printing");
        }
        int i = 0;
        while(i < 10){
            System.out.println("Hello world - " + i);
            i = i + 1;
        }
        i = 0;
        while (i < 50){
            System.out.println(i);
            i++;
        }

        //do while loop
        i = 100;
        do{
            System.out.println(i);
            i++;
        } while (i <= 50);
        // ideally in a normal while loop nothing should be printed because with i = 100,
        // the condition i <= 50 used with while loop is violating,
        // since it's a do while loop so at least once it would printed.

        /*
        for(initialization; condition; update){
            System.out.println(hi);
        }
        */

        /*
        print:
        1
        10
        100
        1000
        10000
        100000
        */
        //printMultiplesOf10();
        printMultiplesOf10Alt();



    }

    private static void printMultiplesOf10() {
        for (int i = 1; i <= 100000; i = i*10){
            System.out.println(i);
        }
    }

    private static void printMultiplesOf10Alt() {
        for (int i = 1, j = 1; j <= 6; i = i*10, j++){
            System.out.println(i);
        }
    }
}
