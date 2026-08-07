package org.example.twoPointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfTheString {

    public void main (String[] args){
        System.out.println(reverseVowels1("leetcode"));;
//        System.out.println(reverseVowels("bcdfg"));;
    }

    public String reverseVowels1(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int left = 0;
        int right = s.length()-1;
        char [] arr = s.toCharArray();
        while (left<right){
            while (left<right && !set.contains(arr[left])){
                left++;
            } while (left<right && !set.contains(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        return new String(arr);

    }
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char [] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        char temp = 'a';
        while (left<right){
            if(!set.contains(arr[right])){
                right--;
            } else if (!set.contains(arr[left])) {
                left++;
            }else{
                temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                right--;
                left++;
            }
        }
//        String str = new String(arr);
        return new String(arr);
    }
}


/*
Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"*/
