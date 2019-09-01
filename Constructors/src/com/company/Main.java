package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here

    BankAccount bankAccount1 = new BankAccount();
    BankAccount bankAccount2 = new BankAccount();
    BankAccount bankAccount3 = new BankAccount("123", 130, "Anton", "test@test.com", "408-12345");
    BankAccount bankAccount4 = new BankAccount();
    bankAccount1.setAcctNumber("123");
    bankAccount2.setAcctNumber("456");
    //    System.out.println(bankAccount1.getAcctNumber());

    bankAccount1.setBalance(100);
    bankAccount1.depositFunds(10);
    bankAccount1.withdrawFunds(5);
    //    bankAccount1.withdrawFunds(200);
    System.out.println(bankAccount1.getBalance());

    System.out.println(bankAccount3);
    System.out.println(bankAccount3.getBalance());

    System.out.println(bankAccount4.getBalance());


    BankAccount bankAccount5 = new BankAccount("Tim","Email","1234");

    System.out.println(bankAccount5.getAcctNumber());
    System.out.println(bankAccount4.getAcctNumber());
  }
}
