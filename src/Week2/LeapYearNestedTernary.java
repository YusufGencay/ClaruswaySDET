package Week2;

import java.util.Scanner;

public class LeapYearNestedTernary {
    public static void main(String[] args) {
        /*Question 1:
        Type java code by using nested ternary.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.*/

        Scanner scan = new Scanner((System.in));
        System.out.println("Please enter the current year");
        int year = scan.nextInt();
//Solution 1
        if(year % 4 == 0){
            System.out.println("the current year is a leap year.");
        }else System.out.println("This is not a leap year.");

//Solution 2
        String result;
        result = ((year % 4 == 0)) ? "This is a leap year." : "This is not a leap year";

        System.out.println(result);
//Solution 3
        int result1;
        result1 = (year % 4 ==0) ? 4: -1;
        if (result1 == 4) System.out.println("Leap Year");
        else System.out.println("Not Leap Year");




    }


}
