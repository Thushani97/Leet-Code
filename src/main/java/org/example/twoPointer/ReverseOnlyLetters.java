package org.example.twoPointer;

import java.util.HashSet;
import java.util.Set;

public class ReverseOnlyLetters {

    public static void main(String[] args){
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String s) {
        char [] arr = s.toCharArray();
        Set<Character> validList = new HashSet<>();
        for (char i = 'a'; i <='z' ; i++) {
            validList.add(i);
        }
        for (char i = 'A'; i <='Z' ; i++) {
            validList.add(i);
        }

        int left= 0;
        int right = arr.length-1;

        while (left<right){
            if(validList.contains(arr[left]) && validList.contains(arr[right])){
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            } else if (!validList.contains(arr[left])) {
                left++;
            } else if (!validList.contains(arr[right])) {
                right--;
            }
        }
        return new String(arr);
    }

    public static String reverseOnlyLetters1(String s) {
        char [] arr = s.toCharArray();
        Set<Character> validList = new HashSet<>();
        for (char i = 'a'; i <='z' ; i++) {
            validList.add(i);
        }
        for (char i = 'A'; i <='Z' ; i++) {
            validList.add(i);
        }

        int left ;
        int right = arr.length-1;
        StringBuilder sb = new StringBuilder();

        for (left = 0; left < arr.length;) {
            if(validList.contains(arr[left]) && validList.contains(arr[right])){
                sb.append(arr[right]);
                right--;
                left++;
            } else if (!validList.contains(arr[left])) {
                sb.append(arr[left]);
                left++;
            } else if (!validList.contains(arr[right])) {
                right--;
            }
        }
        return sb.toString();
    }
}

/*
Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"*/
