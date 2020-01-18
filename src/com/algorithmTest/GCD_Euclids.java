package com.algorithmTest;

public class GCD_Euclids {

    public static int GCD(int a , int b){
        int divident = a<=b?b:a;
        int divisor = a<=b?a:b;
        while(divisor!=0){
            int remainder = divident%divisor;
            divident=divisor;
            divisor = remainder;

        }
        return divident;
    }

    public static void main(String[] args) {
       System.out.println(GCD(400,124));
    }
}
