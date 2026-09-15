package org.example.twoPointer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args){
        System.out.println(isHappy(1111111));
//        getDigits(123);
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int val = n;
        while (val!=1){
            int sum =0;
            while (val>0){
                int lastDigit= val%10;
                sum+=lastDigit * lastDigit;
                val/=10;
            }
            val=sum;
            if (!set.add(sum)){
                break;
            }
        }
        return val==1;

    }


    public static boolean isHappy1(int n) {
        Set<Integer> set = new HashSet<>();
        int val =n;
        while (val!=1 ){

            val = String.valueOf(val)
                    .chars()
                    .map(x->x-'0')
                    .map(x->x*x)
                    .sum();
//
//                List<Integer> list=String.valueOf(val)
//                        .chars() // convert to int value of characters : IntStream
//                        .map(c->c-'0')// get the int values
//                        .boxed()// convert primitive values -> wrapper objects
//                        .map(x->x*x)
//                        .toList();
//
//                val= list.stream().mapToInt(x->x).sum();
                if(!set.add(val)){
                    break;
                }
        }
        return val == 1;
    }


    public static void getDigits(int n){
        int val = n;
        int sum =0;
        while (val>0){
            int num = val%10;
            sum+=num*num;
            val/=10;
        }
        System.out.println(23/10);
        System.out.println(sum);
    }
}

/*

Example 1:
Input: n = 19
Output: true
Explanation:
        1^2 + 9^2 = 82
        8^2 + 2^2 = 68
        6^2 + 8^2 = 100
        1^2 + 0^2 + 0^2 = 1

Example 2:
Input: n = 2
Output: false
*/
