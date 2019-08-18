public class PerfectNumber {


  public static boolean isPerfectNumber(int number){
    if(number<1){
      return false;
    }
    int sum=0;
    for(int i=1;i<number;i++){
      if (number%i==0){
        System.out.println("Divisor = "+i);
        sum=sum+i;
        System.out.println("Sum = "+sum);
      }
    }
    if(sum==number){
      return true;
    }else{
      return false;
    }

  }
}
