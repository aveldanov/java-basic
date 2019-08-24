package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int min = 0;
    boolean first = true;

    while (true) {
      System.out.println("Enter number: ");
      boolean hasNextInt = scanner.hasNextInt();
      if (hasNextInt) {
        int number = scanner.nextInt();
        if(first){
          min=number;
          first=false;
        }


        if (number > max) {
          max = number;
        }
        if (number < min) {
          min = number;
        }


        System.out.println("You entered: " + number);
      } else {
        System.out.println("Invalid Number");
        break;
      }
      scanner.nextLine();


    }

    System.out.println("Max = " + max);
    System.out.println("Min = " + min);
    scanner.close();

  }
}
