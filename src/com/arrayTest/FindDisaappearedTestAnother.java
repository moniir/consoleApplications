package com.arrayTest;

import java.util.ArrayList;
import java.util.List;

public class FindDisaappearedTestAnother {

    public static void main(String args[])
    {
        int[] a = {4 , 3 , 2 , 7 , 8 , 2, 3,1};
        List<Integer> result = findDisappearedNumbers(a);
        if(result.size() == 0)
            System.out.println("No disappeared elements");
        else
            for(int i : result)
                System.out.print(i + " ");
    }

    public static List<Integer> findDisappearedNumbers(int[] nums){

        for(int i=0;i<nums.length;i++){
            int curr = Math.abs(nums[i]);
            nums[curr-1] = -(Math.abs(nums[curr-1]));
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}
