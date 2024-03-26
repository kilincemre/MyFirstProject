package day12arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Example: Bir tane Integer List olusturalim...
        //  Bu listte birbirine en yakin iki tamsayiyi yazdiralim...
        //[12,35,24,47,51] ===> 12,15
        List<Integer> numList = new ArrayList<>();
        numList.add(36);
        numList.add(35);
        numList.add(24);
        numList.add(47);
        numList.add(15);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);

        int minDiff = numList.get(1) - numList.get(0);         //bos olarak assign ederek basladik, diger turlu zor oluyor...
        for (int i = 0; i < numList.size()-1; i++) {
            minDiff = Math.min(minDiff,numList.get(i+1) - numList.get(i));
            }
        System.out.println(minDiff);
        for (int i = 0; i < numList.size()-1; i++) {
        if (numList.get(i+1) - numList.get(i)==minDiff){
            System.out.println(numList.get(i) + " and " + numList.get(i+1));
        }
        }
        }
    }

