public class GreatestCommonDivisor {


  public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10) {
      return -1;
    }
    int max = Math.max(first, second);
    int divider = 0;
    System.out.println("Max = "+max);
    for (int i = max; i > 0; i--) {
      if ((first % i == 0) && (second % i == 0)) {
        System.out.println("i = "+i);
        divider = i;
        break;
      }else {
        continue;
      }


    }
    System.out.println(divider);
    return divider;
  }
}
