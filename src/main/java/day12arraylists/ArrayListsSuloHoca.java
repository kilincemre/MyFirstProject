package day12arraylists;

import java.util.ArrayList;

public class ArrayListsSuloHoca {
    public static void main(String[] args) {
        // [2,3,1,5,1,3] ==> [2,3,1,5]              put the non-repeating ones to a new ArrayList...

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(5);
        nums.add(1);
        nums.add(3);
        System.out.println(nums + "\n");   //Bir satır boş bırak demek...

        ArrayList<Integer>newNums = new ArrayList<>(); //new and empty arrayList whereby the non-repeating ones will be put in here...

        for ( int     w   :   nums      ) {
            if (!newNums.contains(w)){
                newNums.add(w);
            }
        }
        System.out.println(newNums);

        //***If you can explain the logic of the code during the interview, writing the code may not be asked...
    //Example:2 Type code to increase salaries in list like if the salary is less than 10000, increase it %20 otherwise increase it by adding 500.
        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(98740.0);
        salaries.add(8000.0);
        salaries.add(35400.0);
        salaries.add(4512.0);
        salaries.add(36240.0);
        System.out.println(salaries + "\n");   // "\n" altında bir satır boş bırakır...
        for ( double    w     : salaries  ) {
            if (w<10000) {
                salaries.set(salaries.indexOf(w), w*1.2); //salaries.indexOf(w), w*1.2) ==> tek tek indexleri tarayıp karar verir...
            }else{
                salaries.set(salaries.indexOf(w), w+500);     //set methodu salaries ArrayList'indeki sırasıyla index aldığı yerleri w*1.2 veya w+500 ile değiştirir.
            }
        }
        System.out.println(salaries);
    }


}
