package day07stringmanipulations01;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

                Double newTv= Double.valueOf(tv.replace("$" , ""));  //.replace ile de yazalım dersten sonra
                Double newLaptop= Double.valueOf(laptop.replace("$",""));
                Double totalPrice = newLaptop + newTv;
        //String newTv= tv.replace("$","");
        //String newLaptop = laptop.replace("$","");
        //Double totalPrice=Double.valueOf(newTv) + Double.valueOf(newLaptop); //Wrapper class oldu burada Double

        System.out.println("totalPrice = " + totalPrice);

        //Example 2:    Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız...
        // "   ali caN   " ==> AC
        //trim()
        String name = "   ali caN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("last= " + last);

        System.out.println(" " + first + last);

        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        // karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail

        String eMail = "abc@gmail.com";
        String wanted= eMail.substring(5, 9);
        System.out.println("wanted = " + wanted); //dynamic olmadı ama:(

        //indexOf() methodu varmış...

        int startingIndex = eMail.indexOf("@")+1;
        int endingIndex = eMail.indexOf(".");
        String companyName = eMail.substring(startingIndex, endingIndex); //ending index dahil edilmiyor seçerken...
        // [,) sol taraf dahil(inclusive), sağ taraf dahil değil(eclusive)...
        System.out.println("companyName = " + companyName);


    }
}

