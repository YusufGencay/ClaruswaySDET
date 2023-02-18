package Week2.Homework;

import Week2.ForExamples;

public class Pyramid {
    public static void main(String[] args) {

        for(int i=1; i < 6; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" *  *  *  *  *  *  ");
         for (int i = 5; i > 0; i--){

             for (int j = 1; j <= i; j++ ){
                 System.out.print(j + " * ");
             }
             System.out.println();
         }

         for (int i = 1; i <= 5; i++){

             for(int j =1; j <= i; j++){
                 System.out.print(j + " ");
             }
             System.out.println();
         }
         for (int i = 5; i>0; i--){
             for (int j = 1; j <=i; j++){
                 System.out.print(j + " ");
             }
             System.out.println();
         }

        //System.out.println((char)(65 + j)); //A, 65 - B, 66 - C,67 - D,68
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}
