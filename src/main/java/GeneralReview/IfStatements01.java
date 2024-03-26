package GeneralReview;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two integers as a and b");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b) {
            System.out.println("fenerbahce is champion");
        }else{
            System.out.println("galatasaray is champion");

        }
    }
}
