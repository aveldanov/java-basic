package com.company;

public class VipCustomer {
  private String name;
  private int creditLimit;
  private String email;

  public VipCustomer() {
    this("John", 150, "email@mail");
    System.out.println("Constructor 1");
  }

  public VipCustomer(int creditLimit, String email) {
    this("Name", creditLimit, email);
    System.out.println("Constructor 2");

  }


  public VipCustomer(String name, int creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
    System.out.println("Constructor 3");

  }



}
