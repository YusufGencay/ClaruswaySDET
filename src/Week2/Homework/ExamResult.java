package Week2.Homework;

import java.util.Scanner;

public class ExamResult {
    //Homework-2
    //assign int mid term exam result between 0-100, int mtExam
    //then assign final exam result between 0-100, int
    //then calculate mid term exam of %40,and final exam %60,
    //if it is more than 70, print result as "Passed".
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Mid Term Exam Result(0-100): ");
        int midTerm = scan.nextInt();
        System.out.println("Please enter Final Exam Results(0-100): ");
        int finalExam = scan.nextInt();
        int termScore = (int) ((midTerm * .40) + (finalExam * .60));

        if(termScore>=70){
            System.out.println("You have passed the term with the score of: " + termScore);
        }else{
            System.out.println("You Failed");
        }
    }
}
