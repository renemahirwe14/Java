//Find the factorial of a number using a while loop.

import java.util.Scanner;
public class FactorialUsingWhileLoop {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = scanner.nextInt();
long factorial = 1;
int i = 1;
while (i <= num) {
factorial *= i;
i++;
}
System.out.println("Factorial of " + num + " is " + factorial);
}
}
