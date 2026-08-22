package org.example.twoPointer;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

    public static void main(String[] args){
        System.out.println(wordPattern("abba"," dog dog dog dog "));
    }
    public static boolean wordPattern(String pattern, String s) {
        char[] patternArr = pattern.toCharArray();
        String[] sArr = s.trim().split(" ");
        Map<Character,String> map = new HashMap<>();

        if(sArr.length!= patternArr.length) return false;
        for(int i=0; i< patternArr.length; i++){
            if(!map.containsKey(patternArr[i])) {
                if(map.containsValue(sArr[i])){
                    return false;
                }
                map.put(patternArr[i],sArr[i]);
            }
            else if((map.containsKey(patternArr[i]) && !Objects.equals(map.get(patternArr[i]), sArr[i]))) return false;
        }
        return true;
    }
}


/*
mple 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Explanation:
The bijection can be established as:
        'a' maps to "dog".
        'b' maps to "cat".

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false*/
