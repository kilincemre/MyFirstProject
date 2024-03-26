package day02variables;

import java.util.Scanner;

public class C03_ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter from alphabet ");
        char letter=scan.next().charAt(0);      // to get data as char from user, we use this...
        System.out.println(letter);

    }
}
