package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scanner = new Scanner(System.in);

    int counter = 1;
    int sum = 0;


    while (counter < 5) {

      System.out.println("Enter number #" + counter + ":");
      boolean hasNextInt = scanner.hasNextInt();

      if (hasNextInt) {
        int number = scanner.nextInt();
        System.out.println("Here is your number " + number);
        System.out.println("");
        sum = sum + number;
        counter++;

      } else {
        System.out.println("Invalid number");
      }
      scanner.nextLine();


    }

    System.out.println("Sum equals "+sum);
    scanner.close();

  }
}
