package Week1;

import java.sql.SQLOutput;

public class EscapeSequences {
    public static void main(String[] args) {
        /**
         * Strings= SpecialCharacters
         * Because strigs must be written within quotes, Java will misunderstand this string, and generate an error.
         * String txt = "We are the so-called "ikings from the north.";
         * The solution to aoid this problem is, to use the backlash escape character.
         * The backslash(\) escape character turns special characters into string characters:
         *
         * Escape character        Result Description
         * \'           '    Single quote
         * \"           "    Double quote
         * \\           \   Backslash
         *
         * Code Result
         * \n   New Line
         * \r   Carriage Return
         * \t   Tab
         * \b   Backspace
         * \f   Form Feed
         */

        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);
        String txt1 = "I\'m learning \"Java\" course.";
        System.out.println(txt1);
        System.out.print("This is :\n first line\n");
        System.out.println("This is the second line");

        /** \t is givingtab space
        This is:    first line  This is second line
         */

        System.out.println("This is :\tfirst line\t This is the second line");
        System.out.println("I am using \\ back slash.");

        System.out.println("Welcome to \'CLARUSWAY SDET COURSE\'.");
        System.out.println("\nThis is starting in a new line.\n");
    }


}
