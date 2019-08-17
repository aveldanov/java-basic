public class EvenDigitSum {


  public static int getEvenDigitSum(int number) {

    if(number<0){
      return -1;
    }


    int sum = 0;
    while (number != 0) {
     int digit = number % 10; // 687 --> 7
//      System.out.println("int number "+number);

      if (digit % 2 == 0) {
//        System.out.println("Even Number "+digit);
        sum = sum + digit;
        number = number / 10;
      }else {
//        System.out.println("not even");
        number=number/10;
      }
//      System.out.println("out number "+number);
//      System.out.println("");

    }
    return sum;


  }

}
