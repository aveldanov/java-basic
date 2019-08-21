public class DiagonalStar {


  public static void printSquareStar(int number) {

    String str = "";

    //    str += "Z";
    //    System.out.println(str);


    int row = 0;
    int column = 0;
    while (row < number) {
      column = 0;
      while (column < number) {
//        System.out.println("my column = " + column);
//        System.out.println("my row = "+row);
        if ((column > 0 && row >0 && column<number-1) && (row == column || row == number - column - 1)) {
          str += "B";
        } else {
          str += "X";

        }
        column++;
      }
      System.out.println(str);
      System.out.print("");
      str = "";
      row++;


    }
    //    System.out.println(str);


  }

}
