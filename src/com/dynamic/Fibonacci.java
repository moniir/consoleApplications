package com.dynamic;

import java.util.Scanner;

public class Fibonacci {

   static Scanner sc =new Scanner(System.in);

    static long []arr;

    public static long fibo(int n){

        long fibValue =0;

        if(arr[n]!=0)
            return arr[n];
        if(n==0) {
            return 0;
        } else if(n==1){
            return 1;
        } else {
            fibValue = fibo(n-1)+fibo(n-2);
            arr[n] = fibValue;
        }
        return fibValue;
    }

    public static void main(String []args){
        int p = sc.nextInt();
       arr = new long[p+1];
        arr[0]= 0;
        arr[1]=1;
//        int[] arr1 = new int[p+1];
        System.out.println(fibo(p));
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+",");
        }

    }
}
