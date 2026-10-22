// Create a program to calculate the area of triangle.

import java.util.*;
public class Challenge11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double areaOfTriangle = (base * height)/2;
        System.out.println("Area of triangle is: " + areaOfTriangle + "cms2");
    }
}