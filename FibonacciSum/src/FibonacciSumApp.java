import java.util.Scanner;

public class FibonacciSumApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting range for the Fibonacci series: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending range for the Fibonacci series: ");
        int end = scanner.nextInt();

        if (start > end || start < 0) {
            System.out.println("Invalid input. Please ensure the starting range is non-negative and less than or equal to the ending range.");
        } else {
            long sum = FibonacciSum.sumFibonacciSeriesInRange(start, end);
            System.out.println("Sum of Fibonacci Series within the range: " + sum);
        }

	}

}
