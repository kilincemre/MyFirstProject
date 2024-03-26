package day15stringbuilderaccessmodifier;

public class Sb01 {
    public static void main(String[] args) {
        //Imutable String
        String s = "Java";
        String t = s + " is nice";

        String a="money";
        a = a + " more";
        System.out.println(a);

        //Mutable
        StringBuilder sb1= new StringBuilder("python");
        sb1.append("i");

        //Mutable string üretmenin 2. yolu
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Java is good...");
        System.out.println(sb2);
        sb2.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb2);
        System.out.println(sb2.capacity());

        //Default capacity degisebilir...

        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali can");
        System.out.println(sb3);
        System.out.println(sb3.capacity()); // 2*3+2 =8 oldu



    }

}
