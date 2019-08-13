package com.company;

public class Main {

  public static void main(String[] args) {
//    System.out.println(calculateInterest(10000, 2));
//
//    for (int i = 8; i > 1; i--) {
//      System.out.println(calculateInterest(10000, i));
//    }

//  printNum(50);


      System.out.println(isPrime(9973));

  }

  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100));
  }


  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n) ; i++) {
        System.out.println("i = "+i+ " vs n= "+n+" n%i = "+n%i);
      if (n % i == 0) {

        return false;
      }
    }
    return true;

  }

public static void printNum(int n){
    int count=0;

    for(int i=10;i<=Math.sqrt(n);i++){
//          System.out.println(i);

          if(isPrime(i)){
              System.out.println(i);
              System.out.println("count = "+count);

              count=count+1;
              if(count==10){
                  break;
              }
          }
      }

}


}
