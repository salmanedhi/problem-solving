package com.problem.solving.twopointers.slidingwindow;

/**
 * The Container With Most Water is a classic problem on Leet Code (Problem #11).
 * It involves finding the maximum amount of water that can be held between two lines on a graph where the height of each line
 * is given by an array.
 * Problem Description:
 *  You are given an integer array height where height[i] represents the height of the i-th vertical line on a graph. The lines are spaced one unit apart. You need to find two lines that, together with the x-axis, form a container such that the container holds the maximum amount of water.
 * Formula for Water Area:
 *  The amount of water between two lines at indices i and j is:
 *      Area=min(height[i],height[j])×(j−i)
 * Your goal is to maximize this area.
 */
public class LargestSubArraySum {

  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 7, 4, 1};
      System.out.println(largestSubArraySum(arr, 3));
  }

  static int largestSubArraySum(int[] arr, int k) {

      int windowSum = 0;
      for(int l=0; l<k; l++) {
          windowSum += arr[l];
      }

      int i=0; int j=k-1;

      int largestSum = windowSum;

      while(j < arr.length-1) {
          i++; j++;
          windowSum = windowSum - arr[i-1] + arr[j];
          if(windowSum > largestSum) largestSum = windowSum;

      }

      return largestSum;
  }

}
