package com.company;

public class Car {

  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;

  public void setModel(String model) {
    String valModel = model.toLowerCase();
    if (valModel.equals("carrera") || valModel.equals("commodore")) {
      this.model = model;
    } else {
      this.model = "Unknown";
    }
  }

  public String getModel() {
    return this.model;
  }

}

