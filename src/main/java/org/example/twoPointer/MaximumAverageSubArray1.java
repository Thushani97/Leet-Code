package org.example.twoPointer;

public class MaximumAverageSubArray1 {

    public static void main(String[] args){
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
        System.out.println(findMaxAverage(new int[]{0,1,1,3,3},4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double output= Double.NEGATIVE_INFINITY;
        if(k==1 && nums.length==1) {
            output= (double) nums[0] /k;
            return output;
        } ;
        for (int i = 0; i <= nums.length-k; i++) {
            double sum=0;
            int index=0;
            while (index<k){
                sum+=nums[i+index];
                index++;
            }
            if (output<sum/k) output=sum/k;
        }
       return  output;
    }
}

/*Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000
*/
