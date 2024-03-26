package javapractice;

import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        /* Get name of a month from user and make it print out the number of the corresponding month

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter one of the months");
        String nameOfMonth = scan.next().toLowerCase();
        switch(nameOfMonth) {       //nameOfMonth.toLowerCase()) burada da, yukarıda da uygulanabilir... Burada ignorecase kullanılamaz çünkü eşitlik yok
            case "january":         //çıkış string olursa ignorecase yapabiliriz.
                System.out.println(1);
                break;
            case "february":
                System.out.println(2);
                break;
            case "march":
                System.out.println(3);
                break;
            case "april":
                System.out.println(4);
                break;
            case "may":
                System.out.println(5);
                break;
            case "june":
                System.out.println(6);
                break;
            case "july":
                System.out.println(7);
                break;
            case "august":
                System.out.println(8);
                break;
            case "september":
                System.out.println(9);
                break;
            case "october":
                System.out.println(10);
                break;
            case "november":
                System.out.println(11);
                break;
            case "december":
                System.out.println(12);
                break;
            default:
                System.out.println("you have entered an invalid word");

        }
    }
}
