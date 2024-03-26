package javapractice;

import java.util.Scanner;

public class FifteenOfAugust {
    public static void main(String[] args) {
        //kullanıcıdan alınan sayı tek mi çift mi?
        //1. way
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num1 = scan.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is an even integer");
        }
        if (num1 % 2 != 0) {
            System.out.println(num1 + " is an odd integer");
        }
        // when there are only 2 conditions, we prefer if-else statements
        //2. way
        if (num1%2==0) {
            System.out.println(num1 + " is an even integer");
        }else{
            System.out.println(num1 + " is an odd integer");
        }

        if (num1>0) {
            System.out.println("it is positive");
        } else if (num1<0) {
            System.out.println("it is negative");
        }else{
            System.out.println("it is a neutral number");
        }
    }

    }
