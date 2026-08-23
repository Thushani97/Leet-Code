package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args){
        System.out.println(canConstruct("aab","aba"));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mapRandsomNote  = new HashMap<>();
        for(int i = 0 ; i<magazine.length() ; i++){
            mapRandsomNote.put(magazine.charAt(i),mapRandsomNote.getOrDefault(magazine.charAt(i),0)+1);
        }

        for (int i=0; i< ransomNote.length(); i++ ){
            char c= ransomNote.charAt(i);
            if (!mapRandsomNote.containsKey(c) || mapRandsomNote.get(c)<=0){
                return false;
            }
            else if (mapRandsomNote.containsKey(c)){
                mapRandsomNote.put(c,mapRandsomNote.get(c)-1);
            }
        }
        return true;
    }
    public static boolean canConstruct1(String ransomNote, String magazine) {
        String [] ransomNoteArr = ransomNote.split("");
        String [] magazineArr = magazine.split("");

        for(String s: ransomNoteArr){
            for (int i = 0; i < magazineArr.length; i++) {
                if(s.equals(magazineArr[i])) {
                    magazineArr[i] = null;
                    break;
                } else if (!s.equals(magazineArr[i]) && i==magazineArr.length-1) {
                    return false;
                }
            }
        }
        return true;
    }
}


/*
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true*/
