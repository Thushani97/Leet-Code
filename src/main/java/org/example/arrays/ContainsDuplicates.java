package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args){

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if(!set.add(i)){ // set.add(i) -> true for a new element || false -> duplicate
                return true;
            }
        }
        return false;
    }
    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if(!set.contains(i)){
                set.add(i);
            }else {
                return true;
            }
        }
        return false;
    }
}

/*
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
*/

