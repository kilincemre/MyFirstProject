package GeneralReview;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        String a = "Memo";
        String b = "Memo";

        System.out.println(a.equals(b));

        String c = "SELAMAYDOKTOR HACI";
        System.out.println(c.charAt(c.length() - 1));

        String toTheEnd = c.substring(4);
        System.out.println(toTheEnd);
        System.out.println(c.substring(3,7));
        System.out.println(c.substring(0,1));
        int indexOfLastName = (c.indexOf(" ") + 1);
        System.out.println(c.substring(indexOfLastName, indexOfLastName + 1));

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name");

        String nameOfUser = scan.nextLine();

        String initialOfFirstName1 = nameOfUser.substring(0,1);
        int indexOfLastName1 = nameOfUser.indexOf(" ") + 1;
        String initialOfLastName1 = nameOfUser.substring(indexOfLastName1, indexOfLastName1 + 1);
        System.out.println(initialOfFirstName1 + initialOfLastName1);
        nameOfUser.indexOf("li");



    }
}
