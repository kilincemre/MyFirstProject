package day12arraylists;

import java.util.ArrayList;

public class ArrayListsSuloHocaRepeat {
    public static void main(String[] args) {
        //***If you can explain the logic of the code during the interview, writing the code may not be asked...
        //Example:2 Type code to increase salaries in list like if the salary is less than 10000, increase it %20 otherwise increase it by adding 500.

        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(12500.0);
        salaries.add(32600.0);
        salaries.add(7500.0);
        salaries.add(24000.0);
        salaries.add(6000.0);
        salaries.add(9000.0);
        System.out.println(salaries);

        for (double w : salaries) {
            if (w<1000) {
                salaries.set(salaries.indexOf(w), w * 1.2);
            }else{
                salaries.set(salaries.indexOf(w), w+500);
            }

        }
        System.out.println(salaries);
    }

}
