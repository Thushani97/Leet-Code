package org.example.twoPointer;

public class ReverseStringII {
    public static void main(String[] args){
        System.out.println(reverseStr("abcdefgh",4));

    }
    public static String reverseStr(String s, int k) {
        int shift = 2 * k;
        int iterations = s.length()/shift;
        int remainder = s.length()%shift;
        char [] arr = s.toCharArray();

        for (int i = 0; i < iterations ; i++) {
            int start = i * shift;
            int end = start + k -1;
            while ( start<end){
                char temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
        // for the remainder characters
        int a = shift* iterations;
        int b = 0;;
        if(remainder<k){
            b = s.length()-1;;
        } else if (remainder<2*k) {
            b= (shift* iterations)+k-1;
        }
        while (a<b){
            char temp = arr[a];
            arr[a++] = arr[b];
            arr[b--] = temp;
        }
        return new String(arr);
    }
}

/*
Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:

Input: s = "abcd", k = 2
Output: "bacd"*/
