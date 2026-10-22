import java.util.*;
public class ShorthandOperator {
    public static void main(String args[]) {
        int a = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        a = a + num1;
        a += num1;   //shorthand operator



        System.out.println(a);
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        a = a + num2;
        System.out.println(a);
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();
         a = a + num3;
        System.out.println(a);
        System.out.print("Enter 4th number: ");
        int num4 = sc.nextInt();
        a = a + num4;
        System.out.println(a);
    }
}