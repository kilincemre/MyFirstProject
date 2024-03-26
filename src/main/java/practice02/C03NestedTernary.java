package practice02;

import java.util.Scanner;

public class C03NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first integer");
        int num1 = input.nextInt();
        System.out.println("please enter second integer");
        int num2 = input.nextInt();
        Object result = num1==num2 ? ("the integers you have entered are equal") : (num1>num2 ? "num1 is greater" : "num2 is greater" );

        System.out.println(result);



    }
}
