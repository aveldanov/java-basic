public class LargestPrime {


  public static int getLargestPrime(int number) {
    //    if (number <= 1) {
    //      return -1;
    //    }
    //    int prime = 0;
    //    for (int i = number - 1; i >= 2; i--) {
    //      System.out.println("i = " + i);
    //      if (number % i == 0) {
    ////        System.out.println("Number % i = "+ number%i);
    //
    //        prime = i;
    //        number=prime;
    //        System.out.println("prime "+prime);
    //
    //      }else {
    //        continue;
    //      }
    //
    //
    //    }
    //    if (prime==0){
    //      return number;
    //    }
    //    return prime;


    int i;

    for (i = 2; i <= number; i++) {
      if (number % i == 0) { // 45%3==0
        System.out.println("Number % i = " + number +" % "+ i);
        System.out.println("New Number = Number / i = " + number +" / "+ i);

        number = number / i; // 45/3= 15
        System.out.println("New Number = "+number);
        i--; // 3-- => 2;

        System.out.println("i--  = " + i);
        System.out.println("");
      }


    }

    return i;


  }
}
