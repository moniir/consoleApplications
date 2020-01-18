package com.company;

public class DataTypeTest {

    public static void main(String[] args) {
        Long l = 127l;
        Long l1 = 127l;
        Long l2 = new Long(127);

        System.out.println(l==l1);
        System.out.println(l==l2);
        System.out.println(l.equals(l1));
        System.out.println(l.equals(l2));
    }
}
