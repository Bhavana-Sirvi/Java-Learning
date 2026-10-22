// Find compound interest

import java.util.*;
public class Challenge13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amt: ");
        int principal = sc.nextInt();
        System.out.print("Enter time: ");
        float time = sc.nextFloat();
        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();

        double compoundInterest = principal * Math.pow((1 + rate / 100), time);
        System.out.println("Compound interest is: " + compoundInterest);
    }
}