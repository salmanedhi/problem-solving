package com.problem.solving.two.pointers;

import java.util.Arrays;


/**
 * Given a sorted list of numbers, remove duplicates and return the new length. You must do this in-place and without using extra memory.
 * Input: [0, 0, 1, 1, 1, 2, 2].
 * Output: 3.
 * Your function should modify the list in place so that the first three elements become 0, 1, 2. Return 3 because the new length is 3.
 */
public class RemoveDuplicates  {

  public static void main(String[] args) {
   int[] arr = {0, 1,1,2,2,2};

   int i=0, j=0;
   while(j < arr.length) {
     if(arr[i] != arr[j]) {
       arr[++i] = arr[j];
     }
     j++;
   }
    System.out.println(Arrays.toString(arr));
    System.out.println(i+1);
  }
}
