package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int sum = 0;
    int count = 0;
    for (int i = 1; i <= 100; i++) {

      if ((i % 3 == 0 || i % 5 == 0) && count <= 5) {
          System.out.println("i = " + i);
          System.out.println("Count = " + count);
          System.out.println("Sum = " + sum);
          System.out.println("");
        sum = sum + i;
        count = count + 1;
      }
    }


  }
}
