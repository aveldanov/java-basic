package com.company;

public class House {

  private int rooms;
  private String entrance;
  private Kitchen kitchen;

  public House(int rooms, String entrance, Kitchen kitchen) {
    this.rooms = rooms;
    this.entrance = entrance;
    this.kitchen = kitchen;
  }

  public void openDoor() {
    turnKey();
    System.out.println("Door is opened");
  }

  public void leaveHouse(){
    kitchen.cleanKitchen();
    System.out.println("Left the house");

  }

  private void turnKey(){
    System.out.println("Key is turned");
  }


}
