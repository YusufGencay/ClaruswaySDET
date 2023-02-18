package Week2;

public class NestedFor {
    public static void main(String[] args) {
        /**
         * Neser Loops
         * It is also possible to place a loop inside another loop. This is called a nested loop.
         * The"inner loop" will be executed one time for each iteration of the "outer lopp"
         */

        //outer loop
        for(int i=1; i<=3; i++){
            System.out.println("Outer Loop : " + i);

            //Inner Loop
            for(int j = 1; j<=5; j++){
                System.out.println("inner Loop : " + j);
            }
            System.out.println("Here is in outer loop");
        }


    }
}
