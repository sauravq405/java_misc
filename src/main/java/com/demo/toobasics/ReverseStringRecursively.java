package com.demo.toobasics;

public class ReverseStringRecursively {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String input = "hello";
        System.out.println(reverse(input, input.length()-1 , sb));
    }

    private static String reverse(String input, int length, StringBuilder sb) {
        if(length < 0) //empty string
            return sb.toString();

        //sb.append(input.charAt(length)).append(reverse(input, length -1, sb));
        sb.append(input.charAt(length));
        if(length == 0) //base condition
            return sb.toString();
            //return sb.append(input.charAt(length)).toString();

        return reverse(input, length -1, sb);
    }
}
