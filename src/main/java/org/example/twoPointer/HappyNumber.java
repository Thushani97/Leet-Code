package org.example.twoPointer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args){
        System.out.println(isHappy(1111111));
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int val =n;
        while (val!=1 ){
                List<Integer> list=String.valueOf(val)
                        .chars() // convert to int value of characters
                        .map(c->c-'0')// get the int values
                        .boxed()//
                        .map(x->x*x)
                        .toList();

                val= list.stream().mapToInt(x->x).sum();
                if(!set.add(val)){
                    break;
                }
                set.add(val);
        }
        return val == 1;
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
