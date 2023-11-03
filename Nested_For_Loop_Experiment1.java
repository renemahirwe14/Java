//Print a pattern of stars in the form of a right-angled triangle using nested for loops.

import java.util.Scanner;
public class RightAngleTrianglePattern {
public static void main(String[] args) {
int rows = 5;
for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}
}
