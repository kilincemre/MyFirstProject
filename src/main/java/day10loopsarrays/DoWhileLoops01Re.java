package day10loopsarrays;

import java.util.Scanner;

public class DoWhileLoops01Re {
    public static void main(String[] args) {
        /*valid username=admin, valid password= "pwd123";
        1)get username and password from user
        2)If they are correct, print out "Welcome to your account"
        3)If they are entered wrongly for at most 4 times, "Please enter your username and password
        4)If they are entered wrongly 4th time, "Your account has been blocked" will appear...
         */
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        do {                    //sifre ve username girme islemleri do-while ile yapilabilir...
            if (counter==4){
                System.out.println("your account has been blocked");
                break;
            }                                   //ıf-break kırma kodu oldu burada

            System.out.println("Please enter username");
            String userName = scan.next();
            System.out.println("Please enter password");
            String pwd = scan.next();

            if (userName.equals("admin") && pwd.equals("pwd123")){
                System.out.println("welcome to your account");
            break; //bunu dememizin sebebi, zaten username ve pwd dogru ise, burada bitsin, dogru degilse asagida devam etsin...
        }
            counter++;
        }while (true);      // eger buraya kadar olan koda bakarsak sonsuz loop oldu, sonsuz kere username ve password soruyor.
        //buradaki true bizi while-do'nun basina goturur...


    }
}
