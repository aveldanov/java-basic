package com.company;

public class Main {

    public static void main(String[] args) {






printDayOfTheWeek(1);



















        // write your code here


//        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value is 1");
//                break;
//            case 2:
//                System.out.println("Value is 2");
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//
//
//        }

//char ch='A';
//
//switch (ch){
//    case 'A':
//        System.out.println("Found "+ch);
//        break;
//    case 'B':
//        System.out.println("Found "+ch);
//        break;
//    default:
//        System.out.println("there is no "+ch);
//}


    }


    public static void printDayOfTheWeek(int day){

        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid Day");

        }

    }

}

