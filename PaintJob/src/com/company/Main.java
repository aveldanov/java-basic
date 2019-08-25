package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here

    //    int result = getBucketCount(3.4, 2.1, 1.5, 2);
//    int result = getBucketCount(7.25, 4.3, 2.35);
    int result = getBucketCount(6.26, 2.2);

    System.out.println(result);
  }


  public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    double areaToPaint = 0;
    double areaCanPaint = 0;
    int bucketsNeeded = 0;

    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
      return -1;
    }
    areaToPaint = height * width;
    //    System.out.println(areaToPaint);
    areaCanPaint = areaPerBucket * extraBuckets;
    //    System.out.println(areaCanPaint);

    if (areaToPaint > areaCanPaint) {
      bucketsNeeded = (int) ((areaToPaint - areaCanPaint) / areaPerBucket + 1);

    }

    return bucketsNeeded;
  }

  public static int getBucketCount(double width, double height, double areaPerBucket) {
    double areaToPaint = 0;
    double areaCanPaint = 0;
    int bucketsNeeded = 0;


    if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
      return -1;
    } else {
      areaToPaint = height * width;

      if (areaToPaint > areaCanPaint) {
        bucketsNeeded = (int) ((areaToPaint - areaCanPaint) / areaPerBucket + 1);

      }

      return bucketsNeeded;
    }


  }

  public static int getBucketCount(double area, double areaPerBucket) {
    double areaToPaint = area;
    double areaCanPaint = 0;
    int bucketsNeeded = 0;


    if (area <= 0 || areaPerBucket <= 0) {
      return -1;
    } else {

      if (areaToPaint > areaCanPaint) {
        bucketsNeeded = (int) ((areaToPaint - areaCanPaint) / areaPerBucket + 1);

      }

      return bucketsNeeded;
    }


  }


}
