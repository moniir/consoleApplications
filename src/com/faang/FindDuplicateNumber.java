/*
* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

* */

package com.faang;


import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {

    public static void findDuplicate(int[] numRay){
        //time acomplexity o(n), space complexity o(1)
        for (int i = 0; i < numRay.length; i++) {
            int a = numRay[i] % numRay.length;
            numRay[a] = numRay[numRay[i] % numRay.length] + numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }

      //Another approach time acomplexity o(n), with space complexity o(n)
    /*    HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i< numRay.length;i++){
            if(hashMap.containsKey(numRay[i])){
                count = hashMap.get(numRay[i]);
                hashMap.put(numRay[i], count+1);
            } else {
                hashMap.put(numRay[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getValue());
            }
        }*/

    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,4,4};
        findDuplicate(arr);
    }
}
