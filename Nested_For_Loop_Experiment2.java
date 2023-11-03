//Calculate the multiplication table for numbers 1 to 10 using nested for loops.
import java.util.Scanner;
public class NestedMultiplicationTable {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
System.out.println("Multiplication table for " + i + ":");
for (int j = 1; j <= 10; j++) {
int product = i * j;
System.out.println(i + " x " + j + " = " + product);
}
System.out.println();
}
}
}
