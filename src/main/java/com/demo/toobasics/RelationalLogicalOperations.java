package com.demo.toobasics;

public class RelationalLogicalOperations {
    public static void main(String[] args) {
        //relational operators
        //logical operators
        //conditional statements
        int a = 1;
        int b = 2;
        boolean c;
        c = a == b;
        c = a != b;
        c = a >= b;
        c = a <= b;
        System.out.println("c = "+c);
        char x = 'a';
        char y = 'z';
        boolean z;
        z = x == y;
        z = x != y;
        z = x >= x;
        z = x <= y;
        System.out.println("x = " + (x + 0)); //ASCII
        System.out.println("y = " + (y + 0)); //ASCII
        System.out.println("z = "+z);
        String str1 = "hi";
        String str2 = "hi";
        String str3 = new String("hi");
        boolean str = str1 == str2;
        str = str1 == str3;
        System.out.println("str = " + str);

        //logical operators
        // && - logical AND
        // || - logical OR
        // ! - logical NOT

        //Assume a hypothetical hiring on a condition
        //Candidate must be of 5 years of experience at least
        //OR
        //Candidate must be from a tier1 city

        String name = "Ram";
        int exp = 3;
        String city = "tier1";

        boolean cond1 = exp >= 5;
        boolean cond2 = "tier1".equals(city);

        System.out.println(cond1 || cond2);

        if (cond1 || cond2){
            System.out.println("Hired");
        }

        //Logical operations are made up of boolean expressions
        //boolean expressions are nothing but relational operators

        System.out.println( !(2 < 3) );

        int dayNumber = 4; // You can change this value to test different inputs

        if (dayNumber == 1) {
            System.out.println("Day 1: Monday");
        }
        else if (dayNumber == 2) {
            System.out.println("Day 2: Tuesday");
        }
        else if (dayNumber == 3) {
            System.out.println("Day 3: Wednesday");
        }
        else if (dayNumber == 4) {
            System.out.println("Day 4: Thursday");
        }
        else if (dayNumber == 5) {
            System.out.println("Day 5: Friday");
        }
        else if (dayNumber == 6) {
            System.out.println("Day 6: Saturday");
        }
        else if (dayNumber == 7) {
            System.out.println("Day 7: Sunday");
        }
        else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        switch (dayNumber) {
            case 1:
                System.out.println("Day 1: Monday");
                break;
            case 2:
                System.out.println("Day 2: Tuesday");
                break;
            case 3:
                System.out.println("Day 3: Wednesday");
                break;
            case 4:
                System.out.println("Day 4: Thursday");
                break;
            case 5:
                System.out.println("Day 5: Friday");
                break;
            case 6:
                System.out.println("Day 6: Saturday");
                break;
            case 7:
                System.out.println("Day 7: Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }

        //java 17
        String result = switch (dayNumber) {
            case 1 -> "Day 1: Monday";
            case 2 -> "Day 2: Tuesday";
            case 3 -> "Day 3: Wednesday";
            case 4 -> "Day 4: Thursday";
            case 5 -> "Day 5: Friday";
            case 6 -> "Day 6: Saturday";
            case 7 -> "Day 7: Sunday";
            default -> "Invalid input! Please enter a number between 1 and 7.";
        };

        System.out.println(result);
        //java 17
       String result1 = switch (dayNumber) {
            case 1: yield "Day 1: Monday";
            case 2: yield "Day 2: Tuesday";
            case 3: yield "Day 3: Wednesday";
            case 4: yield "Day 4: Thursday";
            case 5: yield "Day 5: Friday";
            case 6: yield "Day 6: Saturday";
            case 7: yield "Day 7: Sunday";
            default: yield "Invalid input! Please enter a number between 1 and 7.";
        };
        System.out.println(result1);


    }
}
