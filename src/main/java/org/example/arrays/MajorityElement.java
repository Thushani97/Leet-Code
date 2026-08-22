package org.example.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args){
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get())
        }
        return 0;
    }
    public static int majorityElement3(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 0;
            if(!map.containsKey(num)){
                map.put(num,++count);
            }else {
                int currentCount = map.get(num); // return the Value
                map.put(num,++currentCount);
            }
        }
//        int maxCount= Collections.max(map.values());
        for (Map.Entry<Integer,Integer> finalMap : map.entrySet()){
            if(finalMap.getValue()> nums.length/2){
                return finalMap.getKey();
            }
        }
        return 0;
    }


    public static int majorityElement2(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 0;
            if(!map.containsKey(num)){
                map.put(num,++count);
            }else {
                int currentCount = map.get(num); // return the Value
                map.put(num,++currentCount);
            }
        }
        int maxCount= Collections.max(map.values());
        for (Map.Entry<Integer,Integer> finalMap : map.entrySet()){
            if(finalMap.getValue()==maxCount){
                return finalMap.getKey();
            }
        }
        return 0;
    }

    public static int majorityElement1(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (num == nums[j]) {
                    count++;
                }
            }
            map.put( count,num);
        }
        int maxCount= Collections.max(map.keySet());
        return map.get(maxCount);
    }
}

/*
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/
