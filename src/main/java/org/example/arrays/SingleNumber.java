package org.example.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(){
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) set.add(i);
            else set.remove(i);
        }
        for (int i : set) {
            return i;
        }
       return 0;
    }
    public static int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if(!map.containsKey(i)) map.put(i,1);
            else
                map.put(i,2);
        }
        int x = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)){
                x= entry.getKey();
            }
        }
        return x;
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
