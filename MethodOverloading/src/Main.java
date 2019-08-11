public class Main {
  public static void main(String[] args) {

    calcFeetAndInchesToCentimeter(6, -1);
    calcFeetAndInchesToCentimeter(8);

//    int newScore = calculateScore("john", 500);
//    System.out.println(newScore);
//    calculateScore(75);
//    calculateScore();

  }

  public static double calcFeetAndInchesToCentimeter(double feet, double inch) {
    if (feet < 0 || inch < 0 ||inch>12 ) {
      System.out.println("Invalid");
      return -1;
    }
    else {
      double inches = feet * 12 + inch;
      return inches * 2.54;
    }

  }

  public static double calcFeetAndInchesToCentimeter(double inch) {
    if (inch < 0) {
      return -1;
    } else {
      System.out.println(inch / 12);

      return inch / 12;
    }
  }


//  public static int calculateScore(String playerName, int score) {
//    System.out.println("Player " + playerName + " scored " + score + " points");
//    return score * 1000;
//  }
//
//  public static int calculateScore( int score) {
//    System.out.println("Unnamed  scored " + score + " points");
//    return score * 1000;
//  }
//
//  public static int calculateScore() {
//    System.out.println("Unnamed  scored no points");
//    return 0;
//  }

}
