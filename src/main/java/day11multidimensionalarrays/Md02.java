package day11multidimensionalarrays;

public class Md02 {
    public static void main(String[] args) {
        //Example: İki boyutlu bir array'i tek boyutlu bir array'e nasıl ceviririz?
        int numbers [][]= {{5,4}, {2,3,2}};
        //1. step : iki boyutlu array'de kac eleman oldugunu bulan kodu yazalim
    int toplamElemanSayisi=0;
        for ( int [] w : numbers) {
        toplamElemanSayisi = toplamElemanSayisi + w.length;

        }
        System.out.println(toplamElemanSayisi);
        //2. step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayısını kullanark olustururuz...
        int newArr []=new int [toplamElemanSayisi];

        //3. Step : iki boyutlu array'deki elemanları iki boyutlu array'e ceviririz...
    }
}
