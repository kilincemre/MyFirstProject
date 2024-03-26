package day05ifelseswitchternary;

//import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        /*Ask from user to enter one of the names of a week, then the code will print out its order in a week.
        Sunday ==>1
        Monday ==>2
        Wednesday ==>3
        Thursday ==>4
        Friday ==>5
        Saturday ==>6
        Sunday ==>7
         */

        //1. Way
        //Scanner input = new Scanner(System.in);
        //System.out.println("please enter a name day");
        //String nameOfDay = input.next();
        String nameOfDay = "Monday";      //Scanner Class yerine bu şekilde String satırına isim yazarak da sonuç alırız.

        if(nameOfDay.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        } else if (nameOfDay.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (nameOfDay.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (nameOfDay.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (nameOfDay.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (nameOfDay.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (nameOfDay.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        }else{
            System.out.println("you have entered an invalid word");
        }
        //2.Way
        switch (nameOfDay.toLowerCase()){
            case "sunday" :
                System.out.println(1);
                break;
            case "monday" :
                System.out.println(2);
                break;
            case "tuesday" :
                System.out.println(3);
                break;
            case "wednesday" :
                System.out.println(4);
                break;
            case "thursday" :
                System.out.println(5);
                break;
            case "friday" :
                System.out.println(6);
                break;
            case "saturday" :
                System.out.println(7);
                break;
            default:
                System.out.println("You have entered an invalid word");
        }
    }

}
