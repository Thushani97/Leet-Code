package org.example.twoPointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/*
* 1. How to store value in map with sequential order: Define a variable and add with that.
*
* */
public class MoveZeroes {


    public void moveZeroes(int[] nums) {
        int a=0;
        int b=0;
        while (a<nums.length){
            if(nums[a]==0){
                a++;
            }else{
                if(nums[b]!=nums[a]) nums[b]=nums[a];
                a++;
                b++;
            }
        }
        while (b< nums.length){
            nums[b]=0;
            b++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes2(int[] nums) {
        int a=0;
        int b=0;
        while (a<nums.length){
            if(nums[a]==0){
                a++;
            }else{
                if(nums[b]!=nums[a]) nums[b]=nums[a];
                a++;
                b++;
            }
        }
        while (b< nums.length){
            nums[b]=0;
            b++;
        }
        System.out.println(Arrays.toString(nums));
    }





    public void moveZeroes1(int[] nums) {
        int nonZeroIndex=0;
        int zeroIndex=0;
        Map<Integer,Integer> mapNonZero = new HashMap<>();
        Map<Integer,Integer> mapZero = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                mapNonZero.put(nonZeroIndex,nums[i]);
                nonZeroIndex++;
            }else{
                mapZero.put(zeroIndex,nums[i]);
                zeroIndex++;
            }
        }

        for (int i = 0; i < mapNonZero.size(); i++) {
            nums[i]=mapNonZero.get(i);
        }

        for (int i = 0; i < mapZero.size(); i++) {
            nums[mapNonZero.size()+i]=mapZero.get(i);
        }
    }
}


/*
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]

*/
