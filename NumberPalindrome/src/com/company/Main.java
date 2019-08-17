package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here


    System.out.println(isPalindrome(687));
  }


  public static boolean isPalindrome(int number) {
    int reverse = 0;
    int lastDigit = 0;
    int initial = number;
    while (number != 0) {
      lastDigit = number % 10; //678 --> 8 -->7
//            System.out.println(lastDigit);

      reverse = reverse * 10 + lastDigit; //80 --> 87;
//
//            System.out.println(reverse);
//            System.out.println("");

      number = number / 10; // 678/10-->67 -->6

    }
//        System.out.println("Number = "+number);
//        System.out.println("Revere = "+reverse);
    return (initial == reverse);

  }
}
