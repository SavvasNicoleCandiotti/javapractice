import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "A kitten";
        String b = "A puppy";
        String c = "A tadpole";
        boolean answer = false;
        Scanner input = new Scanner(System.in);

        while (answer == false) {
            System.out.println("I have a question ... is a baby frog called  a:" + a + " b:" + b + " or c:" + c);
            String userInput = input.next();
            if (userInput == "c") {
                answer = true;
            }
            // else
            // System.out.println("Try again");
        }

        System.out.println("Correct!");
        // String userInput = input.next();
        // if (userInput != c) {
        // System.out.println("No, try again");
        // } else {
        // answer = true;
        // System.out.println("Correct");
        // }

    }
}