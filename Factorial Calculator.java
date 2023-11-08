//This program finds the Factorial of given numbers. 5 as example here. 
public class FactorialCalculator {
    public long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        int number = 5;
        long factorial = calculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
