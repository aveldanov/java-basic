package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    byte myByteValue = 15;
    short myShortValue = 1000;

    int myIntValue = 10000;

    long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

    System.out.println(myLongValue);


    short shortTotal = (short) (1000 + 10 * (myByteValue + myIntValue + myLongValue));
  }
}
