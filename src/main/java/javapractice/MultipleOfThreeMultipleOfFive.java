package javapractice;

import java.util.Scanner;

public class MultipleOfThreeMultipleOfFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int enteredNumber = scan.nextInt();

        for (int i = enteredNumber ; i>0 ; i--) {
            System.out.print(i +" ");

            if (i%3==0){
                System.out.println("Java ");
            }else if (i%5==0) {
                System.out.println("is nice ");
            }else if (i%3==0 && i%5==0) {
                System.out.println("Java is Nice ");
            }
        }
    }
}
