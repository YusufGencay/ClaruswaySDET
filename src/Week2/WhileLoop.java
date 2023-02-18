package Week2;

public class WhileLoop {
    public static void main(String[] args) {
        int i=0;
        while(i<=5){
            if(i!=3) System.out.println(i);
            i++;
            if(i == 5)
            break;

        }
        while (true) {
            System.out.println("count # " + (i +1));
            System.out.println("Hello, I am infinite.");
            if (i==10)
                break;
            i++;
        }
int x = 0;
        int sum = 0;
                while(x<=10){
                    sum += x;
                    x++;
                }
        System.out.println(sum);
    }
}
