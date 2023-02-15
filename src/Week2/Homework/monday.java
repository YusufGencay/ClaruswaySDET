package Week2.Homework;

import java.util.Scanner;

public class monday {
    public static void main(String[] args) {
        //Homework-1
        //write a program that annual earning
        //           Perfect start for work => =>100
        //           Good start for work => 80 ~ 99
        //           Average start for work => 70 ~ 79
        //           below average start for work => 60 ~ 69
        //           Not acceptable =>  0 ~ 59
        //*please just use if-else staement}
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your annual earning: ");
        int salary = scan.nextInt();

        if(salary >=100){
            System.out.println("Perfect");
        }  else if (salary >=80) {
            System.out.println("Good");
        } else if (salary >= 70) {
            System.out.println("Average");
        } else if (salary>= 60) {
            System.out.println("Below Average");
        } else {
            System.out.println("Not Acceptable");
        }


    }


}
