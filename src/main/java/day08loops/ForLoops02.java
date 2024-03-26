package day08loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //Verilen bir String'de ilk 'a' harfinden önceki tüm char'lari console'a yazdiralim...
        // I love Java ==> I love J

        String s ="I love Java";

        for (int i = 0; i <s.length()  ; i++) {
            System.out.print(s.charAt(i));          //yanyana yazsın diye "System.out.print" kullanıldı.
                                                      //i=0 yani ilk char'dan i=s.length-1'e kadar yanyana char bastırdık.
                                                        //charAt methodu char basar... çok dikkat lütfen... 
            
        }
        System.out.println();   //yukaridakini ve asagidakini yanyana yazmasin diye bos "sout" yaptik...

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='a'){      // a'yi gordugu anda loop kirilir ve cikti vermez.
                break;                  //BURAYA ÇOK DİKKAT, if break formati bu, if'in ici saglanmadi ve break calismadi, if'in ici true
                                        // "olursa" break calisir
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();
        //BUNDAN DAHA GÜZELİ
        String s2 = "Tramvay";

        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);
            if (ch=='a'){
                break;

            }
            System.out.print(ch);
        }
        System.out.println();
        //Example 2:
        //Verilen bir String'de kucuk harfleri console'a yazdirmayiz.
        //"Pwd12?Ab" ===> P12?A
        String s1 = "Pwd12?Ab";
        for (int i=0; i<s1.length(); i++) {

            char ch = s1.charAt(i);
            if (ch>='a' && ch<='z'){   //kucuk harfler yazdirmayacagimiz icin if-continue a'dan z'ye kadar olan karakterleri basmaz,
                                        // continue der, ama aksi durumlar icin "else" ile a-z araliginda olmayan harfleri cikti verir...
            continue;                   // "continue" loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.
                                        // "continue" loop'u basa dondurur, break gibi kirmaz. else'e de atmaz...
        }else{
                System.out.print(ch);
            }

        }

        //example 3:


    }
}

