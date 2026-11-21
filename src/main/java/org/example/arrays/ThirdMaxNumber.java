package org.example.arrays;

import com.sun.source.doctree.SeeTree;

import java.util.*;


// Could not solve this, use TreeSet
public class ThirdMaxNumber {

    public static void main(String[] args){
        System.out.println(thirdMax(new int[]{1,1,2}));;
    }

    public static int thirdMax(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j]<nums[j+1]){
                    temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        if(nums.length<3){
            return nums[0];
        }else{

            while (map.size()<3){
                map.put(nums[i], i);
                i++;
            }
            return 0;
        }


    }
}


/*
Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
*/
