package day12arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Example 2: Tekrarlı elemanlar içeren list'ten sadece tekrarsiz olanlari alarak list yapalim.
        //  [J,a,v,a,i,s,g,o,o,d]
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('J');
        letters.add('a');
        letters.add('v');
        letters.add('a');
        letters.add('i');
        letters.add('s');
        letters.add('g');
        letters.add('o');
        letters.add('o');
        letters.add('d');
        System.out.println(letters);
        List<Character> list2 = new ArrayList<>();
        for (char w : letters) {
            if (!list2.contains(w)) {
                list2.add(w);

            }
        }
        System.out.println(list2);


        //Example 3: Bir String ArrayList oluşturup "a" içeren elemanları silelim...
    //for-each kullandiginizda listlerde eleman sayisini remove ile azaltamayiz... O yuzden for-each kullanamayiz...
/*   List<String> cities = new ArrayList<>();
            cities.add("Ardahan");
            cities.add("Rize");
            cities.add("Mersin");
            cities.add("Ankara");
            cities.add("Mardin");
            cities.add("Adıyaman");
            for (String q : cities ) {
                if (q.contains("a")){
                cities.remove(q);
                System.out.println(cities);
         }
         }
        */
            List<String> cities = new ArrayList<>();
            cities.add("Ardahan");
                    cities.add("Rize");
                    cities.add("Mersin");
                    cities.add("Ankara");
                    cities.add("Mardin");
                    cities.add("Adıyaman");
        System.out.println(cities);
        for (int i = 0; i <cities.size() ; i++) {
            if (cities.get(i).contains("a")){
                cities.remove(i);
                i--;            //for-each kullanirken listlerde eleman sayisi kullanamiyoruz...
            }                   //for-each ile silme islemi varsa, indeksler azalirken ve degisirken; for i ile i++ sayesinde azaltmayi notrledik.
            }
        System.out.println(cities);
        }
    }
