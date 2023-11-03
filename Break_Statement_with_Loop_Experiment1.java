//Use a for loop to find the first prime number in a given range.

import java.util.Scanner;
public class FirstPrimeNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the range (e.g., 1 to N): ");
int N = scanner.nextInt();
for (int number = 2; number <= N; number++) {
boolean isPrime = true;
for (int i = 2; i < number; i++) {
if (number % i == 0) {
isPrime = false;
break;
}
}
if (isPrime) {
System.out.println("The first prime number in the range is: " + number);
break;
}
}
}
}
