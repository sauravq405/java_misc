package com.demo.toobasics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //whole numbers / integral numbers
           //byte
           //short
           //int
           //long
        //decimal numbers
           //float
           //double
        //characters
           //char
        //booleans
          //boolean
        System.out.println("Byte.MIN_VALUE = "+Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = "+Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = "+Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = "+Short.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = "+Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = "+Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = "+Long.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = "+Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = "+Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = "+Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = "+Double.MAX_VALUE);

        System.out.println("Character.MIN_VALUE = " + (int) Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + (int) Character.MAX_VALUE);

        char a = 'a';
        char A = 'A';
        System.out.println("a = " + (int)a);
        System.out.println("A = " + (int)A);

        char heartSymbol = (char) 10084;
        System.out.println("Heart symbol: "+heartSymbol);

        //without casting
        char hindiCharacter = 2309;
        System.out.println("Hindi character: "+hindiCharacter);

        //Unicode representation
        char rightSymbolU = '\u27A4';
        System.out.println("Right symbol (unicode): "+rightSymbolU);

        for(int i = 0; i <= 65535; i++){
            //System.out.println((char) i);
        }

        //ASCII - 0 to 127 are ASCII values
        for(int i = 0; i <= 127; i++){
            System.out.println((char) i);
        }

        boolean isDone = true;
        System.out.println(Boolean.valueOf(isDone));

    }
}
