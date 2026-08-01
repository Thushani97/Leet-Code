package org.example.twoPointer;

public class IsSubSequence {

    public static void main(String [] args){
        System.out.println(isSubsequence("b", "abc"));
        System.out.println(isSubsequence("", "abc"));
//        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    /*
    * **** what I have learnt *******
    * 1. Convert String to char[] --> s.toCharArray();
    * 2. Use Logical AND - && Only one side is evaluated , if false , don't check for other side
    *
    * */
    public static boolean isSubsequence(String s, String t) {
        char [] sArray = s.toCharArray(); // ['a','b','c'] -abc
        char [] tArray = t.toCharArray();// ['a','h','b','g','d','c'] -ahbgdc
        int sIndex= 0;
        int tIndex= 0;
        while (sIndex<s.length() && tIndex<t.length()){ //sArray.length!=0 && sIndex!=s.length()
            if (sArray[sIndex]==tArray[tIndex]){
                sIndex++;
                tIndex++;
            }else{
                tIndex++;
            }
        }

        return sIndex==s.length();
//        if (sIndex==s.length()){
//            return true;
//        }
//        return false;

    }
}


/*
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false*/
