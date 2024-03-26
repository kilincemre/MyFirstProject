package day07stringmanipulations01;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun    //boolean lengthControl = pwd.length()>=8;
                        ii)Space characteri password'de olmasin //boolean spaceControl = !pwd.contains(" ");
                        iii)En az bir tane buyuk harf olsun //boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length>0;
                        iv)En az bir tane kucuk harf olsun  //boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length>0;
                        v)En az bir tane rakam olsun    //boolean digitcontrol = pwd.replaceAll("[^0-9]","").length>0;
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your password...");
        String pwd = scan.nextLine();
        boolean lengthControl =pwd.length()>=8;
        System.out.println("lengthControl= " + lengthControl);
        boolean spaceControl = !pwd.contains(" ");
        System.out.println("spaceControl= " + spaceControl );

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length()>=1; //bu tarz arka arkaya manipulations yani metod kullanarak
        System.out.println("upperCaseControl = " + upperCaseControl);                     //yaptığımız çoklu işleme method chain(methodlar zinciri) denir.

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]" , "").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        boolean digitControl= pwd.replaceAll("^[0-9]", "").length()>0;
        System.out.println("digitControl = " + digitControl);

        boolean result = lengthControl && upperCaseControl && lowerCaseControl && digitControl;
        if (result) {
            System.out.println("your password is eligible for the requirements");
        }else{
            System.out.println("your password doesn't satisfy the requirements");
        }

    }
}
