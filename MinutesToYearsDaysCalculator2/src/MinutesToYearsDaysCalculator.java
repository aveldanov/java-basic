public class MinutesToYearsDaysCalculator {



  public static void printYearsAndDays(long minutes){
    if(minutes<0){
      System.out.println("Invalid Value");
    }else{

      long year = minutes/60/24/365;
      long reminder =minutes/60/24 - year*365;

      System.out.println(minutes + " min = "+ year+" y and "+ reminder +" d");

    }
  }

}
