package com.company;

public class Kitchen {
  private int stove;
  private int dishwasher;


  public Kitchen(int stove, int dishwasher) {
    this.stove = stove;
    this.dishwasher = dishwasher;
  }


  public void cleanKitchen() {
    System.out.println("Kitchen is cleaned");
  }

  public int getStove() {
    return stove;
  }

  public int getDishwasher() {
    return dishwasher;
  }
}
