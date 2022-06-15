import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song of repeat? Y/N");
            String userInput = input.next();
            if (userInput.equals("y") || userInput.equals("Y"))
                isOnRepeat = false;
        }
        System.out.println("Playing Next Song");
    }
}