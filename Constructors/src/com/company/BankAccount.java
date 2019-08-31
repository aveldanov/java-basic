package com.company;

public class BankAccount {

  private String acctNumber;
  private double balance;
  private String customerName;
  private String customerEmail;
  private String customerPhone;

  public BankAccount() {
    this("9876", 250, "john", "rr", "123-555555");
    System.out.println("Empty Constructor called");
  }

  public BankAccount(String acctNumber, double balance, String customerName, String customerEmail, String customerPhone) {
    this.acctNumber = acctNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhone = customerPhone;
    System.out.println("BankAccount Constructor with parameters called");
  }

  public String getAcctNumber() {
    return acctNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setAcctNumber(String acctNumber) {
    this.acctNumber = acctNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public void depositFunds(double fund) {

    this.balance += fund;

  }

  public void withdrawFunds(double fund) {
    if ((this.balance - fund) >= 0) {
      this.balance += fund;
    } else {
      System.out.println("Not enough funds");
    }


  }


}
