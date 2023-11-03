//Find the sum of numbers entered by the user until they enter a negative number.

import java.util.Scanner;
public class SumUntilNegative {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int sum = 0;
int number;
System.out.println("Enter numbers to calculate the sum. Enter a negative number to stop.");
while (true) {
System.out.print("Enter a number: ");
number = scanner.nextInt();
if (number < 0) {
break; // Exit the loop if a negative number is entered.
}
sum += number;
}
System.out.println("Sum of the entered numbers: " + sum);
}
}
