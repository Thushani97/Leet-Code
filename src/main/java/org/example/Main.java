package org.example;

import org.example.twoPointer.RemoveElement;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        callRemoveElementMethod(new int[]{0,1,2,2,3,0,4,2}, 2);
//        int [] out =twoSum(new int[]{3,2,4}, 6);//twoSum(new int[]{6,2,8,11,7,15 }, 9);
//        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,1,2,2,3,3,4})); ;
    }

    public static void callRemoveElementMethod(int[] nums, int val){
        RemoveElement removeElement = new RemoveElement();
        System.out.println("output: "+removeElement.removeElement(nums,val));
    }
//    *********** TWO POINTER METHOD *************
    public static int removeDuplicates(int[] nums) {
        int i =0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];

            }
        }
        return i+1;
    }



    public static int removeDuplicates2(int[] nums) {
        int j=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }

        return j;
    }
    public static int removeDuplicates1(int[] nums) {
        int index=1;
        int leftIndex=0;
        int rightIndex=1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[leftIndex]==nums[rightIndex]){
                rightIndex++;
            }else{
                nums[index]=nums[rightIndex];
                leftIndex=rightIndex;
                rightIndex++;
                index++;
            }
        }
        return index;
    }
}
