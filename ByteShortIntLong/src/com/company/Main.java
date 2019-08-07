package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    byte myByteValue = 15;
    short myShortValue = 1000;

    int myIntValue = 10000;

    long myLongValue = 50000 + 10 * (myByteValue + myShortValue + myIntValue);

    System.out.println(myLongValue);
  }
}
