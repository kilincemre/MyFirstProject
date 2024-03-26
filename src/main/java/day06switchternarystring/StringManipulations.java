package day06switchternarystring;

public class StringManipulations {
    public static void main(String[] args) {
        String s = "Java is deep of marvel";
        // s String'indeki character sayısı?
        int a= s.length();
        System.out.println(a);

       char firstChar=s.charAt(8);   //index yazdırdık...
        System.out.println(firstChar);

        char lastChar2=s.charAt(s.length()-1); //son karakteri yazdırdık...(last char)
        System.out.println(lastChar2);

        // "s" String'indeki ilk 4 karakteri alalım...
        String s1= s.substring(1,7);
        System.out.println(s1);

        String s3 = s.substring(8,12);
        System.out.println(s3);

        String s4= s.substring(8); //8'den başlayıp sonuna kadar yazdırır.
        System.out.println(s4);

        boolean isExist= s.contains("marvel");
        System.out.println(isExist);

        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        Boolean isEnds = s.endsWith("easy");
        System.out.println(isEnds);
    }

}
