package com.certification;

public class PrimitiveTest {

    public static void main(String []args) {
//        short s = Short.MAX_VALUE;
//        char c = (char)s;
//        char c = s;
        int a = Integer.MIN_VALUE;
        int b = -a;
        System.out.println( a+ "   "+b);
        System.out.println( Integer.toBinaryString(a));
        System.out.println( Integer.toBinaryString(b));
    }
}
