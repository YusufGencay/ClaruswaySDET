package Week2;

import java.sql.SQLOutput;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        //INCREMENT...
        int numA = 3;
        numA = numA+ 5;// --> numA = 8
        System.out.println(numA);
        numA= 3;
        numA += 5; // --> numA = 8
        System.out.println(numA);


        int numB= 2;
        numB = numB * 4;
        System.out.println(numB);// output--> 8
        numB *= 4;
        System.out.println(numB); // output --> 32

        int numC = 7;
        numC++;
        System.out.println(numC);
        int numD = 15;
        numD++;
        System.out.println(numD);

        //DECREMENT...

        System.out.println("  ");

        int numE = 6;
        numE = numE-3;
        System.out.println(numE); // -->3

        numE-= 2;
        System.out.println(numE); // --> 1


        int numF =15;
        numF = numF/5;
        System.out.println(numF); // --> 3

        numF /= 3;
        System.out.println(numF);// --> 1


        int numG = 9;
        numG--;
        System.out.println(numG);// --> 8



    }



}
