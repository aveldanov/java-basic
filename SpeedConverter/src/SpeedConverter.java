public class SpeedConverter {

  public static long toMilesPerHour (double kilomPerHour){
    if(kilomPerHour<0){
      return -1;
    }
long milesPerHour = Math.round(kilomPerHour/1.609);
return milesPerHour;
  }

}
