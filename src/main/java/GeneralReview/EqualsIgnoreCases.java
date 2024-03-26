package GeneralReview;

import java.util.Scanner;

public class EqualsIgnoreCases {
    //Java created another method to compare two strings, the method will ignore the cases(upper or lower).
    //According to that method MoNdAy or monDAY or MONdAY will be the same.
    // we also remember that method name must be relevant wit the function of method.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter one df the days of a week");
        String dayName = input.next();
 /*       if (dayName.equalsIgnoreCase("monday") || (dayName.equalsIgnoreCase("tuesday"))
                || (dayName.equalsIgnoreCase("wednesday")) || (dayName.equalsIgnoreCase("thursday")) ||
                (dayName.equalsIgnoreCase("friday"))) {
            System.out.println("weekday");
        } else {
            System.out.println("you entered an invalid word");

            if (dayName.equalsIgnoreCase("sunday") || (dayName.equalsIgnoreCase("saturday"))) {
                System.out.println("weekend day");
            } else {
                System.out.println("you entered an invalid word");
            }
*/
            boolean isWeekDay = dayName.equalsIgnoreCase("monday") ||
                                dayName.equalsIgnoreCase("tuesday") ||
                                dayName.equalsIgnoreCase("wednesday") ||
                                dayName.equalsIgnoreCase("thursday") ||
                                dayName.equalsIgnoreCase("friday");
            if (isWeekDay) {
                System.out.println("weekday");
            }

            boolean isWeekEndDay = dayName.equalsIgnoreCase("sunday") ||
                                   dayName.equalsIgnoreCase("saturday");
            if (isWeekEndDay) {
                System.out.println("weekend day");
            }
        }
    }

