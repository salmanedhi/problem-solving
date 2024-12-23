package com.problem.solving.two.pointers;

/**
 * Find the middle node of a linked list.
 * Input: 0 1 2 3 4
 * Output: 2
 * If the number of nodes is even, then return the second middle node.
 * Input: 0 1 2 3 4 5
 * Output: 3
 */
public class MiddleOfALinkedList {

  public static void main(String[] args) {
   int[] arr = {0,1,2,3,4,5,6,7};
      System.out.println(middleOfALinkedList(arr));
  }

  static int middleOfALinkedList(int[] arr) {

      int i=0;
      int j=arr.length-1;

      while(i != j) {
          if(i+1 == j){
              return arr[j];
          }
          i++;
          j--;
      }

      return arr[i];
  }

}
