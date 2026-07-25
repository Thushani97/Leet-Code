package org.example.twoPointer;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i}; // new int[] {2,3,1} : Array initialize
            }
            map.put(nums[i],i);
        }

        return new int[]{};
    }

    public static int[] twoSum3(int[] nums, int target){
        int [] indexArray = {0,0};
        int leftIndex=0;
        int rightIndex= nums.length-1;

        for (int i = leftIndex; i < nums.length; i++) {
            if (nums[leftIndex]+ nums[rightIndex]!=target){
                System.out.println("right index element:"+nums[rightIndex]);
                System.out.println("left index element:"+nums[leftIndex]);
                rightIndex--;
                System.out.println("right index:"+rightIndex);
            } else if (rightIndex==leftIndex+1) {
                System.out.println("else if :: left index element:"+nums[leftIndex]);
                leftIndex++;
                i=leftIndex;
            } else if (nums[leftIndex]+ nums[rightIndex]==target) {
                indexArray[0]=leftIndex;
                indexArray[1]=rightIndex;
            }
        }
        return indexArray;
    }

    public static int[] twoSum2(int[] nums, int target) {

        boolean found = false;
        int [] indexArray = {0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i]<target && nums[i]+ nums[j]==target){
                    indexArray[0]=i;
                    indexArray[1]=j;
                    found = true;
                }
            }
            if(found){
                break;
            }
        }
        System.out.println(indexArray[0]);
        System.out.println(indexArray[1]);
        return indexArray;
    }
    public static int[] twoSum1(int[] nums, int target) {

        int [] indexArray = {0,0};
        for (int j = 0; j < nums.length; j++) {
            for (int i = j+1; i < nums.length; i++) {
                int value = target - nums[j];
                System.out.println("searching value: "+ value);
                System.out.println("current num[i]: "+ nums[i]);
                if(value==nums[i]){
                    System.out.println("searching value index: "+ i);
                    indexArray[0]=j;
                    indexArray[1]=i;
                    break;
                }
            }
        }
        System.out.println(indexArray[0]);
        System.out.println(indexArray[1]);
        return indexArray;
    }
}
