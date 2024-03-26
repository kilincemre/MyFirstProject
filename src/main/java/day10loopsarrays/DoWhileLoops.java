package day10loopsarrays;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        do {
            if (counter == 4) {
                System.out.println("Your account is blocked");              //Lütfen tekrar edelim...
                break;
            }
                System.out.println("Please enter a user name");
                String userName = input.next();
                System.out.println("Please enter a password");
                String password = input.next();

                if (userName.equals("admin") && password.equals("pwd123")) {
                    System.out.println("Welcome to your account");
                    break;
                }
                counter++;
            }while (true) ;

            }
        }

