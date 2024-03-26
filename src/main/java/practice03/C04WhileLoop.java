package practice03;

import java.util.Scanner;

public class C04WhileLoop {
    public static void main(String[] args) {
        //   for (int i = 0; i < ; i++) {
                    //  while (condition) {
        /*Kullanici sisteme sayi girsin
        bsalngic sayisinidan itibaren 10'un katina gelene kadar ardisik sayilar yazdiralim...
        use while loop
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter an integer");
        int num1 = scan.nextInt();

        while (num1%10!=0){

            System.out.print(num1 + " ");
            num1++;

        }
    }
}
