package javapractice;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String priceOfTv = "$456.99";   String priceOfLaptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        String priceOfTv = "$456.99";
        String priceOfLaptop = "$875.99";
        String newPriceOfTv = priceOfTv.replace("$","");
        String newPriceOfLaptop = priceOfLaptop.replace("$","");

        Double totalPrice = Double.valueOf(newPriceOfLaptop)+Double.valueOf(newPriceOfTv);
        System.out.println("totalPrice = " + totalPrice);



    }
}
