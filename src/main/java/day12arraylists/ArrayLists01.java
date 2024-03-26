package day12arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        ArrayList <Integer> ages = new ArrayList<>();
        System.out.println(ages); // []
        //Arraylist'lere eleman eklemek???
        ages.add(3);
        System.out.println(ages);
        ages.add(25);
        System.out.println(ages);   //Insertion order var. en son eklenen en sağda oluyor...
        ages.add(0,7);
        System.out.println(ages);
        ages.add(2,666);
        System.out.println(ages);
        //Arraylist'lere coklu eleman nasıl ekleriz?
        ArrayList<Integer> newAges = new ArrayList<>() ;
        newAges.add(41);
        newAges.add(19);

        newAges.addAll(ages); //ages Arraylist elemanlarını newAges elemanlarına ekleyecek...
        System.out.println(newAges);
        newAges.addAll(2,ages);
        System.out.println(newAges);
        int numOfElement = newAges.size();
        System.out.println(numOfElement);

        int num2 = newAges.get(4);      //auto-boxing oldu. Primitive-non primitive arası kolayca geçiş olur.(Burada wrapper olan Integer ile int arası geçiş oldu)
        System.out.println(num2);       //int daha az yer kaplar, o yüzden Integer(wrapper yerine) int tercih ettik...

        newAges.set(1,79);
        System.out.println(newAges);

        //Example-1: Make an integer Arraylist, replace the odd integers with 11.

        ArrayList <Integer> list = new ArrayList<>();
        list.add(23);
        list.add(25);
        list.add(27);
        list.add(4);
        list.add(56);
        System.out.println(list);

        for (  Integer w     :   list    ) {    //"for each integer w of list" anlamında... :)

            if (w%2==0) {
                continue;
            }else if (w%2!=0)
                list.set(list.indexOf(w),11) ;   //list.indexOf(w),11 ==> uygun sartlari saglayan listin elemanlarini 11 yap...
                }
        System.out.println(list);
            }
        }


