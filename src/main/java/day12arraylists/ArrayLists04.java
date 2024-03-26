package day12arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {
    public static void main(String[] args) {

        //Bir list olusturmanin kisayolu:
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(25);
        list.add(36);
        System.out.println(list);
                        //Yukarida list olusturmanin uzun yolunu verdik...
        List<Integer> list2 = Arrays.asList(12,25,36);
        System.out.println(list2);      //add metodunu kullanmadan olusturduk...

        list2.remove(2);
        System.out.println(list2);      /*Hata verdi. asList metodu remove ile çalışmıyor...
                                        Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.AbstractList.remove(AbstractList.java:167)
	at day12arraylists.ArrayLists04.main(ArrayLists04.java:20)

Process finished with exit code 1 */
        list2.add(63);
        System.out.println(list2);          //eleman de ekleyemedik. add-remove calismiyor...
        list2.clear();
        System.out.println(list2);





    }
}
