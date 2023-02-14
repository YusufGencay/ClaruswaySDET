package Homework;

import java.util.Scanner;

public class FridayHomework {

    public static void main(String[] args) {

//1) Type a program which calculates the area and the perimeter of a square
//whose side length is entered by user.
//Hint 1: Area of a square is length x
//length Hint 2: Perimeter of a square is
//4x length

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter one side length of square: ");



        int length = scan.nextInt();
        int area;

        area = length * length;

        System.out.println("This is the area of the square: " + area);

        int perimeter = 4 * length;

        System.out.println("This is the perimeter of the square: " + perimeter);



        // Type a program which calculates the cube of a number which is
        //entered by user.
        //Hint 1: Cube of a number is a x a x a
        System.out.println("Please enter a number for a cube calculation: ");

        int cube = scan.nextInt();

        cube = length * length * length;

        System.out.println("This is the cube of the number you hae entered: " + cube);


        //Type a program which calculates the area and the perimeter of a
        //rectangle whose length and with are entered by user.
        //Hint 1: Area of a rectangle is width x length
        //Hint 2: Perimeter of a rectangle is 2x (width + length)

        System.out.println("Please enter the length and the width of the rectangle: ");
        int length1 = scan.nextInt();
        int width1 = scan.nextInt();
        int area1 = length1 * width1;

        int perimeter1 = length1 + length1 + width1 + width1;

        System.out.println("This is the area of the rectangle: "+area1 + "\nThis is the perimeter of the rectangle: "+ perimeter1);

        //  Type a program which calculates the volume of a rectangular
        //prism whose length, with, and height are entered by user.
        //Hint 1: Volume of a rectangular prism is width x length x height

        System.out.println("Please enter width, length and, height of the rectangular prism: ");
        int length2 = scan.nextInt();
        int width2 = scan.nextInt();
        int height = scan.nextInt();

        int volume = length2 * width2 * height;

        System.out.println("This is the volume of the rectangular prism: " + volume);

        // Type a program which calculates the area and the perimeter of a circle
        //whose radius is entered by user. (Use float)
        //Hint 1: Take pi number as 3.14159
        //Hint 2: Area of a circle is 3.14159 x radius x radius
        //Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
        //Hint 4: To get float, use nextFloat()

        System.out.println("Please type in the radius of the circle: ");

        int radius = scan.nextInt();
        float pi = 3.14159f;
        float area3 = pi * radius * radius;
        float perimeter3 = pi * 2 * radius;

        System.out.println("This is the area of the circle: " + area3 + "\nThis is the perimeter of the circle: " + perimeter3);


        //









    }

}
