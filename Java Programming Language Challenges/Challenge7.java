//Swap two numbers

import java.util.*;
public class Challenge7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        
        int temp = first;
        first = second;
        second = temp;

        System.out.println("Swapping done..");
        System.out.println("Value of first number is: " + first);
        System.out.println("Value of second number is: " + second);

    }
}