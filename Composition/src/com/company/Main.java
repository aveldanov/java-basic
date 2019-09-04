package com.company;

import java.awt.*;

public class Main {

  public static void main(String[] args) {
    // write your code here

    //    Dimensions dimensions = new Dimensions(20, 20, 5);
    //    Case theCase = new Case("220B", "Dell", "240", dimensions);
    //    Monitor monitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
    //    Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
    //
    //    PC thePc = new PC(theCase, monitor, motherboard);
    //
    //    thePc.powerUp();

    //
    //    Kitchen kitchen=new Kitchen(1,1);
    //    House house = new House(2, "Big", kitchen);
    //    house.openDoor();
    //
    //    house.leaveHouse();


    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");

    Ceiling ceiling = new Ceiling(12, 55);
    Bed bed = new Bed("Cool", 3, 11, 2, 3);

    Lamp lamp = new Lamp("Classic", false, 5);

    Bedroom bedroom = new Bedroom("Anton's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);


    bedroom.makeBed();
    bedroom.getLamp().turnOn();

  }
}
