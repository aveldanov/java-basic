package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



        System.out.println(isEvenNumber(6));

        int number =4;
        int finishNumber=20;
        int count=0;


        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){

                continue;
            }
            System.out.println("Even Number "+ number );

            count++;
            if(count>=5){
                break;
            }

        }
        System.out.println("Count "+ count );


    }



    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

}
