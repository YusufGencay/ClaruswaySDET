package Week1;

import java.util.Locale;

public class NonprimitiveDataType {
    public static void main(String[] args) {
        String name = "Adem";
        System.out.println("NAME : " + name);
        System.out.println("name variables length is " + name.length() + ".");
        int nameLength = name.length();
        System.out.println("name's length : " + nameLength);

        /**
         * Java counts positions from zero.
         * 0 is the first position in a string, 1 is the second, 2 is the third ...
         */
//                    012345
        String txt = "Clarusway Sdet Course.";
        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println("This is the first s index number : " +txt.indexOf("s"));
        System.out.println("This is the second s index number : " +txt.indexOf("s", txt.indexOf("s") +1 ));
        System.out.println(txt.indexOf("way"));
        System.out.println(txt.indexOf("A"));




        name = "Jack";

    }


}
