package javapractice;

public class String01 {
    public static void main(String[] args) {
        String s1 = "Work*hard";
        System.out.println(s1.charAt(0));

        System.out.println(s1.charAt(5));

        System.out.println(s1.charAt(s1.length() - 1));  //son char'ı bulmak için...

/*        if (s1.length() % 2 != 0) {
            System.out.println(s1.charAt((s1.length() - 1) / 2)); //ortanca char için
        } else {

            System.out.println("the expression you entered has no median character...");
*/
            String s2 = "Teacher learns";       //String methodları temporary change yaparlar, permanent değişiklik yapmazlar...
            System.out.println(s2.concat(" better than learners...")); //concat method

            //3rd method
            String s3="learn java, get rich";
            if (s3.contains("s")) {
                System.out.println("expression you have entered contains 's'...");
            }else{
                System.out.println("expression you have entered does not contain 's'...");
            }
            //or
        System.out.println(s3.contains("k"));       //true-false statement oldu...      //contains() methodu boolean return eder...
        System.out.println(s3.contains("learn"));
    }
    }