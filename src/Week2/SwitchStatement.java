package Week2;

public class SwitchStatement {
    public static void main(String[] args) {

        String gender = "malefemale";
        switch(gender){
            case "female":
                System.out.println("This is a girl");
                break;
            case "male" :
                System.out.println("This is a boy");
                break;
            default :
                System.out.println("Please enter valid gender");
        }

    }
}
