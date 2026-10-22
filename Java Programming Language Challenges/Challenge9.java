// Create a program to calculate product of two floating points numbers.

import java.util.*;
public class Challenge9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2nd number: ");
        float num2 = sc.nextFloat();

        float product = (num1 * num2);
        System.out.println("Product of 2 floating number is: " + product);
    }
}