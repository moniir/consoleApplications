package com.certification;

public class Conversion{
    public static void main(String[] args){
        int i = 1234567890;
        float f = i;
        int t = (int)f;
        System.out.println(i - (int)f);
    }
}