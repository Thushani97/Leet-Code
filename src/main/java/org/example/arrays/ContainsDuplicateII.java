package org.example.arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicateII {

    public static void main (String[] args){
        System.out.println(containsNearbyDuplicate(new int[]{99,99},2));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
//        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,6,7,8,9,9},3));//8-3 = 5
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){// not exist : add & true

            }
        }
        return false;
    }
    public static boolean containsNearbyDuplicate3(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                int previousIndex = map.get(nums[i]);
                if(i-previousIndex<=k){
                    return true;
                }
            }
            map.put(nums[i],i );
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
//        if(k>=nums.length){
//            k=nums.length-1;
//        }
        for (int i = 0; i < nums.length-1; i++) {
            int j = 1+i;
            while(j<=i+k && j<nums.length){
                if(nums[i]!= nums[j] ){
                    j++;
                } else if(nums[i]== nums[j]){
                    return true;
                }
            }
        }
        return false;
    }



    public static boolean containsNearbyDuplicate1(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j=1; j<nums.length; j++)
                if(nums[i]== nums[j] && Math.abs(i-j)<=k && i!=j){
                    return true;
            }
        }
        return false;
    }
}

/*
Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false*/
