package com.company;

public class Main {

  public static void main(String[] args) {

    Bugatti bugatti = new Bugatti(36);
    bugatti.steer(45);
    System.out.println("");
    bugatti.accelerate(30);
    System.out.println("");
    bugatti.accelerate(20);
      System.out.println("");

      bugatti.accelerate(-42);
  }


}
