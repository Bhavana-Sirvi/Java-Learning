public class IfElseBlock {
    public static void main(String args[]) {
        // boolean isMale = false;
        // String name = "Bob";
        // System.out.println("Before if");

        // if(isMale) {
        //     System.out.println("Mr." + name);
        // } else {
        //     System.out.println("Ms." + name);
        // }
        // System.out.println("After if");


        // else if ladder 
        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;

        if(isSeniorCitizen) {
            System.out.println("Hello senior citizen");
        } else if(isAnAdult) {
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello child");
        }
    }
}