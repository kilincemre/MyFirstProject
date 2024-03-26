package practice02;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {
        /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num1 = scan.nextInt();
        if (num1<0){
            System.out.println("you have entered a negative integer");
        } else {                //else if ile yazılabilir mi?
            if (num1 < 10) {

            System.out.println("you have entered a digit");        //çizerek draw yaparak çalışalım buna yeniden...
        }else{
                System.out.println("you have entered a positive integer");
            }
        }
    }
}
