package com.company;

import java.awt.*;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("220B", "Dell", "240", dimensions);
    Monitor monitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
    Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

    PC pc = new PC(theCase, monitor, motherboard);

    pc.getMonitor().drawPixelAt(1500, 1200, "red");

  }
}
