package Week2.Homework;

import java.util.Scanner;

public class wednesday {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scan.nextInt();
        if (number >= -9 && number <=9 ){
            System.out.println("Single digit number! Can not reverse the number" + number);
        }else {
            String stringNumber = String.valueOf(number);


            int reverseNumber = 0;
            for (int i = 1; i <= stringNumber.length(); i++) {
                reverseNumber = 0;
                reverseNumber = number % 10 + (10 * reverseNumber);
                number = number / 10;
            }
            System.out.println("Reverse Number is : " + reverseNumber);
        }
    }

}
