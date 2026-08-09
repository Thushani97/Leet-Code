package org.example.twoPointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfTheString {

    public static void main (String[] args){
        System.out.println(reverseVowels("leetcode"));;
//        System.out.println(reverseVowels("bcdfg"));;
    }

    // ****** JIT Compiler ******
    // This is a memory compilation method
    static boolean [] isVowelArr = new boolean[125];
    static {
        for (char c: "aeiouAEIOU".toCharArray()) {
            isVowelArr[c]=true;
        }
    }
    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char [] arr = s.toCharArray();
        while (left<right){
            while (left<right && !isVowel(arr[left])) left++;
            while (left<right && !isVowel(arr[right])) right--;
            char temp= arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return new String(arr);
    }
      static boolean isVowel(char c){
        c= Character.toLowerCase(c);
        switch (c){
            case 'a', 'e', 'i', 'o', 'u':
                return true;
            default:
                return false;
        }

     }
    public static String reverseVowels3(String s) {
        int left = 0;
        int right = s.length()-1;
        char [] arr = s.toCharArray();
        while (left<right){
            while (left<right && !isVowelArr[arr[left]]){
                left++;
            } while (left<right && !isVowelArr[arr[right]]){
                right--;
            }
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--]= temp;
        }
        return new String(arr);
    }
    public static String reverseVowels2(String s) {
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
            arr[left++] = arr[right];
            arr[right--]= temp;
        }
        return new String(arr);
    }

    public static String reverseVowels1(String s) {
        int left = 0;
        int right = s.length()-1;
        char [] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();// HashSET<>(Arrays.asList('a','e'))
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
