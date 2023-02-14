package Week2;

public class ifElseStatement {

    public static void main(String[] args) {
        int number = 0;
        if(number > 0){
            System.out.println("the nuber is positive");
        }else{
            System.out.println("the number is not positive...");
        }

        String weather = "";
        if(weather == "rain"){
            System.out.println("I will go to the mall.");
        }else{
            System.out.println("I will go to picnic.");
        }
        if(weather.isEmpty()){
            System.out.println("I will contact with my parent.");
        }else{
            System.out.println("I will make te plan accordingly.");
        }



        System.out.println("This code line is always executed.");

    }

}
