//Search for a specific element in an array and break when found.

import java.util.Scanner;
public class ArrayElementSearch {
public static void main(String[] args) {
int[] numbers = {10, 25, 32, 47, 55, 62, 79, 88, 94, 100};
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number to search for: ");
int target = scanner.nextInt();
boolean found = false;
for (int i = 0; i < numbers.length; i++) {
if (numbers[i] == target) {
System.out.println("The number " + target + " was found at index " + i);
found = true;
break;
}
}
if (!found) {
System.out.println("The number " + target + " was not found in the array.");
}
}
}
