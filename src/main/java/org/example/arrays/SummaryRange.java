package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        for (int i=0 ; i< nums.length-1; i++){
            if( (long)nums[i]+1 != nums[i+1]){
                output.add(String.valueOf(nums[i]));
            }
            else{
                String start=String.valueOf(nums[i]);
                while (i+1 != nums.length && (long)nums[i]+1 == nums[i+1]){
                    i++;
                }
                String end = String.valueOf(nums[i]);
                String entry = start + "->" + end;
                output.add(entry);
            }
        }
        if (nums.length > 0) {
            if (output.isEmpty() ||
                    output.get(output.size() - 1).endsWith(String.valueOf(nums[nums.length - 1]))) {

                output.add(String.valueOf(nums[nums.length - 1]));
            }
        }

        return output;
    }

    public static void main(String[] args){
        List<String> result = summaryRanges(new int[]{0,1,2,4,5,7});
//        List<String> result = summaryRanges(new int[]{-2147483648,-2147483647,2147483647});
//        List<String> result = summaryRanges(new int[]{0,2,3,4,6,8,9});
        for (String string:result)
            System.out.println(string);
    }
}


/*
Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
        [0,2] --> "0->2"
        [4,5] --> "4->5"
        [7,7] --> "7"

Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
        [0,0] --> "0"
        [2,4] --> "2->4"
        [6,6] --> "6"
        [8,9] --> "8->9"
*/
