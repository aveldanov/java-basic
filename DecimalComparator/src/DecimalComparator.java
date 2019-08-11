public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    System.out.println((int)(num1*1000));
    System.out.println((int)(num2*1000));

    System.out.println((int)(num1*1000));

    System.out.println((int)num1*1000);


    if ((int)(num1*1000)-(int)(num2*1000)== 0) {
      return true;
    }else {
      return false;
    }

  }
}
