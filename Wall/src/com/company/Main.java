package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Wall wall = new Wall(1.125, -4);

    System.out.println("width= " + wall.getWidth());
    System.out.println("height= " + wall.getHeight());
    System.out.println("area= " + wall.getArea());
  }
}
