package org.example.twoPointer;

public class PalindromeNumber {
    static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        int left = 0;
        int right = input.length()-1;

        if(x<0) {return false;}
        else{
            while (left<right){
                if (input.charAt(left)!=input.charAt(right)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
