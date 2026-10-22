// Convert fahrenheit to celsius
//important question
import java.util.*;
public class Challenge14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to tempreture converter..");
        System.out.print("Enter your temp in F: ");
        float fah = sc.nextFloat();
        float cel = (fah - 32) * 5.0f / 9.0f;
        System.out.println("Your tempreture is: " + cel + "C");
    }
}