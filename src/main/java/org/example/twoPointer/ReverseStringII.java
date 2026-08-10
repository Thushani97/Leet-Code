package org.example.twoPointer;



public class ReverseStringII {
    public static void main(String[] args){
        System.out.println(reverseStr("abcde",4));

    }

    public static String reverseStr(String s, int k){
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i+= 2*k) {
            int start = i;
            int end= Math.min(i+k-1, s.length()-1);
            while ( start<end){
                char temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
        return new String(arr);
    }
    public static String reverseStr2(String s, int k){
        char [] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i+= 2 * k) {
            if(i+k < arr.length ){
                reverse(i, i+k-1, arr);
            }else{
                reverse(i, s.length()-1,arr);
            }
        }
        return new String(arr);
    }

    public static void reverse(int start, int end, char[] arr){
        while (start<end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    public static String reverseStr1(String s, int k) {
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
