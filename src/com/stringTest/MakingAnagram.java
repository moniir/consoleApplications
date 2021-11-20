package com.stringTest;

public class MakingAnagram {

    public static int makeAnagram(String a, String b) {
        // Write your code here
        int[] counter = new int[256];
        int common=0;
        if(a.length()<1 || b.length()<1){
            return 0;
        }
        for(int i=0;i<a.length();i++){
            int x = a.charAt(i)-'a';
            counter[x]++;
        }
        for(int i=0;i<b.length();i++){
            int x = b.charAt(i)-'a';
            if(counter[x]>0){
                common++;
                counter[x]--;
            }
        }
        return a.length() + b.length() - 2*common;
    }

    public static void main(String[] args){
        System.out.println(makeAnagram("cde","adc"));
    }
}
