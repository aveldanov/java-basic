package com.company;

public class Dog extends Animal {
  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  public Dog(String name,   int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight);
    this.eyes=eyes;
    this.legs=legs;
    this.tail=tail;
    this.teeth=teeth;
    this.coat=coat;
  }
  private void chew(){
    System.out.println("Dog.chew() was called");
  }

  @Override
  public void eat() {
    System.out.println("Dog.eat() was called ");
    chew();
    super.eat();
  }


  public void walk(){
    System.out.println("Dog.walk() was called");
    move(5);
  }

  public void run(){
    System.out.println("Dog.run() was called");
    move(10);
  }

  public void moveLegs(int speed){
    System.out.println("Dog.moveLegs() called");
  }

  @Override
  public void move(int speed) {
    System.out.println("Dog.move() called");
    moveLegs(speed);
    super.move(speed);
  }
}
