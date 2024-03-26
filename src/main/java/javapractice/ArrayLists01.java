package javapractice;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {

        ArrayList < Integer > ages = new ArrayList<>();
        System.out.println(ages);
        ages.add(23);
        ages.add(45);
        System.out.println(ages);
        System.out.println(ages.isEmpty());

    }
}
