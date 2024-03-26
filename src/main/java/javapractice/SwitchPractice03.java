package javapractice;

import java.util.Scanner;

public class SwitchPractice03 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter name of month...");
        String nameOfMonth = scan.next();

        switch(nameOfMonth.toLowerCase() ){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("It has 31 days");
                break;
            case "february":
                System.out.println("It has 28 or 29 days");
                break;
                case "april":
                case "june":
                case "september":
                case "november":
                System.out.println("It has 30 days");
                break;
            default:
                System.out.println("you have entered an invalid word");

        }


    }
}
