package org.example.twoPointer;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ShortestDistanceToACharacter {

    public static void main(String[] args){
        int [] result= (shortestToChar("loveleetcode", 'e'));
//        int [] result= (shortestToChar("aaba", 'b'));
//        int [] result= (shortestToChar("abba", 'b'));
        System.out.println(Arrays.toString(result));
    }
    public static int[] shortestToChar(String s, char c) {
        char[] arr = s.toCharArray();
        int[] output = new int[s.length()];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentIndex= i;
            while (arr[currentIndex]!=c){
                currentIndex++;
            }
            output[index++]=currentIndex;
        }
        return output;
    }


    public static int[] shortestToChar1(String s, char c) {
        char[] arr = s.toCharArray();
        List<Integer> charIndex = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(arr[i]== c) charIndex.add(i);
        }

        int[] output = new int[s.length()];
        int index = 0;
        int currentIndex =0;
        int previousIndex =0;
        for (int i = 0; i < s.length() ; i++) {
            if(charIndex.size()==1){
                output[index] = Math.min(Math.abs(i-charIndex.get(currentIndex)), Math.abs(i-charIndex.get(previousIndex)));
                index++;
            }
            else if(i< charIndex.get(currentIndex) || i>charIndex.get(currentIndex) ){
                output[index] = Math.min(Math.abs(i-charIndex.get(currentIndex)), Math.abs(i-charIndex.get(previousIndex)));
                index++;
            }else{
                output[index++] =0;
                previousIndex = currentIndex;
                if(currentIndex< charIndex.size()-1) currentIndex++;
            }
        }
        return output;
    }
}
