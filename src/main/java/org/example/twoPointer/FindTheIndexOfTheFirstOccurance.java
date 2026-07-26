package org.example.twoPointer;

public class FindTheIndexOfTheFirstOccurance {


/*
*** What I have learnt from this code ***
* 1.CharAt ()
* 2.Use two pointer inside for loop
* 3.Set up length for the For loop
* 4.To compare two String --> Use .equals()
* 5.To compare two characters --> Use ==
*
String s1 = new String("hello");
String s2 = new String("hello");

System.out.println(s1 == s2);      // false ❌
System.out.println(s1.equals(s2)); // true ✅

👉 String stores a reference (memory address)
👉 == compares memory location, NOT content
👉 .equals() compares actual characters inside

 */

    public int strStr(String haystack, String needle) {

        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();
        for (int i = 0; i <= lenHaystack-lenNeedle; i++) {
            int k =0 ;

            while (k<lenNeedle && haystack.charAt(i+k)==needle.charAt(k)){
                k++;
            }
            if(k==lenNeedle){
                return i;
            }
        }
        return -1;
    }


    public int strStrMyCode(String haystack, String needle) {

        int index=-1;
        int needleLen = needle.length();
        int arrayLen=haystack.length()-needleLen+1;

        for (int i = 0; i < arrayLen; i++) {
            String subWord = haystack.substring(i,i+needleLen);
            if (subWord.equals(needle)){
                index=i;
                break;
            }
        }
        return index;
    }
}

/*
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.


Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/
