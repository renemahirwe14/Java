//Calculate the average of numbers entered by the user.

import java.util.Scanner;
public class AverageCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int sum = 0;
int count = 0;
int number;
do {
System.out.print("Enter a number (or 0 to finish): ");
number = scanner.nextInt();
if (number != 0) {
sum += number;
count++;
}
} while (number != 0);
if (count > 0) {
double average = (double) sum / count;
System.out.println("Average of entered numbers: " + average);
} else {
System.out.println("No numbers entered.");
}
}
}
