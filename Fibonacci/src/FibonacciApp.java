import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();
		Fibonacci.FibonacciNo(n);

	}

}
