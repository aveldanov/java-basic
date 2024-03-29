package com.company;

public class Motherboard {
  private String model;
  private String manufacturer;
  private int ramSlots;
  private int crardSlots;
  private String bios;

  public Motherboard(String model, String manufacturer, int ramSlots, int crardSlots, String bios) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.ramSlots = ramSlots;
    this.crardSlots = crardSlots;
    this.bios = bios;
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getRamSlots() {
    return ramSlots;
  }

  public int getCrardSlots() {
    return crardSlots;
  }

  public String getBios() {
    return bios;
  }

  public void loadProgram(String programName){
    System.out.println("Program "+ programName+" is now loading...");
  }


}
