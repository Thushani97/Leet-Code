package org.example.twoPointer;

import java.util.Arrays;



public class ReverseString {

    public static void main(String[] args){
        reverseString(new char[] {'h','e','l','l','o'});
    }

    // ***** Optimized code ******
    /*
    * 1. Important points here - use 2 variables inside for loop
    * */
    public static void reverseString(char[] s) {
        for (int left = 0, right=s.length-1; left<right ; left++,right--) {
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString1(char[] s) {
        int a=0;
        int b= s.length-1;
        char temp = 's';
        while (a<b){
//            temp = s[a];
//            s[a] = s[b];
//            s[b]=temp;
            a++;
            b--;
        }
        System.out.println(Arrays.toString(s));
    }
}


/*
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/
