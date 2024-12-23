package com.problem.solving.two.pointers;

/**
 * Determine whether a string is a palindrome, ignoring non-alphanumeric characters and case. Examples:
 * Input: Do geese see God? Output: True
 * Input: Was it a car or a cat I saw? Output: True
 * Input: A brown fox jumping over Output: False
 */
public class ValidPalindrome {

  public static void main(String[] args) {
      String str = "A brown fox jumping over";
      System.out.println(validPalindrome(str));
  }

  static boolean validPalindrome(String str) {

      char[] charArr = str.toCharArray();

      int i=0;
      int j=charArr.length-1;

      while(i != j) {
          if(!Character.isAlphabetic(charArr[i]))
              i++;
          else if(!Character.isAlphabetic(charArr[j]))
              j--;
          else if(Character.toLowerCase(charArr[i]) != Character.toLowerCase(charArr[j])) {
              return false;
          } else {
            i++; j--;
          }
      }
      return true;
  }

}
