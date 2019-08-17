package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(sumDigit(125));
  }

  public static int sumDigit(int number) {

  if(number>=0){
    return  number%10+sumDigit((number)/10); //687-7/10=680

  }
    return -1;

  }


}
