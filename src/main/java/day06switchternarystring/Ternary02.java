package day06switchternarystring;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
       // Scanner input=new Scanner(System.in);
        //System.out.println("Please enter an integer");
        //int a = input.nextInt();

        //Object result= (a>0) ? (a<1000 ? "your number is a 3-digit positive number":"your integer is not three digit")
        //        : (a>-1000 ? "your integer is 3-digit" : "your integer is not 3-digit");
        //System.out.println(result);
        //interview question
        int year = 1664;
        String result3= (year%100==0)?((year%400==0)? "It is leap year" : "It is not a leap year"):(year%4==0 ? "it is leap year":"It is not a leap year" );
        System.out.println(result3);

        //Example : Find out whether the given integer is 3-digit number or not...

        int a = -357;
        a= Math.abs(a);

        String result = a >99 && a<1000 ? "the entered integer is a 3-digit" : "the entered integer is not a 3-digit";
        System.out.println(result);



    }
}
