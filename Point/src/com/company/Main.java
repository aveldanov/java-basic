package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Point first = new Point(-1, 1);
        Point second = new Point(1, -1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

    }
}
