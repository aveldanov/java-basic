public class NumberToWords {


  public static void numberToWords(int number) {

    if (number < 0) {
      System.out.println("Invalid Value");
    }

    int reversed = reverse(number);
//    System.out.println("Reversed Number = " + number);
    int count = getDigitCount(number);

    while (count > 0) {

      int lastDigit = reversed % 10;

      switch (lastDigit) {
        case 0:
          System.out.println("Zero");
          break;
        case 1:
          System.out.println("One");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        case 5:
          System.out.println("Five");
          break;
        case 6:
          System.out.println("Six");
          break;
        case 7:
          System.out.println("Seven");
          break;
        case 8:
          System.out.println("Eight");
          break;
        case 9:
          System.out.println("Nine");
          break;
        default:

          break;
      }
      reversed=reversed/10;
            count--;
    }
  }


  public static int reverse(int number) {


    int reversed = 0;
    while (number != 0) {
      reversed = number % 10 + reversed * 10; // 678->8+0 --> 7+80=87--> 6+870=876
      number = number / 10; //678--> 67 --> 6
    }
    return reversed;
  }

  public static int getDigitCount(int number) {
    if (number < 0) {
      return -1;

    }
    int count = 0;
//    while (number !=0) {
//      number = number / 10;
//      count++;
//    }
    do{
        count++;
        number=number/10;
    }while (number!=0);



    return count;
  }


}
