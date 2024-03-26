package day07stringmanipulations01;

public class StringManipulations04 {
    public static void main(String[] args) {
        /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
           i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
           ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
           iii) Başında ve sonunda boşluk olmamalıdır.
       */

        // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
        String pwd = "   ccc  ";
        boolean first =  pwd.isEmpty();
        System.out.println("first= " + first);    //since password is not empty, it won't print out...

        //ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        //isBlank() method prints out true for Strings which are made of 'spaces'. If we have something rather than space it will be false

        boolean second = pwd.isBlank();
        System.out.println("second = " + second); // if the password is empty, it won't print out...

        /* isBlank() prints out true for empty Strings also
        isBlank()==> Sadece space var ise, hiçbirsey yok ise true olur.
        isEmpty()==> Sadcee hiçbirşey girilmemişse true olur(ex. "").
         */


        ///iii) there must be no spaces at the beginning and at the end.
        //If trimmed version of a string is equal to its original, then the string does not contain any space...
        //But if it is not equal to its original, it means it contains space...

        boolean third = pwd.trim().equals(pwd);
        System.out.println("third = " + third);

        if (first){
            System.out.println("password can not be empty, please enter at least one character");
        }
        if (second){
            System.out.println("password can't be made of spaces only, please enter character(s) rather than space");
        }

        if (!third) {
            System.out.println("please don't enter spaces before or after the characters");
        }
    }
}
