package Week2.Homework;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your Gender: ");
        String gender = scan.nextLine();
        System.out.println("Please enter your Age");
        String age = scan.nextLine();
        System.out.println("Please enter your phone number: ");
        String phone = scan.nextLine();
        System.out.println("Please enter your city: ");
        String city = scan.nextLine();
        System.out.println("Please verify your personal  data: \n" + "Name            : " + name);
        System.out.println("Gender          : " + gender);
        System.out.println("Age             : " + age);
        System.out.println("Phone number    : " + phone);
        System.out.println("City            : " + city);

        System.out.println("Please select an option from below 1 or 2. \n 1 - All given information is correct, \n 2- I need to re-enter my information.");
        int option =scan.nextInt();
        if (option == 1)
            System.out.println("Thanks for your confirmation!");
        else
            System.out.println("Please re-enter the correct information!");


    }
}
