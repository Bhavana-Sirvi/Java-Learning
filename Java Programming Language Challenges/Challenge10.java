//Create a program to calculate permeter of a rectangle

import java.util.*;
public class Challenge10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();
        System.out.print("Enter value for d: ");
        int d = sc.nextInt();

        int perimeter = (a + b + c + d);
        System.out.println("Perimeter is: " + perimeter + "cm");

    }
}