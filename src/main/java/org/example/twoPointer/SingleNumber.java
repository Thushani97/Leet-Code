package org.example.twoPointer;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args){
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));

        int[] lst = new int[]{1,2,3,4};
        Set<Integer> set = new HashSet<>();
        for (int i: lst){
            set.add(i);
        }
        System.out.println(set.iterator().next());
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i))
                set.remove(i);
        }
        return set.iterator().next(); // output only one element
    }
}


/*
Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
*/
