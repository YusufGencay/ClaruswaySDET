package Week2.Homework;

/*
9- Write a java program to reverse a given number (user scanner class for user inputs)
input: 45678 , Output: 87654
 */


import java.util.Scanner;

public class ReverseNumber {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the number: ");
    int number = scan.nextInt();
    String stringNumber = null;
    if (number >= -9 && number <= 9) {
        System.out.println("Single-digit number! Can not riverse rhe number!" + number);
    } else {
        stringNumber = String.valueOf(number);
        int reverseNumber = 0;
        for (int i = 1; i <= stringNumber.length(); i++) {
            reverseNumber = number % 10 + (10 * reverseNumber);
            number = number / 10;
            System.out.println(reverseNumber);
        }
    }
    String reverseNumber = "";
    for (int i = stringNumber.length() - 1; i >= 0; i--) {
        reverseNumber = reverseNumber + stringNumber.charAt(i);
    }

    System.out.println("Reverse number is: " + reverseNumber);
}
}



