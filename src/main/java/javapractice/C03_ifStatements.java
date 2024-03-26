package javapractice;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a day name");
        String nameOfDay=scan.next().toLowerCase();
        boolean isWeekDay = nameOfDay.equals("monday") || nameOfDay.equals("tuesday") || nameOfDay.equals("wednesday") ||
                nameOfDay.equals("thursday") ||nameOfDay.equals("friday");
        boolean isWeekendDay = nameOfDay.equals("saturday") || nameOfDay.equals("sunday");

        if (isWeekDay) {
            System.out.println("you entered a week day ");
        }else if (isWeekendDay){
            System.out.println("you entered a weekend day");
        }else{
            System.out.println("please enter name of the days of a week");
        }
    }
}
