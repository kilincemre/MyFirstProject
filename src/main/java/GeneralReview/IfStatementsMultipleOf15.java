package GeneralReview;

import java.util.Scanner;

public class IfStatementsMultipleOf15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a positive integer");
        int num1=scan.nextInt();

        if (num1 %3==0 && num1 %5==0) {
            System.out.println("your number is multiple of 15");
        }else if (num1 %3==0) {
            System.out.println("your number is multiple of 3");
        }else if (num1 %5==0) {
            System.out.println("your number is multiple of 5");
        }
            else {
                System.out.println("the number you entered is neither divisible by 3 nor 5");
        }
    }
}
