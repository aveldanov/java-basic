public class SecondsAndMinutesChallenge {

  public static long getDurationString (long min,long sec){
    if(min<0 || (sec<0|| sec>59)){
      System.out.println("Invalid value");
      return -1;
    }
    long hour=min/60;
    min=min-hour*60;
    System.out.println(hour+"hr "+min+"min "+sec+"sec");
    return 10;
  }


  public static long getDurationString (long sec){
    if(sec<0){
      System.out.println("Invalid value");
      return -1;
    }
    long min=sec/60;
    long remimderSeconds=sec%60;
    return getDurationString(min,remimderSeconds);
  }

}
