package GeneralReview;

import java.util.Scanner;

public class IfStatementsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your score");
        double score = scan.nextDouble();
        if (score >= 50) {
            System.out.println("congratulations!!! You passed...");
        } else {
            System.out.println("Unfortunately, you failed");
        }
    }
}
