package Week2.Homework;

public class Pryamid2 {
    public static void main(String[] args) {

        /* Program to print full pyramid using *
result should be like this;
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
        int stars = 1;
        int space = 8;
         for(int i=1; i<=5; i++) {
             for (int j = 1; j <=space ; j++) {
                 System.out.print(" ");
             }
             for(int k = 1; k<=stars; k++) {
                 System.out.print("* ");
             }
             System.out.println();
             stars +=2;
             space -=2;
        }

    }
}
