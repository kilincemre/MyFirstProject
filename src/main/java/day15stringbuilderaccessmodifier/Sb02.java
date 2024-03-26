package day15stringbuilderaccessmodifier;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        sb1.reverse();
        System.out.println(sb1);

        sb1.delete(0,4);
        System.out.println(sb1);

        sb1.replace(1,3,"vaaaaaaayyyy");
        System.out.println(sb1);

        StringBuilder sb4 = new StringBuilder("sami");
        StringBuilder sb5 = new StringBuilder("hami");
        System.out.println(sb4.compareTo(sb5));  // s ve h arasındaki ascii kodlar arası farkı verir.  sb4 - sb5 hesaplıyor.

        //Stringbuilder nasıl String olur?

        String str2 = sb4.toString().toUpperCase(); //toString metodu StringBuilder'i String'e cevirir. Because String class is rich...
        System.out.println(str2);

        //String nasıl StringBuilder'a ceviririz?
        StringBuilder sb6 = new StringBuilder(str2);  //String olan str2, StringBuilder olan sb6'ye cevirildi.

        //StringBuffer olusturmak...
        StringBuffer sbf = new StringBuffer("java is fun");












        int result = sb1.compareTo(sb1);


    }
}
