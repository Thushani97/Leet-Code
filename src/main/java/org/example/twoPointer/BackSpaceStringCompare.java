package org.example.twoPointer;

import java.util.Objects;

public class BackSpaceStringCompare {

    public static void main (String[] args){
//        System.out.println(backspaceCompare1("ab#c","ad#c"));
        System.out.println(backspaceCompare1("bxj##tw","bxo#j##tw"));
    }

    public static boolean backspaceCompare1(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        String s1= getString1(sArray);
        String s2=getString1(tArray);
        return Objects.equals(s1, s2);
    }

    static String getString1(char[] arr){
        int count = arr.length-1;
        int hash = 0;
        String st = "";

        while (count>=0){
            if(arr[count] == '#'){
                hash++;
                count--;
            }else {
                if(hash != 0){
                    count -=hash;
                    hash=0;
                }
                else{
                    st+= arr[count];
                    count--;
                }
            }
        }
        return st;
    }
}

/*
bxj##tw
bxo#j##tw

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
*/
