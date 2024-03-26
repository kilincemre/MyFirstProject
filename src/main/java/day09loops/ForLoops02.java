package day09loops;

public class ForLoops02 {
    public static void main(String[] args) {

        //Example: verilen sayida ondalik kisimdaki rakamkarin toplamini bulalim...
        //  28.587 ==> 5+8+7=20
        //ondalikli kismi alabilmek için stringe cevirmeliyiz...
        double num=28.574;
        String sNum = String.valueOf(num);

        //Stringe cevirmis oldugumuz sayiyi split() metodu ile bolerek ondalil kismi aliriz.
        String decimalPart = sNum.split("[.]")[1];

        int intDecimalPart = Integer.valueOf(decimalPart);

        int sum = 0;
        for (int i = intDecimalPart; i >0 ; i=i/10) {
            sum = sum + i%10;
            
        }
        System.out.println(sum);
    }
}
