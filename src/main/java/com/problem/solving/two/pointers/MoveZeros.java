package com.problem.solving.two.pointers;

import java.util.Arrays;

/**
 * Given an array of integers, move all the 0s to the back of the array while maintaining the relative order of the non-zero elements. Do this in-place using constant auxiliary space.
 * Input:
 * [1, 0, 2, 0, 0, 7]
 * Output:
 * [1, 2, 7, 0, 0, 0]
 */
public class MoveZeros {

  public static void main(String[] args) {
   int[] arr = {1, 2, 2, 7, 0, 1, 2};
      System.out.println(Arrays.toString(moveZeros(arr)));
  }

  static int[] moveZeros(int[] arr) {

      int i=0; int j=1;
      while(j < arr.length) {
          if(arr[i] != 0)
              i++;
          if(arr[j] != 0 && i != j) {
              arr[i] = arr[j];
              arr[j] = 0;
          }
          j++;
      }

      return arr;
  }

}
