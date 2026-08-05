package org.example.twoPointer;

import java.util.ArrayList;

import java.util.List;

public class ValidPalindrome {
    static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {

        /*
         * Time complexity -
         * Space complexity -
         */
        if(s.isEmpty()) return true; // For strings .length() || Arrays s.length || rest of the collections - s.size()

        int left = 0;
        int right = s.length()-1;

        String lowerCaseS = s.toLowerCase();

        boolean output = true;
        while (left<right){
            char leftChar = lowerCaseS.charAt(left);
            char rightChar = lowerCaseS.charAt(right);
            if(!(Character.isLetterOrDigit(leftChar) )){
                left++;
            } else if (!(Character.isLetterOrDigit(rightChar))) {
                right--;
            }
            else {
                if(leftChar!=rightChar){
                    output= false;
                    return output;
                }
                else{
                    left++;
                    right--;
                }
            }
        }
        return output;
    }

    public static boolean isPalindrome2(String s) {

        /*
         * Time complexity -
         * Space complexity -
         */
        if(s.isEmpty()) return true; // For strings .length() || Arrays s.length || rest of the collections - s.size()

        int left = 0;
        int right = s.length()-1;

        boolean output = true;
        while (left<right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!(leftChar>= 'a' && leftChar<='z' || leftChar>= 'A' && leftChar<='Z'|| leftChar>= '0' && leftChar<='9' )){
                left++;
            } else if (!(rightChar>= 'a' && rightChar<='z' || rightChar>= 'A' && rightChar<='Z'|| rightChar>= '0' && rightChar<='9' )) {
                right--;
            }
            else {
                if(Character.toLowerCase(leftChar)!=Character.toLowerCase((rightChar))){
                    output= false;
                    return output;
                }
                else{
                    left++;
                    right--;
                }
            }
        }
        return output;
    }
    public static boolean isPalindrome1(String s) {

        /*
        * Time complexity - O(n)
        * Space complexity - O(n)
        */
        char [] charArr = s.toCharArray(); // Create a character array

        if(charArr.length==0) return true;
        List<Character> charList = new ArrayList<>();

        for (char c: charArr){
            if( 'a'<=c && c<='z' || 'A'<=c && c<='Z' || '0'<=c && c<='9' ){
                charList.add(Character.toLowerCase(c));
            }
        }
        boolean output = true;
        for (int left = 0, right = charList.size()-1; left <right; left++,right--) {
            if (charList.get(left) != charList.get(right)) {
                output = false;
                break;
            }
        }
        return output;
    }
}


/*
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/
