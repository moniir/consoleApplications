package com.algorithmTest;


//30=2 3 5
//36 = 2 2 3 3

public class primeFactorization {

    public static void factorizePrime(int n){
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                int count =0;
                while (n%i==0){
                    n =n/i;
                    count++;
                }
                printNum(i,count);
            }
        }
        if(n!=1)
            printNum(n,1);
    }

    public static void printNum(int num, int count){
      //  double result = Math.pow(num, count);
        while (count>0) {
            System.out.printf(num + " ");
            count--;
        }
    }

    public static void main(String[] args) {
        factorizePrime(36);
    }
}
