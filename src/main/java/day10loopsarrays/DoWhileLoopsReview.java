package day10loopsarrays;

import java.util.Scanner;

public class DoWhileLoopsReview {
    public static void main(String[] args) {
        /* Valid username="admin" , Password="pwd123"'tür.
        Get username and password from user...
        If username and password are correct, print out "welcome to your account".
        If username or password is wrong, user will have 4 attempts at max. For each mistake, "Enter your correct username and password"
        will be seen on the console. If it happens 4 times, "your account has been blocked" will appear on the console.
         */
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        do {
            if (counter == 4) {
                System.out.println("Your account has been blocked");
                break;
            }

            System.out.println("Please enter your username");           //since we wanted code to work without any condition, we chose do-while...
            String userName = scan.next();
            System.out.println("Please enter your password");
            String password = scan.next();

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("welcome to your account");         //user has to be in after entering correct username and password.
                break;                                                 //We need break to be out of the loop.
                //"break" keyword works if the condition is there. (break, ancak if çalışırsa sout'dan sonra çalışır, yoksa çalışmaz...
            }
            counter++;
        } while (counter < 5);         //şifreyi yanlış girince bizi yukarı götürsün diye while(true) uyguladık. Eğer while(false) olsaydı.
       // } while (true);               //if-break bizi zaten dışarı atınca while(false) da döngüyü bitirirdi. Ama while(true) başa döndürüyor.
        }           //her ikisi de oluyor
    }

