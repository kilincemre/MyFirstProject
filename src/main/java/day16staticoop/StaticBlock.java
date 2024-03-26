package day16staticoop;

import java.time.LocalDate;

public class StaticBlock {
    static double pi; //değer atamak zorunda değilim...

    //Bir variable  olusturdugunzda deger atamazsaniz o variable i initialize etmediniz demektir
    //Gereksinimlere gore bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekir
    //bu yüzden static block lar kullanilir
    //static variable lar static block lar icinde initialize edilirse o class in icinde herseyden once hazir hale getirilmis olur

    public static int price;

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");

    }
    static {
        pi = 3.14;
        System.out.println("static block 1");       //önce static block çalıştı... altta da üstte de olsa önce o çalışır...
    }

    static {
        LocalDate cuurentDate = LocalDate.now();
        if (cuurentDate.getMonthValue()==2) {
            price = 1000;
        }else{
        }   price=2000;
    }
}
