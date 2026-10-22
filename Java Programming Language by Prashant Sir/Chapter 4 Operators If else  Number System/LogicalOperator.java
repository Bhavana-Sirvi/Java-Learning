import java.util.*;
public class LogicalOperator {
    public static void main(String args[]) {
        System.out.println("Welcome to ticket discount calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a female? (true/ false)");
        boolean isFemale = sc.nextBoolean();

        if(age < 5) {
            System.out.println("You got 75% discount");
        } else if (isFemale) {
            System.out.println("You got 50% discount");
        } else if(age > 60 && !isFemale) {
            System.out.println("You got 25% discount");
        } else {
            System.out.println("You got no discount");
        }
    }
}