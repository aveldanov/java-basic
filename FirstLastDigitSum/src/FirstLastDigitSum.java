public class FirstLastDigitSum {

  public static int sumFirstAndLastDigit(int number) {

    if (number < 0) {
      return -1;
    }else if(number<10){
      return number*2;
    }
    int firstDigit = 0;
    int lastDigit = number % 10;
    while (number != 0) {

      number = (number - number % 10) / 10; //678 - 8 /10 =67 --> 67-7/10
      if(
              number==0
      ){
        break;
      }
      firstDigit=number;
      System.out.println(number);

    }



    return firstDigit+lastDigit;

  }
}
