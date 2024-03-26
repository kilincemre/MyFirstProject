package day09loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        int i = 3;
        while (i < 6) {
            System.out.println(i);
        }
                // yeniden calimak lazim

        int k = 23;
        while (k > 11) {

            if (k % 2 == 0) {
                System.out.println(k);

            }
            k--;
        }
        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int  h = 313;
        //Sayiyi index() ile tersleyebilmek için stringe cevirdik.
        String m = String.valueOf(h);
        String reversed = "";

    }
}
