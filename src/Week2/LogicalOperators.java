package Week2;

public class LogicalOperators {
    public static void main(String[] args) {
    if (5>7 && 10>6)
        System.out.println("Grape: ");
    else
        System.out.println("Apple: ");

    if (5>7 && 10<6)
        System.out.println("Grape: ");
    else
        System.out.println("Apple: ");

    if (5<7 && 10>6)
        System.out.println("Grape: ");
    else
        System.out.println("Apple: ");

    if (5<7 && 10<6)
        System.out.println("Grape: ");
    else
        System.out.println("Apple: ");



    //OR Operators

        System.out.println();

        if (5>7 || 10>6)
            System.out.println("Grape: ");
        else
            System.out.println("Apple: ");

        if (5>7 || 10<6)
            System.out.println("Grape: ");
        else
            System.out.println("Apple: ");

        if (5<7 || 10>6)
            System.out.println("Grape: ");
        else
            System.out.println("Apple: ");

        if (5<7 || 10<6)
            System.out.println("Grape: ");
        else
            System.out.println("Apple: ");

//Not Operator

        if ((5>7) && !(10>6))
            System.out.println("Apple");
        else System.out.println("Grape");

        if ((5>7) || !(10>6))
            System.out.println("Apple");
        else System.out.println("Grape");
    }
}
