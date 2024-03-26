package javapractice;

import java.util.Scanner;

public class SwitchPractice {

    public static void main(String[] args) {
        /* User will enter the number of a day of a week, then it will see the corresponding day
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number of day that you want to see");
        int numOfDay = scanner.nextInt();

        //if-else-if ile...
        if (numOfDay==1) {
            System.out.println("monday");
        } else if (numOfDay==2) {
            System.out.println("tuesday");
        } else if (numOfDay==3) {
            System.out.println("wednesday");
        } else if (numOfDay==4) {
            System.out.println("thursday");
        } else if (numOfDay==5) {
            System.out.println("friday");
        } else if (numOfDay==6) {
            System.out.println("saturday");
        } else if (numOfDay==7) {
            System.out.println("sunday");
        }else{
            System.out.println("you have entered an invalid number, please try again...");
        }

        /*using switch method
        switch (numOfDay){
            case 1:
                System.out.println("monday");// "case 1:" it means when the case is 1, which means if numOfDay is equal to 1, then it will print out "monday"
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                    System.out.println("you have entered an invalid number, please try again...");
*/
             //make it print out only week days
                switch(numOfDay){
                    case 1:
                        System.out.println("monday");
                    case 2:
                        System.out.println("tuesday");
                    case 3:
                        System.out.println("wednesday");
                    case 4:
                        System.out.println("thursday");
                    case 5:
                        System.out.println("friday");
                    case 6:
                        System.out.println("saturday");
                    case 7:
                        System.out.println("sunday");
                       break;
                    default:
                        System.out.println("you have entered an invalid number, please try again...");


                }

        }
    }

