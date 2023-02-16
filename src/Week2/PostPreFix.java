package Week2;

public class PostPreFix {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println("Postfix a++" + a++ + a);
        System.out.println("Prefix ++b" + ++b + b);
        //Jaa is executing from left to right in the same line and top to bottom.
        // If there is a string or text and then int or any number continue in the same code line Java converting /casting int to Sting.
a = 7;
b = 3;
        System.out.println(a++ + a + "Postfix a++");
        System.out.println(++b + b + "Prefix ++b");


    }

    void sum (int x, int y) {
        int a = 0;
        int b = 0;
        System.out.println(x + y);
    }
}
