package GeneralReview;

import java.util.Scanner;
            //Ask user to enter a password, if the initial is uppercase, then check if it is 'A' or not.
            //If it is 'A' the output will be "Valid Password", otherwise output will be "invalid password"

            //If the initial of the password is lowercase, then check if it is 'z' or not.
            //If it is 'z', the output will be "valid password", otherwise it will be "invalid password"
public class NestedIfStatement01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a password...");
        String pwd1 = scan.nextLine();   //In case of user enters space or more words

        if (pwd1.charAt(0)>='A' && pwd1.charAt(0)<='Z'){
            if (pwd1.charAt(0)=='A'){
                System.out.println("valid password");
            }
            else{
                System.out.println("invalid password");
            }
        }
        if (pwd1.charAt(0)>='a' && pwd1.charAt(0)<='z'){
            if (pwd1.charAt(0)=='z'){
                System.out.println("valid password");
            }
            else{
                System.out.println("invalid password");
            }
        }

    }
}
