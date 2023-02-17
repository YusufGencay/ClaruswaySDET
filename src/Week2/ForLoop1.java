package Week2;

public class ForLoop1 {
    public static void main(String[] args) {

        for (int i = 4; i > 1; i--){
            System.out.println(i);
        }
        for(int i = 1; i < 101; i++){
            System.out.print(i + "-");
        }

        for(int i = 1; i <= 10; i++){
            System.out.println("The value i is: " + i);
        }
        // print the even numbers until 50.
        System.out.print("Even numbers are : ");
        for(int i = 0; i < 51; i++){
           if(i % 2 == 0) System.out.print(i + "-");
        }
        System.out.println();
        System.out.println();
        // print the time from 0 to 24 and add the morning (0-12) noon(12), afternoon (12-17), night (17-24)
        for(int time = 0; time <= 24; time++){
            if(time < 12){
                System.out.print(time + " Morning -");
            }else if(time == 12){
                System.out.println();
                System.out.println(time + " Noon");
            }else if(time <= 17){
                System.out.print(time + " Afternoon -");
            }else if (time == 18) {
                System.out.println();
                System.out.print(time + "Night -");
            }else
                System.out.print(time + " Night -");

        }


    }
}
