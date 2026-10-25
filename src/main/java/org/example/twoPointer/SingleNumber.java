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

        /*
        *   XOR operation ->  1 ^ 1 = 0 | 0 ^ 0 = 0 | 1 ^ 0 = 1 | 0 ^ 1 = 1
        *  Same operation works with numbers.
        * */
        int val = 0;
        for (int i : nums) {
            val ^=i;
        }
        return val; // output only one element
    }
    public static int singleNumber1(int[] nums) {
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
