public class SharedDigit {


  public static boolean hasSharedDigit(int num1, int num2) {
    if (num1 > 99 || num2 > 99 || num1 < 10 || num2 < 10) {
      return false;
    }

    int num1FirstDigit = num1 / 10 ;
    System.out.println(num1FirstDigit);
    int num1LastDigit = num1 % 10;
    System.out.println(num1LastDigit);
    int num2FirstDigit = num2 / 10;
    System.out.println(num2FirstDigit);
    int num2LastDigit = num2 % 10;
    System.out.println(num2LastDigit);

    return (num1FirstDigit == num2FirstDigit || num1FirstDigit == num2LastDigit || num1LastDigit == num2FirstDigit || num1LastDigit == num2LastDigit);

  }

}
