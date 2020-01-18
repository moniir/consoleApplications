package com.algorithmTest;

//sieve algorithm for finding in between prime numbers
// 20 = 2 3 5 7 11 13 17 19

public class SievePrimeTest {

    public static void sievePrime(int n){
        boolean[] prime =new boolean[n+1];
        for (int i=2;i<=n;i++){
            prime[i] = true;
        }

        for(int i=2;i<Math.sqrt(n);i++){
            if(prime[i]){
                for(int j=i;j*i<=n;j++){
                    prime[j*i]=false;
                }

            }
        }
        for (int i=2;i<= n;i++) {
            if(prime[i])
            System.out.printf(i+" ");
        }
    }


    public static void main(String[] args) {
        sievePrime(20);

    }
}
