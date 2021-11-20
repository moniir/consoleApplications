/*
* You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit.
* Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)

* */

package com.faang;

import java.util.Arrays;

public class BoatToSavePeople {

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int index = 0, length = people.length - 1;
        int ans = 0;

        while (index <= length) {
            ans++;
            if (people[index] + people[length] <= limit)
                index++;
            length--;
        }
        return ans;
    }

    public static void main (String[] args) {
        int personWeight[] = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(numRescueBoats(personWeight, limit));
    }
}
