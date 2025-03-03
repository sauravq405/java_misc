package com.demo.toobasics;

public class StringMethods {

    public static void main(String[] args) {
        String name = "India";
        int length = name.length();
        char c = name.charAt(2); //index starts at 0, ends at length-1
        System.out.println("equals() : "+name.equals("Bharat"));
        System.out.println("equalsIgnoreCase() : "+name.equalsIgnoreCase("india"));

        String str1 = "remote";
        String str2 = "car";
        System.out.println('r' + 0); //print ASCII value
        System.out.println('c' + 0); //print ASCII value
        int i = str1.compareTo(str2);//compares two string lexicographically as per the characters' ASCII value
        System.out.println("str1.compareTo(str2) = "+i); //str1.compareTo(str2) = str1.charAt(0) - str2.charAt(0),
        // if 0th chars are same, move to 1st, if 1st are same, then move to second

        String str3 = "reemote";
        String str4 = "raar";
        System.out.println('e' + 0); //print ASCII value
        System.out.println('a' + 0); //print ASCII value
        int j = str3.compareTo(str4);//compares two string lexicographically as per the characters' ASCII value
        System.out.println("str3.compareTo(str4) = "+j); //str3.compareTo(str4) = str3.charAt(0) - str4.charAt(0),
        // if 0th chars are same, move to 1st, if 1st are same, then move to 2nd and so on

        String str5 = "refref";
        String str6 = "REFREF"; //Tip: press Command + Shift + U to make string Uppercase in Intellij IDEA
        System.out.println('r' + 0); //print ASCII value
        System.out.println('R' + 0); //print ASCII value
        int k = str5.compareToIgnoreCase(str6);//compares two string lexicographically as per the characters' ASCII value
        System.out.println("str5.compareToIgnoreCase(str6) = " + k); //str5.compareToIgnoreCase(str6) = str5.charAt(0) - str6.charAt(0),
        // if 0th chars are same, move to 1st, if 1st are same, then move to 2nd and so on

        String employee = "Jon Smith";
        String empSub1 = employee.substring(4);
        System.out.println(empSub1);
        String empSub2 = employee.substring(5, 8);//the end index 8 will be excluded
        System.out.println(empSub2);

        String trimStr = "  value  ";
        System.out.println(trimStr.trim()); //trim() method returns an immutable string by removing head and trailing spaces.
        // trimStr remains same
        
        String originalname = "Amar Panchal";
        String replacedName = originalname.replace("Panchal", "Sharma");
        System.out.println(replacedName);
        System.out.println(originalname.contains("Amar"));
        System.out.println(originalname.startsWith("Am"));
        System.out.println(originalname.endsWith("al"));
        String str01 = " ";
        System.out.println(str01.isEmpty());
        System.out.println(str01.isBlank());

        int firstIndex = originalname.indexOf("a");
        int lastIndex = originalname.lastIndexOf("a");
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        int fromindex = originalname.indexOf("a", 5);
        System.out.println(fromindex);

        int one = 1;
        String onestr = String.valueOf(one);

        String formattedStr = String.format("My name is %s and salary is %d", "John Doe", 50000);

        System.out.println(formattedStr);

        System.out.println(originalname.substring(5, 8));

        System.out.println(originalname.subSequence(5, 8));

    }
}
