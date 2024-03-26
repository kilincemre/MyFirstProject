package day05ifelseswitchternary;

import java.util.Scanner;

public class Switch01 {
        public static void main(String[] args) {
            /* Switch() yöntemi if-else-if ile aynı işi yapar.
            It is easily written and more readable.
            If we have more than 2 conditions, instead of if-else-if we can use switch() method.
             */

            /* Let the user enter number of days of a week and our code shall print corresponding day of the week*/
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter number of the day of the week");
            int day = scan.nextInt();
            //If else if
            if (day==1) {
                System.out.println("Monday");
            }else if (day==2)  {
                System.out.println("Tuesday");
            } else if (day==3) {
                System.out.println("Wednesday");
            } else if (day==4) {
                System.out.println("Thursday");
            } else if (day==5) {
                System.out.println("Friday");
            } else if (day==6) {
                System.out.println("Saturday");
            } else if (day==7) {
                System.out.println("Sunday");
            }else{
                System.out.println("you have entered an invalid number");
            }
//using switch() statement
            switch (day){
                case 1:
                    System.out.println("monday");
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
                    System.out.println("please enter a valid number");
            }

        }
        }

