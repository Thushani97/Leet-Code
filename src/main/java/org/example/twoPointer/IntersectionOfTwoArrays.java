package org.example.twoPointer;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        int [] output=intersection(new int[] {1,2,2,1} , new int[] {2,2});
//        int [] output=intersection(new int[] {4,9,5} , new int[] {9,4,9,8,4});
        System.out.println(Arrays.toString(output));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        boolean[] booleanArr = new boolean[1001];
        for(int x:nums1){
            booleanArr[x]=true;
        }
        int index=0;
        int [] result = new int[1001];
        int [] result2 = new int[Math.min(nums1.length,nums2.length)];

        for(int y:nums2){
            if(booleanArr[y]){
                result[index++]=y;
                booleanArr[y]=false; // avoid adding duplicate values
            }
        }
        return Arrays.copyOf(result,index);
    }

    public static int[] intersection3(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<>(); // 1,2

        Set<Integer> outputSet = new HashSet<>(); // 2
        for(int x:nums1){
            setNums1.add(x);
        }

        for(int y: nums2){
            if(setNums1.contains(y)){
                outputSet.add(y);
            }
        }
        int index = 0;
        int[] output = new int[outputSet.size()];
        for(int k:outputSet){
            output[index++]=k;
        }
        return output;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<>(); // 1,2
        Set<Integer> setNums2 = new HashSet<>(); // 2
        Set<Integer> outputSet = new HashSet<>(); // 2
        for(int x:nums1){
            setNums1.add(x);
        }
        for(int x:nums2){
            setNums2.add(x);
        }

        for(int y: setNums1){
            if(setNums2.contains(y)){
                outputSet.add(y);
            }
        }
        int index = 0;
        int[] output = new int[outputSet.size()];
        for(int k:outputSet){
            output[index++]=k;
        }
        return output;
    }

    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i :nums1) {
         /*   for (int j = 0; j < nums2.length; j++) {
                if (i==nums2[j]){
                    set.add(i);
                }
            }*/
            for (int k : nums2) {
                if (i == k) {
                    set.add(i);// Set automatically removes duplicates
                }
            }
        }
        int [] output = new int[set.size()];// Define an array
        int index=0;
        for (int i:set) {
            output[index++]=i;
        }
        return output;
    }
}

/*
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/
