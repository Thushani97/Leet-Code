package org.example.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {
    public static void main(String[] args){
        System.out.println(majorityElement(new int[] {3,3,2,1,1,1,1,2,3}));
    }

    public static int majorityElement(int[] nums) {
        return Arrays.stream(nums)// int [] -> IntStream
                .boxed() // IntStream -> Stream<Integer> bcz groupingBy works only for Obj
                .collect(Collectors.groupingBy( // terminal Operation
                       x->x,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}

/*Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
