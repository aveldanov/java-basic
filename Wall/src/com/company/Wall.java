package com.company;

public class Wall {

  private double width;
  private double height;

  public Wall() {
    System.out.println("Empty Constructor");

  }


  public Wall(double width, double height) {
    if (width < 0&& height>0) {
      this.width = 0;
      this.height = height;
    }

    if (height < 0&& width>0) {
      this.height = 0;
      this.width = width;
    }

    if(height<0&&width<0){
      this.width=0;
      this.height=0;
    }

    if (width >= 0 & height >= 0) {
      this.width = width;
      this.height = height;

    }

//    System.out.println("My width = " + this.width);

  }

  public double getWidth() {
//    System.out.println("Crazy width " + width);
    return width;
  }

    public void setWidth(double width) {
      if (width < 0) {
        this.width = 0;
      } else {
        this.width = width;
      }
    }

  public double getHeight() {
    return height;
  }

    public void setHeight(double height) {
      //    System.out.println("Set height = " + height);
      if (height < 0) {
        this.height = 0;
        //      System.out.println("Assgignt height = " + this.height);
      } else {
        this.height = height;

      }

    }

  public double getArea() {
    return this.height * this.width;
  }
}
