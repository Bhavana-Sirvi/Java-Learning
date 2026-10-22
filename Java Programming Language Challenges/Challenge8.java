//Using Arithmetic operator

import java.util.*;
public class Challenge8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition is: " + (num1 + num2));
        System.out.println("Subtraction is: " + (num1 - num2));
        System.out.println("Multiplication is: " + (num1 * num2));
        System.out.println("Division is: " + (num1 / num2));
        System.out.println("Remainder is: " + (num1 % num2));
    }
}