import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // 1. generate random number
        int randomNumber = (int) (Math.random() * 100) + 1;

        // 2. run the loop K (tries) times and ask user about the number each time
        int tries = 5;
        System.out.println("Guess the number from 1 to 100.");
        System.out.println("You have 5 tries to guess the number");

        Scanner sc = new Scanner(System.in);
        boolean result = false;

        while (tries > 0) {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            // 3. based on the user input give the feedback
            if (number == randomNumber) {
                System.out.println("You guess the CORRECT NUMBER: " + randomNumber);
                System.out.println("You WIN !!!");
                result = true;
                break;

            } else if (number > randomNumber) {
                System.out.println("Your guess is HIGH. You have " + (tries - 1) + " chances left to guess the number.");
                tries--;

            } else {
                System.out.println("Your guess is LOW. You have " + +(tries - 1) + " chances left to guess the number.");
                tries--;

            }
        }

        if (result == false) {
            System.out.println("You loose the game.");
        }
    }
}
