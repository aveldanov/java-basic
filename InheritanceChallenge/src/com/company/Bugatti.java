package com.company;

public class Bugatti extends Car {

  private int roadServiceMonths;

  public Bugatti(int roadServiceMonths) {
    super("Bugatti", "4WD", 5, 2, 6, false);
    this.roadServiceMonths = roadServiceMonths;
  }


  public void accelerate(int rate) {
    int newVelocity = getCurretVelocity() + rate;
    if (newVelocity == 0) {
      stop();
      changeGear(1);
    } else if (newVelocity > 0 && newVelocity <= 10) {
      changeGear(1);
    } else if (newVelocity > 10 && newVelocity <= 20) {
      changeGear(2);
    } else if (newVelocity > 20 && newVelocity <= 30) {
      changeGear(3);
    } else {
      changeGear(4);
    }

    if (newVelocity > 0) {
      changeVelocity(newVelocity, getCurrentDirection());
    }
  }


  //private String color;

  //  public Bugatti(String steering, int gears, int speed, String type, int wheels, String color) {
  //    super(steering, gears, speed, type, wheels);
  //    this.color = color;
  //  }
}
