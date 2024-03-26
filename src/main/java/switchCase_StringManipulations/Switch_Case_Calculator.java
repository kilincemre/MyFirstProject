package switchCase_StringManipulations;

import java.util.Scanner;

public class Switch_Case_Calculator {
    public static void main(String[] args) {
        /*Java Program to Make a Simple Calculator Using Switch Case
This calculator would be able to add, subtract, multiply and divide two numbers.
For example:
1 - Add
2 - Subtract
3 - Multiply
4 - Divide
Choose Operator: 1
Enter first number: 10
Enter second number: 20
Result is : 30 */
        int operator, n1, n2;        // our operator and our numbers are defined as numbers.
        System.out.println("1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide \n 5 - Modulus");
        System.out.println("Please choose one of the above mentioned operators");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Please enter first number");
        n1 = sc.nextInt();
        System.out.println("Please enter second number");
        n2 = sc.nextInt();

        int result =0;
        switch(operator){
            case 1:
                result = n1 + n2;
            break;
            case 2:
                result = n1 - n2;
            break;
            case 3:
                result = n1 * n2;
            break;
            case 4:
                result = n1 / n2;
            break;
            case 5:
                result = n1 % n2;
            break;
            default:
                System.out.println("you have entered an invalid operator");

        }
        System.out.println("result = " + result);
    }
}
