package org.example;

import org.example.twoPointer.FindTheIndexOfTheFirstOccurance;
import org.example.twoPointer.MoveZeroes;
import org.example.twoPointer.RemoveElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    static void main() {
//        callRemoveElementMethod(new int[]{0,1,2,2,3,0,4,2}, 2);
//        findTheIndexOfTheFirstOccurance("sadbutsad","sad");
        moveZeroes(new int[]{0,1,0,3,12});


    }

    public static void moveZeroes(int[] hackStack){
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[] {0,1,0,3,12});
    }
    public static void findTheIndexOfTheFirstOccurance(String hackStack, String needle){
        FindTheIndexOfTheFirstOccurance fo = new FindTheIndexOfTheFirstOccurance();
        System.out.println("output:" + fo.strStr("mississippi","issi"));
    }

    public static void callRemoveElementMethod(int[] nums, int val){
        RemoveElement removeElement = new RemoveElement();
        System.out.println("output: "+removeElement.removeElement(nums,val));
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
