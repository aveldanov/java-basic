package com.company;

public class Vehicle {

  private String name;
  private String size;
  private int curretVelocity;
  private int currentDirection;

  public Vehicle(String name, String size) {
    this.name = name;
    this.size = size;
    this.curretVelocity = 0;
    this.currentDirection = 0;
  }


  public void steer(int direction) {
    this.currentDirection = direction;
    System.out.println("Vehicle.steer() at  " + currentDirection + " degrees");
  }

  public void move(int velocity, int direction) {
    this.currentDirection = direction;
    this.curretVelocity = velocity;
    System.out.println("Vehicle.move() at " + curretVelocity + " km/h and " + direction + " degrees");

  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public int getCurretVelocity() {
    return curretVelocity;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public void stop() {
    this.curretVelocity = 0;
  }

  //  private String steering;
  //  private int gears;
  //  private int speed;
  //
  //  public Vehicle(String steering, int gears, int speed) {
  //    this.steering = steering;
  //    this.gears = gears;
  //    this.speed = speed;
  //  }
  //
  //  public void changingGears(int gears) {
  //    System.out.println("You are on " + gears);
  //  }
  //
  //  public void changeSpeed(int speed){
  //    System.out.println("As fast as "+speed+ " ksm/h");
  //  }
}


