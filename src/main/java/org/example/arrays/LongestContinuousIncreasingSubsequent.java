package org.example.arrays;
import java.util.*;

public class LongestContinuousIncreasingSubsequent {
    public static void main(String[] args){
        System.out.println(findLengthOfLCIS(new int[]{2,1,2,3,4,5,1,2,3,4}));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int maxValue =1;
        int count = 1;

        if (nums.length==1){
            return 1;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                count++;
            }else{
                count=1;
            }
            maxValue=Math.max(maxValue,count);

        }
        return maxValue;
    }
    public static int findLengthOfLCIS1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int output=1;
        if(nums.length==1){
            return 1;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                output++;
                if(i+1==nums.length-1){
                    list.add(output);
                }
            }else{
                list.add(output);
                output=1;
            }
        }

        return Collections.max(list);
    }
}
