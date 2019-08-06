package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int myValue = 10000;


    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Min = " + myMinIntValue);
    System.out.println("Integer Max = " + myMaxIntValue);
    System.out.println("Busted Max value = " + (myMaxIntValue + 1));


    int Max = 2_147_483_647;

    System.out.println(Byte.MAX_VALUE);

    byte myMinByte = Byte.MIN_VALUE;
    byte myMaxByte = Byte.MAX_VALUE;

    short myMaxShort = Short.MAX_VALUE;
    short myMinShort = Short.MIN_VALUE;
  }
}
