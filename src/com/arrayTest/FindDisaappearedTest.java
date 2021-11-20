package com.arrayTest;
import java.util.*;

public class FindDisaappearedTest {
    public static void main(String args[])
    {
        int[] a = {1 , 2 , 5 , 6 , 2 , 5};
        List <Integer> result = findDisappearedNumbers(a);
        if(result.size() == 0)
            System.out.println("No disappeared elements");
        else
            for(int i : result)
                System.out.print(i + " ");
    }
    static List <Integer> findDisappearedNumbers(int[] a)
    {
        List <Integer> result = new ArrayList <Integer>();
        HashSet <Integer> mark = new HashSet <Integer>();
        for(int i : a)
            mark.add(i);
        for(int i = 1 ; i <= a.length ; i++)
            if(!mark.contains(i))
                result.add(i);
        return result;
    }
}
