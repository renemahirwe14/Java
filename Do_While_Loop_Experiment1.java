//Guess the number game using a do-while loop.

import java.util.Scanner;
public class NumberGuessingGame {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int secretNumber = 42;
int guess;
do {
System.out.print("Guess the number (1-100): ");
guess = scanner.nextInt();
if (guess < secretNumber) {
System.out.println("Try a higher number.");
} else if (guess > secretNumber) {
System.out.println("Try a lower number.");
} else {
System.out.println("Congratulations! You guessed the number.");
}
} while (guess != secretNumber);
}
}
