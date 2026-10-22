//calculate simple interest

import java.util.*;
public class Challenge12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amt: ");
        int principal = sc.nextInt();
        System.out.print("Enter time: ");
        float time = sc.nextFloat();
        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();

        float simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple interest is: " + simpleInterest);
    }
}
