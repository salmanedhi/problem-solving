package com.problem.solving.twopointers.oppositedirection;

/**
 * Given an array of integers sorted in ascending order, find two numbers that add up to a given target.
 * Return the indices of the two numbers in ascending order.
 * You can assume elements in the array are unique and there is only one solution.
 * Do this in O(n) time and with constant auxiliary space.
 * Input:
 *  arr: a sorted integer array
 *  target: the target sum we want to reach
 * Sample Input: [2, 3, 4, 5, 8, 11, 18], 8
 * Sample Output: 1 3
 */
public class TwoSumSorted {

  public static void main(String[] args) {
   int[] arr = {2, 2, 3, 5, 8, 11, 18};
      twoSumSorted(arr,21);
  }

  static void twoSumSorted(int[] arr, int targetValue) {

      int i=0;
      int j=arr.length-1;
      while(i != j) {
          int currSum = arr[i]+arr[j];
          if(currSum == targetValue) {
              System.out.println(i + " " + j);
              break;
          } else if(currSum > targetValue)
              j--;
          else i++;
      }

  }

}
