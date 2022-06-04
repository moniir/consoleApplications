package com.mixed;
/**
 *
 * Definition 1. n!!…! = n(n−k)(n−2k)…(n mod k), if k doesn’t divide n; n!!…! = n(n−k)(n−2k)…k, if k divides n (There are k marks ! in the both cases).
 * Definition 2. X mod Y — a remainder after division of X by Y.
 * For example, 10 mod 3 = 1; 3! = 3·2·1; 10!!! = 10·7·4·1.
 * Given numbers n and k we have calculated a value of the expression in the first definition. Can you do it as well?
 * Input
 * contains the only line: one integer n, 1 ≤ n ≤ 10, then exactly one space, then k exclamation marks, 1 ≤ k ≤ 20.
 * Output
 * contains one number — n!!…! (there are k marks ! here).
 *
 * */
import java.util.Scanner;

public class FactorialsCalculation {




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        while (input.hasNext()) {


            int n = input.nextInt();

            int k = input.next().length();



            System.out.println(factorials(n, k));

        }

    }



    public static int factorials(int n, int k){
        int result = 1;
        if((n % k) == 0){
            for(int i = n; i >= k; i -= k){
                result *= i;
            }
        } else{
            for(int i = n; i >= (n % k); i -= k){
                result *= i;
            }
        }
        return result;

    }

}