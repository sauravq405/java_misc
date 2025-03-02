package com.demo.toobasics;

public class PrimitiveDataTypesBytes {
    public static void main(String[] args) {
        byte byteValue = 10; //1 Byte
        short shortValue = byteValue; //2 Bytes
        int intValue = shortValue; //4 Bytes
        long longValue = intValue; //8 Bytes

        float floatValue = longValue; //4 Bytes //Widening conversion or Implicit or Automatic conversion
        double doubleValue = floatValue;//8 Bytes

        char charValue = 'a'; //2 Bytes
        boolean booleanValue = true; //1 BIT

        int intChar = charValue; // Widening conversion from char to int
        float floatChar = floatValue; // Widening conversion from char to float

        System.out.println("byte: "+byteValue);
        System.out.println("short: "+shortValue);
        System.out.println("int: "+intValue);
        System.out.println("long: "+longValue);
        System.out.println("float: "+floatValue);
        System.out.println("double: "+doubleValue);

        double d = 123.56;
        float f = (float) d; //Narrowing conversion from double to float
        long l = (long) f; //Narrowing conversion from float to long
        int i = (int) l; //Narrowing conversion from long to int

        System.out.println(Integer.toBinaryString(-1));

    }
}
